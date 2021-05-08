package com.jonatan.app_Repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jonatan.app_Entity.Aviones;


// clase repository donde implemento los metodos crud y hago los querys
@Repository
public class AvionesRepository implements AvionesIntRepository {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Aviones> findall() {
		
		Session P_Session = entityManager.unwrap(Session.class);
		
		Query<Aviones> Tquery = P_Session.createQuery("from aviones",Aviones.class);
		
		List<Aviones> aviones = Tquery.getResultList();
		
		return aviones;
	}

	@Override
	public Aviones findByid(int id) {
		
		Session P_Session = entityManager.unwrap(Session.class);
		
		Aviones aviones = P_Session.get(Aviones.class, id);
		
		return aviones;
	}

	@Override
	public void save(Aviones aviones) {
		
		Session P_Session = entityManager.unwrap(Session.class);
		
		P_Session.saveOrUpdate(aviones);
		
	}

	@Override
	public void deleteById(int id) {
		
		Session P_Session = entityManager.unwrap(Session.class);
		
		Query<Aviones> T_query = P_Session.createQuery("delete from Aviones where id =: id Aviones");
		
		T_query.setParameter("id Aviones", id);
		
		T_query.executeUpdate();
		
	}
	
	

}
