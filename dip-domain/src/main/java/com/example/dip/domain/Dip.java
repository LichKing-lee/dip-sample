package com.example.dip.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Dip {
    private DipId id;
    private String message;
}
