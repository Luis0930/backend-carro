package com.udem.spring.car.controller;

import com.udem.spring.car.model.Car;
import com.udem.spring.car.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
    private final CarRepository repository;

    //este metodo sirve para listar informacion de DB
    @GetMapping("/car")
    public List<Car> car() {
        return repository.findAll();
    }


    //este metodo sirve para guardar guardar informacion en DB
    @PostMapping("/save")
    public Car car(@RequestBody Car car) {
        return repository.save(car);
    }


}
