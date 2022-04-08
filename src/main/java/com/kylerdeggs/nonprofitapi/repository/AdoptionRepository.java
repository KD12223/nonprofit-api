package com.kylerdeggs.nonprofitapi.repository;

import com.kylerdeggs.nonprofitapi.domain.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptionRepository extends JpaRepository<Adoption, Integer> {
}
