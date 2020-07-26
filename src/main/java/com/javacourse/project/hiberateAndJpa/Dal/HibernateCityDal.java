package com.javacourse.project.hiberateAndJpa.Dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.javacourse.project.hiberateAndJpa.Entities.City;
//JPA
public class HibernateCityDal implements ICityDal{
	
	private EntityManager entityManager;
	
	@Autowired //entitiy manager cinsine göre constructor injection
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional //kdou başına ve sonuna begin ve en transaction işlemlerini yazar
	public List<City> getAll() {
		Session session	= entityManager.unwrap(Session.class);
		List<City> cities = session.createNamedQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}
	
}
