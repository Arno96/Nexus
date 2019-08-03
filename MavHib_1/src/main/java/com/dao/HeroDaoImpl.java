package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.frame.Hero;
import com.portal.entities.Employee;
import com.providers.SessionFactoryProvider;

public class HeroDaoImpl implements HeroDao {

	public boolean addHero(Hero p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		
		return true;
	}

	public boolean deleteHero(int personId) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		Hero p=session.get(Hero.class, personId);
		if(p==null){
			return false;
		}
		session.delete(p);
		
		tx.commit();
		session.close();
		
		return true;
	}

	public boolean updateHero(Hero p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.update(p);
		tx.commit();
		session.close();
		
		
		return true;
	}

	public Hero getHero(int pId) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Hero p=session.get(Hero.class,pId);
		session.close();
		
		return p;
	}

	public List<Hero> getAllHeroes() {
		List<Hero> elist=new ArrayList<>();
		Session session=SessionFactoryProvider.getSF().openSession();
		Hero p=session.getClass()<Hero> ;
		return null;
	}

}
