package com.dbt.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.dbt.dto.SchemeDTO;

@Repository
@Transactional
public class SchemeDAOImp implements SchemeDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<SchemeDTO> GetAll() {
		
		List<SchemeDTO> schemes = new ArrayList<SchemeDTO>();
		
		String sql="select a.scheme_code, a.scheme_name, b.month, b.year, b.data as datab, c.data as datac from "
				+ "tablea a join tableb b on a.id = b.scheme_code "
				+ "join tablec c on a.id = c.scheme_code and b.month = c.month and b.year = c.year";
		
		Query query = em.createNativeQuery(sql);
		
		List<Object []> lstObj = query.getResultList();
		
		for(Object r:lstObj)
		{
			Object rows[] = (Object [])r;
			
			SchemeDTO schemeDTO1 = new SchemeDTO();
			schemeDTO1.setSchemeCode(String.valueOf(rows[0]));
			schemeDTO1.setSchemeName(String.valueOf(rows[1]));
			schemeDTO1.setMonth(String.valueOf(rows[2]));
			schemeDTO1.setYear(String.valueOf(rows[3]));
			schemeDTO1.setDataB(String.valueOf(rows[4]));
			schemeDTO1.setDataC(String.valueOf(rows[5]));
			
			schemes.add(schemeDTO1);
		}
		
		
		return schemes;
	}
	
	
}
