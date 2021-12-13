package com.formation.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;

//DIRE QUE CETTE CLASS EST UN COMPOSANT
@RestController
public class ParkingController {
	
	@Autowired
	private ParkingService parkingService;
	
	@CrossOrigin("http://localhost:4200")
	
	//SUIVRE LE CHEMIN /API/PARKING EN UTILISANT UNIQUEMENT LA METHODE GET
	@RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
	public List<Parking> getListeParkings() {
		//RETOURNER LA LISTE DES PARKING
		return parkingService.getListeParkings();
	}
}