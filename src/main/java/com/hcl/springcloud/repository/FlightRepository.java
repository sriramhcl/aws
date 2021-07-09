package com.hcl.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.springcloud.model.Flight;



public interface FlightRepository extends JpaRepository<Flight, Long> {

}
