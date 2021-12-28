package com.americanidol.comapp.domain;

import javax.persistence.*;

@Entity
@Table(name = "additional_info")
public class AdditionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long additionalInfoId;
    private String description;

    @ManyToOne
    @JoinColumn(name="response_id", nullable=false)
    private Response responseId;

    public AdditionalInfo() {
    }

    public long getAdditionalInfoId() {
        return additionalInfoId;
    }

    public void setAdditionalInfoId(long additionalInfoId) {
        this.additionalInfoId = additionalInfoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Response getResponseId() {
        return responseId;
    }

    public void setResponseId(Response responseId) {
        this.responseId = responseId;
    }
}
