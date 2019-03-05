package com.assignement.login.dao.updateprofile;


import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignement.login.dto.RegistationDTO;

@Repository
public class UpdateProfileDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public UpdateProfileDAO() {
		System.out.println(this.getClass().getSimpleName()+"Create");
	}
	
	public int updateProfile(RegistationDTO dto,HttpServletRequest req) {
		
		System.out.println("UpdateProfile Method Starts");
		int res = 0;
		//Query qry = null;
		//RegistationDTO dtoFromDB = null;
		Session session =factory.openSession();
	
		try {
			
			/*qry.setParameter("email",dto.getEmail());
			qry.setParameter("pass",dto.getPass());
			qry.setParameter("myName",dto.getMyName());
			qry.setParameter("phNm",dto.getPhNm());
			qry.setParameter("gender",dto.getGender());
			qry.setParameter("knows",dto.getKnows());
			qry.setParameter("remember",dto.getRemember());
		  dtoFromDB	= (RegistationDTO)qry.uniqueResult();*/
			System.out.println(" "+dto.getEmail());
			HttpSession session1 = req.getSession(false);
			dto = (RegistationDTO) session1.getAttribute("rdto");
			System.out.println(dto.getEmail());
			session.update(dto);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		System.out.println("UpdateProfile Method Ends");
		return res;
	}


}
