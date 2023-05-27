package com.boyd.flightAppApi.models;

import jakarta.persistence.*;
@Entity
@Table(name = "flights")

public class flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flight_id;
    private String flight_departure;
    private String flight_arrival;
    private String departure_time;
    private String flight_carrier;

    // Getter for flight_id
    public int getFlightId() {
        return flight_id;
    }

    // Getter and setter for flight_departure
    public String getFlightDeparture() {
        return flight_departure;
    }
    
    public void setFlightDeparture(String depart){
        this.flight_departure = depart;
    }

    // Getter and setter for flight_arrival
    public String getFlightArrival() {
        return flight_arrival;
    }
    
    public void getFlightArrival(String arrive){
        this.flight_arrival = arrive;
    }

    // Getter and setter for departure_time variable
    public String getDepartureTime() {
        return departure_time;
    }
    
    public void setDepartureTime(String departTime){
        this.departure_time = departTime;
    }

    // Getter and setter for flight_carrier variable
    public String getFlightCarrier() {
        return flight_carrier;
    }
    
    public void setFlightCarrier(String carrier){
        this.flight_carrier = carrier;
    }
}
