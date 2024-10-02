package com.neptune.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neptune.entity.Pond;
import com.neptune.repository.PondRepository;

import java.util.List;

@Service
public class PondService {

    @Autowired
    private PondRepository pondRepository;

    public List<Pond> getAllPonds() {
        return pondRepository.findAll();
    }

    public Pond addPond(Pond pond) {
        return pondRepository.save(pond);
    }
}
