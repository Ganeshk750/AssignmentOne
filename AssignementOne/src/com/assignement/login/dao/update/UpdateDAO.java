package com.assignement.login.dao.update;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.assignement.login.dto.UpdateDTO;


@Repository
public class UpdateDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public UpdateDAO() {
		
		System.out.println(this.getClass().getSimpleName()+"create");
	}
	public int updateUser(UpdateDTO dto) {
		System.out.println("UpdateUser Method Starts");
		
		int res = 0;
		//RegistationDTO dtoFromDB = null;
		//String hql = "update RegistationDTO U set U.email= " +email+" Where U.phNm = '"+phNm+"'";
		String hql = "Update RegistationDTO R set R.phNm = :pm "
				+ " where R.email = :em";
		Session session = factory.openSession();
		try {
			Query qry = session.createQuery(hql);
			  qry.setParameter("em",dto.getEmail());
			  qry.setParameter("pm",dto.getPhNm());
			res = qry.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		System.out.println("UpdateUser Method Ends");
		return res;
	}

}
