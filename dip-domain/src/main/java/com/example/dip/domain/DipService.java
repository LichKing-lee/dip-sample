package com.example.dip.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DipService {
    private final DipRepository dipRepository;

    @Transactional
    public void save(Dip dip) {
        dipRepository.save(dip);
    }

    public Dip get(DipId dipId) {
        return dipRepository.findBy(dipId);
    }
}
