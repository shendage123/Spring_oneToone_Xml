package OneToMany_Spring_Pesm27.Main;

import javax.persistence.EntityManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import OneToMany_Spring_Pesm27.dao.FatherDao;
import OneToMany_Spring_Pesm27.dto.Father;

public class Controller {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myChildren.xml");
		Father father=applicationContext.getBean("father",Father.class);
		FatherDao dao=applicationContext.getBean("fdao",FatherDao.class);
	//	dao.savaFather(father);
		
	    dao.getfind(1);
		//dao.updateAll(1, father);
		//dao.Delete(1);
		
		
	}
	
	

}
