package com.udem.spring.car.model;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "car")
public class Car {

    public Car() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", length = 60, nullable = false)
    private String direccion;


}