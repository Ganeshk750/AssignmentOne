package com.assignement.login.dao.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignement.login.dto.LoginDTO;
import com.assignement.login.dto.RegistationDTO;


@Repository
public class LoginDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public RegistationDTO fatchUser(LoginDTO dto) {
		System.out.println("FatchUser Method Starts");
		Query qry = null;
		RegistationDTO dtoFromDB = null;
		String hql = "From RegistationDTO R where R.email=:em and R.pass=:pd";
		Session session =factory.openSession();
		try {
			qry = session.createQuery(hql);
			qry.setParameter("em",dto.getEmail());
			qry.setParameter("pd",dto.getPass());
		  dtoFromDB	= (RegistationDTO)qry.uniqueResult();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		
		System.out.println("FatchUser Method Ends");
		return dtoFromDB;
	}
	

}
