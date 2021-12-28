package com.americanidol.comapp.domain;

import javax.persistence.*;

@Entity
@Table(name="response")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long responseId;
    private String description;

    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item itemId;

    public Response() {
    }

    public long getResponseId() {
        return responseId;
    }

    public void setResponseId(long responseId) {
        this.responseId = responseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }
}
