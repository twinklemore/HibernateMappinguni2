package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleRegistration {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("devesh");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Vehicle vehicle=new Vehicle();
	vehicle.setBrand("LAMBORGHINI");
	vehicle.setColour("ORANEG");
	vehicle.setPrice(80000000);

	Registration registration=new Registration();
	registration.setRegistration_no(5);
	registration.setCity("AIROLI");
	registration.getVehicle();
	vehicle.getRegistration();
	
	entityTransaction.begin();
	entityManager.persist(vehicle);
	entityManager.persist(registration);
	entityTransaction.commit();
 
	}
}
