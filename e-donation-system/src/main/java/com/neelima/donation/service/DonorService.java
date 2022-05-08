package com.neelima.donation.service;

import java.util.List;

import com.neelima.donation.dto.DonorDto;

public interface DonorService {
	
	public DonorDto registerDonor(DonorDto donorDto) ;
	
	public DonorDto findDonorById(Long donorId) ;
	
	public List<DonorDto> getDonorsWithNgoId(Long ngoId) ;

	public DonorDto updateDonor(DonorDto donorDto);

	List<DonorDto> findAll();

}
