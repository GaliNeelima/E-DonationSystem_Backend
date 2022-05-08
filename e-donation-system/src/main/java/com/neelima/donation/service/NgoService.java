package com.neelima.donation.service;

import com.neelima.donation.dto.NgoDto;

public interface NgoService {
	
	public NgoDto registerNgo(NgoDto ngodto);
	
	public NgoDto findById(Long ngoId);

}
