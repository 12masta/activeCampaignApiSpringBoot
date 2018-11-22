
package com.example.activeCampaignApiSpringBoot.model.contact.response;

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
    "bounceLogs",
    "contactAutomations",
    "contactData",
    "contactGoals",
    "contactLists",
    "contactLogs",
    "contactTags",
    "contactDeals",
    "deals",
    "fieldValues",
    "geoIps",
    "notes",
    "organization",
    "plusAppend",
    "trackingLogs",
    "scoreValues"
})
public class Links {

    @JsonProperty("bounceLogs")
    private String bounceLogs;
    @JsonProperty("contactAutomations")
    private String contactAutomations;
    @JsonProperty("contactData")
    private String contactData;
    @JsonProperty("contactGoals")
    private String contactGoals;
    @JsonProperty("contactLists")
    private String contactLists;
    @JsonProperty("contactLogs")
    private String contactLogs;
    @JsonProperty("contactTags")
    private String contactTags;
    @JsonProperty("contactDeals")
    private String contactDeals;
    @JsonProperty("deals")
    private String deals;
    @JsonProperty("fieldValues")
    private String fieldValues;
    @JsonProperty("geoIps")
    private String geoIps;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("plusAppend")
    private String plusAppend;
    @JsonProperty("trackingLogs")
    private String trackingLogs;
    @JsonProperty("scoreValues")
    private String scoreValues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bounceLogs")
    public String getBounceLogs() {
        return bounceLogs;
    }

    @JsonProperty("bounceLogs")
    public void setBounceLogs(String bounceLogs) {
        this.bounceLogs = bounceLogs;
    }

    @JsonProperty("contactAutomations")
    public String getContactAutomations() {
        return contactAutomations;
    }

    @JsonProperty("contactAutomations")
    public void setContactAutomations(String contactAutomations) {
        this.contactAutomations = contactAutomations;
    }

    @JsonProperty("contactData")
    public String getContactData() {
        return contactData;
    }

    @JsonProperty("contactData")
    public void setContactData(String contactData) {
        this.contactData = contactData;
    }

    @JsonProperty("contactGoals")
    public String getContactGoals() {
        return contactGoals;
    }

    @JsonProperty("contactGoals")
    public void setContactGoals(String contactGoals) {
        this.contactGoals = contactGoals;
    }

    @JsonProperty("contactLists")
    public String getContactLists() {
        return contactLists;
    }

    @JsonProperty("contactLists")
    public void setContactLists(String contactLists) {
        this.contactLists = contactLists;
    }

    @JsonProperty("contactLogs")
    public String getContactLogs() {
        return contactLogs;
    }

    @JsonProperty("contactLogs")
    public void setContactLogs(String contactLogs) {
        this.contactLogs = contactLogs;
    }

    @JsonProperty("contactTags")
    public String getContactTags() {
        return contactTags;
    }

    @JsonProperty("contactTags")
    public void setContactTags(String contactTags) {
        this.contactTags = contactTags;
    }

    @JsonProperty("contactDeals")
    public String getContactDeals() {
        return contactDeals;
    }

    @JsonProperty("contactDeals")
    public void setContactDeals(String contactDeals) {
        this.contactDeals = contactDeals;
    }

    @JsonProperty("deals")
    public String getDeals() {
        return deals;
    }

    @JsonProperty("deals")
    public void setDeals(String deals) {
        this.deals = deals;
    }

    @JsonProperty("fieldValues")
    public String getFieldValues() {
        return fieldValues;
    }

    @JsonProperty("fieldValues")
    public void setFieldValues(String fieldValues) {
        this.fieldValues = fieldValues;
    }

    @JsonProperty("geoIps")
    public String getGeoIps() {
        return geoIps;
    }

    @JsonProperty("geoIps")
    public void setGeoIps(String geoIps) {
        this.geoIps = geoIps;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonProperty("plusAppend")
    public String getPlusAppend() {
        return plusAppend;
    }

    @JsonProperty("plusAppend")
    public void setPlusAppend(String plusAppend) {
        this.plusAppend = plusAppend;
    }

    @JsonProperty("trackingLogs")
    public String getTrackingLogs() {
        return trackingLogs;
    }

    @JsonProperty("trackingLogs")
    public void setTrackingLogs(String trackingLogs) {
        this.trackingLogs = trackingLogs;
    }

    @JsonProperty("scoreValues")
    public String getScoreValues() {
        return scoreValues;
    }

    @JsonProperty("scoreValues")
    public void setScoreValues(String scoreValues) {
        this.scoreValues = scoreValues;
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
