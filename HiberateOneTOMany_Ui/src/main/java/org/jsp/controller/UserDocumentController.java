package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.UserDocuments;
import org.jsp.dto.Document;
import org.jsp.dto.User;

public class UserDocumentController {
	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setName("omsha");
		user.setAddress("gutta");
		user.setAge(22);
		user.setEmail("omsha@0220@.in");
		user.setNumber(123456789L);
		user.setGender('M');
		
		
		Document document1=new Document();
		document1.setDocId("1234567789");
		document1.setName("AdharCard");
		document1.setType("Uidai");
		document1.setValidity("Lifetime");
		
		
		Document document2=new Document();
		document2.setDocId("ABC123AB");
		document2.setName("PAnCard");
		document2.setType("Financial");
		document2.setValidity("Lifetime");
	
		Document document3=new Document();
		document3.setDocId("TSYA5002");
		document3.setName("Vechicle Licensce");
		document3.setType("Transport");
		document3.setValidity("20 year");
		
		Document document4=new Document();
		document4.setDocId("123Income");
		document4.setName("Income");
		document4.setType("tax");
		document4.setValidity("1 year");
		
		List<Document>documents=new ArrayList<Document>();
		documents.add(document1);
		documents.add(document2);
		documents.add(document3);
		documents.add(document4);
		
		user.setDocuments(documents);
		
		 UserDocuments dao=new  UserDocuments();
		 dao.saveUser(user);
				 
		
		
	
	
		
		
		
	}
	
}
