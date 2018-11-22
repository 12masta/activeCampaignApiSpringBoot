package com.example.activeCampaignApiSpringBoot;

import com.example.activeCampaignApiSpringBoot.convert.JsonConverter;
import com.example.activeCampaignApiSpringBoot.http.Http;
import com.example.activeCampaignApiSpringBoot.model.contact.ContactContainer;
import com.example.activeCampaignApiSpringBoot.model.response.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!!";
    }

    @PostMapping("/createorupdatecontact")
    @CrossOrigin(origins = {"http://localhost:3000", "https://kurstestowania.pl/", "https://www.kurstestowania.pl/"})
    @ResponseBody
    Response createorupdatecontact(@RequestBody ContactContainer contact) {
        Http http = new Http();
        Response response = new Response(200, "OK");
        try {
            okhttp3.Response okHttpResponse = http.post("https://marcinstanek.api-us1.com/api/3/contact/sync", JsonConverter.toJsonString(contact));
            response.setResponse(okHttpResponse.message());
            response.setStatusCode(okHttpResponse.code());
        } catch (IOException e) {
            response.setStatusCode(500);
            response.setResponse(e.getMessage());
        }
        return response;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
