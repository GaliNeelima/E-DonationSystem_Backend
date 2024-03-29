package com.neelima.donation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neelima.donation.entity.DonationEntity;

@Repository
public interface DonationRepository extends JpaRepository<DonationEntity,Long> {
	List<DonationEntity> findByDonorId(Long donorId);
}
