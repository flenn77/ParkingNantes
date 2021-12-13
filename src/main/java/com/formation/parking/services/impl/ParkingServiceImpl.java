package com.formation.parking.services.impl;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.parking.dao.ParkingAPIDAO;
import com.formation.parking.dao.entity.RecordEntity;
import com.formation.parking.dao.entity.ReponseParkingAPIEntity;
import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	public ParkingAPIDAO parkingAPIDAO;

	@Override
	public List<Parking> getListeParkings() {

		ReponseParkingAPIEntity reponse = parkingAPIDAO.getListeParkings();
		return transformEntityToModel(reponse);

	}

	private List<Parking> transformEntityToModel(ReponseParkingAPIEntity reponse) {
		List<Parking> resultat = new ArrayList<Parking>();
		for (RecordEntity record : reponse.getRecords()) {
			record.getFields();
			Parking parking = new Parking();
			// recuperer le grpnom de fields et l'affecter a nom de la classe parking
			parking.setNom(record.getFields().getGrpnom());
			parking.setStatut(getLibelleStatut(record));
			parking.setNbPlaceDispo(record.getFields().getGrpDisponible());
			parking.setNbPlaceTotal(record.getFields().getGrpExploitation());
			parking.setHeureMaj(getHeureMaj(record));
			resultat.add(parking);

		}
		return resultat;
	}

	
	// traduire et ameliorer l'affchage des heures 
	private String getHeureMaj(RecordEntity record) {
		OffsetDateTime dateMaj = OffsetDateTime.parse(record.getFields().getGrphorodatage());
		OffsetDateTime dateMajWithOffsetPlus2 = dateMaj.withOffsetSameInstant(ZoneOffset.of("+01:00"));
		return dateMajWithOffsetPlus2.getHour()+ "h"+ dateMajWithOffsetPlus2.getMinute() + "min";
	}

	
	
	//condition qui permet de mieux afficher le resultat ***afficher ouvert fermer reserver si la valeur de status est esgal a 1/2/5
	private String getLibelleStatut(RecordEntity record) {
		switch(record.getFields().getGrpStatut()) {
			case "1": {
				return "fermer";
			}
			case "2": {
				return "reserve";
			}
			case "5": {
				return "ouvert";
				}
			}
		return "data non dispo";
	}

	


}
