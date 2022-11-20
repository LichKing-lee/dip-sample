package com.example.dip.jpa;

import com.example.dip.domain.Dip;
import com.example.dip.domain.DipId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "dip")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DipEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dip_id")
    private Long id;
    @Column(name = "message")
    private String message;

    public static DipEntity from(Dip dip) {
        if (dip.getId() == null) {
            return new DipEntity(null, dip.getMessage());
        }
        return new DipEntity(dip.getId().getValue(), dip.getMessage());
    }

    public Dip toDomain() {
        return new Dip(new DipId(id), message);
    }
}
