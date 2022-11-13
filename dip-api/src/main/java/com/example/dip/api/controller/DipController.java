package com.example.dip.api.controller;

import com.example.dip.domain.Dip;
import com.example.dip.domain.DipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DipController {
    private final DipService dipService;

    @GetMapping
    public Dip create() {
        Dip dip = dipService.save(new Dip(null, "hello dip"));

        return dip;
    }
}
