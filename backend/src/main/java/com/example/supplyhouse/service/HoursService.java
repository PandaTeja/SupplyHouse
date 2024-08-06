package com.example.supplyhouse.service;

import com.example.supplyhouse.model.Hours;
import com.example.supplyhouse.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HoursService {

    @Autowired
    private HoursRepository hoursRepository;

    public List<Hours> getAllHours() {
        return hoursRepository.findAll();
    }

    public List<Hours> getSpecialHours(LocalDate date) {
        return hoursRepository.findByDateAfter(date);
    }

    public Hours addSpecialHours(Hours hours) {
        return hoursRepository.save(hours);
    }

    public void deleteSpecialHours(Long id) {
        hoursRepository.deleteById(id);
    }
}
