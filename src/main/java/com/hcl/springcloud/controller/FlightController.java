package com.hcl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springcloud.model.Flight;
import com.hcl.springcloud.repository.FlightRepository;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@RequestMapping(value = "/allFlights")
	public List<Flight> getFlightDetails() {
		return flightRepository.findAll();
	}

}
