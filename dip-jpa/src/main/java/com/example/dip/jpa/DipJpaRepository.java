package com.example.dip.jpa;

import com.example.dip.domain.Dip;
import com.example.dip.domain.DipId;
import com.example.dip.domain.DipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class DipJpaRepository implements DipRepository {
    private final EntityManager entityManager;

    @Override
    public void save(Dip dip) {
        entityManager.persist(DipEntity.from(dip));
    }

    @Override
    public Dip findBy(DipId id) {
        DipEntity entity = entityManager.find(DipEntity.class, id.getValue());
        return entity.toDomain();
    }
}
