package com.hotel.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.hotel.entity.PSS;
import com.hotel.repository.PSSRepository;
import com.hotel.service.PSSService;
@Service
public class PSSServiceImpl implements PSSService{
	
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	private PSSRepository  pssRepository;
 
	@Override
	public PSS saveAccount(PSS pss) {
		// TODO Auto-generated method stub
		return pssRepository.saveAndFlush(pss);
	}

	@Override
	public List<PSS> getPSSResult( ) {
		// TODO Auto-generated method stub
		//entityManager=emf.createEntityManager();
		try {
			String hql =" select * from pss_game";
			//entityManager.getTransaction().begin();
			Query query = entityManager.createNativeQuery(hql);
			List<PSS> list = query.getResultList();
			if(list.size()>0) {
				return list;
			}else {
				return null;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	
	}

}
