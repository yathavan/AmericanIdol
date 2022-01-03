package com.americanidol.comapp.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "additional_info")
public class AdditionalInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="additional_info_id")
    private Long id;
	@Column(name="description")
	private String description;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "response_id", nullable = false)
    private Response response;
	
	public AdditionalInfo() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
}
