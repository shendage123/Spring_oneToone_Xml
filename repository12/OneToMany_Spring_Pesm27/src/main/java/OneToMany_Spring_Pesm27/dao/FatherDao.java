package OneToMany_Spring_Pesm27.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToMany_Spring_Pesm27.dto.Children;
import OneToMany_Spring_Pesm27.dto.Father;

public class FatherDao {
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rajath");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("rajath").createEntityManager();
	}
	
	public void savaFather(Father father)
	{
		EntityManager entityManager=getEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(father);
		entityTransaction.commit();
		
	}
	public void getfind(int id)
	{
		EntityManager entityManager=getEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    Children children=entityManager.find(Children.class, id);
	    System.out.println(children);
	
	}
	
	
	public void Delete(int id)
	{
		EntityManager entityManager=getEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	   Father father=entityManager.find(Father.class, id);
		entityTransaction.begin();
		entityManager.remove(father);
		entityTransaction.commit();
		System.out.println("Id Remove Succefully!!!!!");
	}
	public void updateAll(int id,Father father)
	{
		
		EntityManager entityManager=getEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    Father dbFather=entityManager.find(Father.class, id);
	    if(dbFather!=null)
	    {
	    	father.setId(id);
	    	entityTransaction.begin();
	    	entityManager.merge(father);
	    	entityTransaction.commit();
	    }
		
	}
	

	

}
