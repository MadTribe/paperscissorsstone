package com.hotel.service;

import java.util.List;

import com.hotel.entity.PSS;
import com.hotel.entity.User;
 

public interface PSSService {
	PSS saveAccount(PSS pss);

	List<PSS> getPSSResult();

	 

}
