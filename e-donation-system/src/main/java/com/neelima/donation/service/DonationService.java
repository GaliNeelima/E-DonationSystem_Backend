package com.neelima.donation.service;

import java.util.List;

import com.neelima.donation.dto.DonationDto;

public interface DonationService {
	
	public DonationDto addDonation(DonationDto donationDto) ;
	
	public List<DonationDto> finddonationsByDonorId(Long donorId);

}
