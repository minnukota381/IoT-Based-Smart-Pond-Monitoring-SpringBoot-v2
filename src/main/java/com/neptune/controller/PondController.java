package com.neptune.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.neptune.entity.Pond;
import com.neptune.service.PondService;

import java.util.List;

@RestController
@RequestMapping("/api/ponds")
public class PondController {

    @Autowired
    private PondService pondService;

    @GetMapping
    public List<Pond> getAllPonds() {
        return pondService.getAllPonds();
    }

    @PostMapping("/admin/add")
    public Pond addPond(@RequestBody Pond pond) {
        return pondService.addPond(pond);
    }
}
