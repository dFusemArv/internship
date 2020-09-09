package com.suman.internship.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Medicine {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	private String name;
	@ManyToOne
	@JoinColumn(name="medicinetypeid", insertable=false, updatable=false)
	private MedicineType medicineType;
	private Integer medicinetypeid;	
	
	private String medicineNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="medicinemakeid", insertable=false, updatable=false)
	private MedicineMake medicineMake;
	private Integer medicinemakeid;
	
	private String power;
	private String fuelCapacity;
	@ManyToOne
	@JoinColumn(name="medicinestatusid", insertable=false, updatable=false)
	private MedicineStatus medicineStatus;
	private Integer medicinestatusid;	
	
	private String netWeight;

	@ManyToOne
	@JoinColumn(name="employeeid", insertable=false, updatable=false)
	private Employee inCharge;
	private Integer employeeid;
	
	@ManyToOne
	@JoinColumn(name="medicinemodelid", insertable=false, updatable=false)
	private MedicineModel medicineModel;	
	private Integer medicinemodelid;

	@ManyToOne
	@JoinColumn(name="locationid", insertable=false, updatable=false)	
	private Location currentLocation;
	private Integer locationid;
	
	private String remarks;	
}
