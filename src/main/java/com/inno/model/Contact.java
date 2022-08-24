package com.inno.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CONTACT_DLTS")
public class Contact {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="CONCTACT_ID")
	private Integer contactId;
@Column(name="CONCTACT_CONTACT_NAME")
	private String contactName;
@Column(name="CONCTACT_NUMBER")
	private  String contactNumber;
@Column(name="CONCTACT_EMIAL")
	private String contactEmail;
@Column(name="CONCTACT_ACTIVE_SWITCH")
	private  Character activeSwitch;
@Column(name="CONCTACT_CREATE_DATE",updatable = false)
	private LocalDate createdDate;
@Column(name="CONCTACT_UPDATE_DATE",insertable = false)
	private LocalDate updateDate;
	
	
	
	
	
}
