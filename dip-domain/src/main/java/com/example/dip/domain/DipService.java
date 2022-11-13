package com.example.dip.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DipService {
    private final DipRepository dipRepository;

    @Transactional
    public Dip save(Dip dip) {
        dipRepository.save(dip);

        return dip;
    }
}
