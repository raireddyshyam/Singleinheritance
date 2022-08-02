package com.tnsif.singleinh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VechileMain {

	public static void main(String[] args) {
            EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
            EntityManager em=fac.createEntityManager();
            em.getTransaction().begin();
            
            Vehicle vobj=new Vehicle();
            vobj.setVid(1234);
            vobj.setVname("car");
            
            TwoWheeler tobj=new TwoWheeler();
            tobj.setSteeringtwowheeler("bike");
            
            FourWheeler fobj=new FourWheeler();
            fobj.setSteeringfourwheeler("tata nano");
            
            System.out.println("data inserted");
            em.close();
            fac.close();
            
	}

}
