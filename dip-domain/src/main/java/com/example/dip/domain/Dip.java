package com.example.dip.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "dip")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Dip {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dip_id")
    private Long id;
    @Column(name = "message")
    private String message;
}
