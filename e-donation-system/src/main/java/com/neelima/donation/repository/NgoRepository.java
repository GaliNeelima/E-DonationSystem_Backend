package com.neelima.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neelima.donation.entity.NgoEntity;

@Repository
public interface NgoRepository extends JpaRepository<NgoEntity,Long> {

}
