package com.example.dip.domain;

public interface DipRepository {
    void save(Dip dip);
    Dip findBy(DipId id);
}
