package com.inno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.model.Contact;
import com.inno.service.Repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactServiceI {

	@Autowired
	private ContactRepo contactRepo;
	@Override
	public boolean saveConctact(Contact contact) {
		Contact save = this.contactRepo.save(contact);
		
		if(save!=null) {
			return true;
		}
	
		else {
			
			return false;	
		}
		
	}
	@Override
	public List<Contact> getAllContact1() {
		List<Contact> findAll = this.contactRepo.findAll();
		
		return findAll;
	}

}
