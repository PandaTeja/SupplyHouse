package com.example.supplyhouse.controller;

import com.example.supplyhouse.model.Hours;
import com.example.supplyhouse.service.HoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/hours")
public class HoursController {

    @Autowired
    private HoursService hoursService;

    @GetMapping("/regular")
    public List<Hours> getRegularHours() {
        return hoursService.getAllHours();
    }

    @GetMapping("/special")
    public List<Hours> getSpecialHours() {
        return hoursService.getSpecialHours(LocalDate.now());
    }

    @PostMapping("/special")
    public Hours addSpecialHours(@RequestBody Hours hours) {
        return hoursService.addSpecialHours(hours);
    }

    @DeleteMapping("/special/{id}")
    public void deleteSpecialHours(@PathVariable Long id) {
        hoursService.deleteSpecialHours(id);
    }
}
