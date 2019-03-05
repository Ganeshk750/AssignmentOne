package com.assignement.login.dao.forgotten;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignement.login.dto.ForgottenDTO;

@Repository
public class ForgottenDAO {
	@Autowired
	private SessionFactory factory;
	
	public ForgottenDAO() {
		
		System.out.println(this.getClass().getSimpleName()+"Created");
	}
	public int forgottenUser(ForgottenDTO dto) {
		System.out.println("ForgottenUser Method Starts");
		
		int res = 0;
		
		String hql = "Update RegistationDTO R set R.pass = :pa "
				+ " where R.email = :em";
		
		Session session = factory.openSession();
		
		try {
			Query qry = session.createQuery(hql);
			qry.setParameter("em",dto.getEmail());
			qry.setParameter("pa",dto.getPass());
			res = qry.executeUpdate();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		System.out.println("ForgottenUser Method Ends");
		return res;
	}

}
