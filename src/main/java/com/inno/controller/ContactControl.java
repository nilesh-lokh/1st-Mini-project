package com.inno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inno.model.Contact;
import com.inno.service.ContactServiceI;

@RestController
@RequestMapping("/contact")
public class ContactControl {
	@Autowired
	private ContactServiceI contactServiceI;
	@PostMapping("/saveContact")
	public ResponseEntity<String> saveContact(Contact contact){
		
		boolean conctact = this.contactServiceI.saveConctact(contact);
		if(conctact==true) {
			
			return new ResponseEntity<String>("CONTCAT SAVE SUCCESFULLY",HttpStatus.CREATED);
		}
		
		return new ResponseEntity<String>("CONTCAT SAVE SUCCESFULLY",HttpStatus.BAD_REQUEST) ;}

	
	@GetMapping(value = "/getAllContcat")
	public ResponseEntity<List<Contact>> getAllContcat2(){
		
	List<Contact> allContact1 = this.contactServiceI.getAllContact1();
		
		return new ResponseEntity<List<Contact>>(allContact1,HttpStatus.OK);
		 
		
		}
}
