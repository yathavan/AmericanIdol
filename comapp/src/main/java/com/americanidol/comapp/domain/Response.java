package com.americanidol.comapp.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "response")
public class Response implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="response_id")
    private Long id;
	@Column(name="description")
	private String description;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;
	@OneToMany(mappedBy = "response", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AdditionalInfo> additionalInfos;
	
	public Response() {
		
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Set<AdditionalInfo> getAdditionalInfos() {
		return additionalInfos;
	}

	public void setAdditionalInfos(Set<AdditionalInfo> additionalInfos) {
		this.additionalInfos = additionalInfos;
	}
}
