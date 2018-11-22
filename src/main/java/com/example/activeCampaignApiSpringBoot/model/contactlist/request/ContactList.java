package com.example.activeCampaignApiSpringBoot.model.contactlist.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "list",
        "contact",
        "status"
})
public class ContactList {

    @JsonProperty("list")
    private Integer list;
    @JsonProperty("contact")
    private Integer contact;
    @JsonProperty("status")
    private Integer status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("list")
    public Integer getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(Integer list) {
        this.list = list;
    }

    @JsonProperty("contact")
    public Integer getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}