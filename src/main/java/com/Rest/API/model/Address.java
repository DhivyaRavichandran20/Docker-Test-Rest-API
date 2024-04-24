package com.Rest.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @Column
    private String streetName;

    @Setter
    @Column
    private String postalCode;

    @Setter
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Employee getEmployee() {
        return employee;
    }


}
