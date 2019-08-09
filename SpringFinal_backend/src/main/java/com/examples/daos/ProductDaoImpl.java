package com.examples.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examples.models.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProducts(Product p) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(p);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String viewProducts(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

}
