package com.kylerdeggs.nonprofitapi.repository;

import com.kylerdeggs.nonprofitapi.domain.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer> {
}
