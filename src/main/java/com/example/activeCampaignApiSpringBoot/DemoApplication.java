package com.example.activeCampaignApiSpringBoot;

import com.example.activeCampaignApiSpringBoot.convert.JsonConverter;
import com.example.activeCampaignApiSpringBoot.http.Http;
import com.example.activeCampaignApiSpringBoot.model.configuration.ConfigurationApi;
import com.example.activeCampaignApiSpringBoot.model.contact.request.ContactContainer;
import com.example.activeCampaignApiSpringBoot.model.contact.response.Contact;
import com.example.activeCampaignApiSpringBoot.model.contact.response.ContactCreateResponse;
import com.example.activeCampaignApiSpringBoot.model.contactlist.request.ContactList;
import com.example.activeCampaignApiSpringBoot.model.contactlist.request.ContactListContainer;
import com.example.activeCampaignApiSpringBoot.model.response.Response;
import com.example.activeCampaignApiSpringBoot.reader.ConfigApiReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    Response home() {
        return new Response(200, "Hello World v1.1!!");
    }

    @PostMapping("/createorupdatecontact")
    @CrossOrigin(origins = {"http://localhost:3000", "https://kurstestowania.pl", "https://www.kurstestowania.pl"})
    @ResponseBody
    Response createorupdatecontact(@RequestBody ContactContainer contact) {
        ConfigurationApi configurationApi = new ConfigApiReader().getConfigApi();
        Contact contact1 = new Contact();
        contact1.setId("0");
        ContactCreateResponse contactCreateResponse = new ContactCreateResponse();
        contactCreateResponse.setContact(contact1);
        Http http = new Http(configurationApi);
        Response response = new Response(200, "OK");
        try {
            okhttp3.Response okHttpResponse = http.post("/api/3/contact/sync", JsonConverter.toJsonString(contact));
            response.setResponse(okHttpResponse.message());
            response.setStatusCode(okHttpResponse.code());
            contactCreateResponse = JsonConverter.fromJSON(okHttpResponse.body().string(), ContactCreateResponse.class);
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setResponse(e.getMessage());
        }
        ContactList contactList = new ContactList();
        contactList.setContact(Integer.parseInt(contactCreateResponse.getContact().getId()));
        contactList.setList(1);
        contactList.setStatus(1);
        ContactListContainer contactListContainer = new ContactListContainer();
        contactListContainer.setContactList(contactList);
        try {
            okhttp3.Response okHttpResponse = http.post("/api/3/contactLists", JsonConverter.toJsonString(contactListContainer));
            response.setResponse(okHttpResponse.message());
            response.setStatusCode(okHttpResponse.code());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setResponse(e.getMessage());
        }
        return response;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
