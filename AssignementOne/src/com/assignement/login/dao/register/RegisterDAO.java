package com.assignement.login.dao.register;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignement.login.dto.RegistationDTO;



@Repository
public class RegisterDAO {
	
	@Autowired
	SessionFactory factory;
	
	public RegisterDAO() {
		
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	
	public void saveUser(RegistationDTO dto) {
		
		System.out.println("SaveUser Starts");
		Transaction tx =null;
		Session session = factory.openSession();
		try {
			tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		}catch(Exception e) {
			//e.printStackTrace();
			tx.rollback();
		}
		finally {
			session.close();
		}
		
		
		
		System.out.println("SaveUser Ends");
	}

}
