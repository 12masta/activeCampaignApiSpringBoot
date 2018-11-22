
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
    "cdate",
    "email",
    "phone",
    "firstName",
    "lastName",
    "orgid",
    "segmentio_id",
    "bounced_hard",
    "bounced_soft",
    "bounced_date",
    "ip",
    "ua",
    "hash",
    "socialdata_lastcheck",
    "email_local",
    "email_domain",
    "sentcnt",
    "rating_tstamp",
    "gravatar",
    "deleted",
    "anonymized",
    "udate",
    "deleted_at",
    "created_utc_timestamp",
    "updated_utc_timestamp",
    "links",
    "id",
    "organization"
})
public class Contact {

    @JsonProperty("cdate")
    private String cdate;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("orgid")
    private String orgid;
    @JsonProperty("segmentio_id")
    private String segmentioId;
    @JsonProperty("bounced_hard")
    private String bouncedHard;
    @JsonProperty("bounced_soft")
    private String bouncedSoft;
    @JsonProperty("bounced_date")
    private String bouncedDate;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("ua")
    private String ua;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("socialdata_lastcheck")
    private String socialdataLastcheck;
    @JsonProperty("email_local")
    private String emailLocal;
    @JsonProperty("email_domain")
    private String emailDomain;
    @JsonProperty("sentcnt")
    private String sentcnt;
    @JsonProperty("rating_tstamp")
    private String ratingTstamp;
    @JsonProperty("gravatar")
    private String gravatar;
    @JsonProperty("deleted")
    private String deleted;
    @JsonProperty("anonymized")
    private String anonymized;
    @JsonProperty("udate")
    private String udate;
    @JsonProperty("deleted_at")
    private String deletedAt;
    @JsonProperty("created_utc_timestamp")
    private String createdUtcTimestamp;
    @JsonProperty("updated_utc_timestamp")
    private String updatedUtcTimestamp;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("id")
    private String id;
    @JsonProperty("organization")
    private Object organization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cdate")
    public String getCdate() {
        return cdate;
    }

    @JsonProperty("cdate")
    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("orgid")
    public String getOrgid() {
        return orgid;
    }

    @JsonProperty("orgid")
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    @JsonProperty("segmentio_id")
    public String getSegmentioId() {
        return segmentioId;
    }

    @JsonProperty("segmentio_id")
    public void setSegmentioId(String segmentioId) {
        this.segmentioId = segmentioId;
    }

    @JsonProperty("bounced_hard")
    public String getBouncedHard() {
        return bouncedHard;
    }

    @JsonProperty("bounced_hard")
    public void setBouncedHard(String bouncedHard) {
        this.bouncedHard = bouncedHard;
    }

    @JsonProperty("bounced_soft")
    public String getBouncedSoft() {
        return bouncedSoft;
    }

    @JsonProperty("bounced_soft")
    public void setBouncedSoft(String bouncedSoft) {
        this.bouncedSoft = bouncedSoft;
    }

    @JsonProperty("bounced_date")
    public String getBouncedDate() {
        return bouncedDate;
    }

    @JsonProperty("bounced_date")
    public void setBouncedDate(String bouncedDate) {
        this.bouncedDate = bouncedDate;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("ua")
    public String getUa() {
        return ua;
    }

    @JsonProperty("ua")
    public void setUa(String ua) {
        this.ua = ua;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("socialdata_lastcheck")
    public String getSocialdataLastcheck() {
        return socialdataLastcheck;
    }

    @JsonProperty("socialdata_lastcheck")
    public void setSocialdataLastcheck(String socialdataLastcheck) {
        this.socialdataLastcheck = socialdataLastcheck;
    }

    @JsonProperty("email_local")
    public String getEmailLocal() {
        return emailLocal;
    }

    @JsonProperty("email_local")
    public void setEmailLocal(String emailLocal) {
        this.emailLocal = emailLocal;
    }

    @JsonProperty("email_domain")
    public String getEmailDomain() {
        return emailDomain;
    }

    @JsonProperty("email_domain")
    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    @JsonProperty("sentcnt")
    public String getSentcnt() {
        return sentcnt;
    }

    @JsonProperty("sentcnt")
    public void setSentcnt(String sentcnt) {
        this.sentcnt = sentcnt;
    }

    @JsonProperty("rating_tstamp")
    public String getRatingTstamp() {
        return ratingTstamp;
    }

    @JsonProperty("rating_tstamp")
    public void setRatingTstamp(String ratingTstamp) {
        this.ratingTstamp = ratingTstamp;
    }

    @JsonProperty("gravatar")
    public String getGravatar() {
        return gravatar;
    }

    @JsonProperty("gravatar")
    public void setGravatar(String gravatar) {
        this.gravatar = gravatar;
    }

    @JsonProperty("deleted")
    public String getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("anonymized")
    public String getAnonymized() {
        return anonymized;
    }

    @JsonProperty("anonymized")
    public void setAnonymized(String anonymized) {
        this.anonymized = anonymized;
    }

    @JsonProperty("udate")
    public String getUdate() {
        return udate;
    }

    @JsonProperty("udate")
    public void setUdate(String udate) {
        this.udate = udate;
    }

    @JsonProperty("deleted_at")
    public String getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deleted_at")
    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("created_utc_timestamp")
    public String getCreatedUtcTimestamp() {
        return createdUtcTimestamp;
    }

    @JsonProperty("created_utc_timestamp")
    public void setCreatedUtcTimestamp(String createdUtcTimestamp) {
        this.createdUtcTimestamp = createdUtcTimestamp;
    }

    @JsonProperty("updated_utc_timestamp")
    public String getUpdatedUtcTimestamp() {
        return updatedUtcTimestamp;
    }

    @JsonProperty("updated_utc_timestamp")
    public void setUpdatedUtcTimestamp(String updatedUtcTimestamp) {
        this.updatedUtcTimestamp = updatedUtcTimestamp;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("organization")
    public Object getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Object organization) {
        this.organization = organization;
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
