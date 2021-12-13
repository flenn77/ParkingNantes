package com.formation.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


//ignorer les champs non utilisé de l'API sinon au moment de transformer l'api il generera une erreur 
@JsonIgnoreProperties(ignoreUnknown =  true)
public class FieldsEntity {
	
	//préciser a quel champs correspond cette valeur dans l'API
	@JsonProperty(value = "idobj" )
	private String idobj;
	
	@JsonProperty(value = "grp_nom" )
	private String grpnom;
	
	@JsonProperty(value = "grp_exploitation" )
	private int grpExploitation;
	
	@JsonProperty(value = "grp_disponible" )
	private int grpDisponible;
	
	@JsonProperty(value = "grp_statut" )
	private String grpStatut;
	
	@JsonProperty(value = "grp_horodatage" )
	private String grphorodatage;

	
	public String getIdobj() {
		return idobj;
	}

	public void setIdobj(String idobj) {
		this.idobj = idobj;
	}

	public String getGrpnom() {
		return grpnom;
	}

	public void setGrpnom(String grpnom) {
		this.grpnom = grpnom;
	}

	public int getGrpExploitation() {
		return grpExploitation;
	}

	public void setGrpExploitation(int grpExploitation) {
		this.grpExploitation = grpExploitation;
	}

	public int getGrpDisponible() {
		return grpDisponible;
	}

	public void setGrpDisponible(int grpDisponible) {
		this.grpDisponible = grpDisponible;
	}

	public String getGrpStatut() {
		return grpStatut;
	}

	public void setGrpStatut(String grpStatut) {
		this.grpStatut = grpStatut;
	}

	public String getGrphorodatage() {
		return grphorodatage;
	}

	public void setGrphorodatage(String grphorodatage) {
		this.grphorodatage = grphorodatage;
	}


}
