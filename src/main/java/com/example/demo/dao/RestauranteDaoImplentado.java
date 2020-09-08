package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Restaurante;

public class RestauranteDaoImplentado implements RestauranteDao{
	
	@Autowired//el objeto que ya estaba persistido
	private SessionFactory sessionFactory;
	private  Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void crearRestaurante(Restaurante restaurante) {
		getSession().persist(restaurante);
		
	}
	@Override
	public void eliminarRestauranteById(Integer id_restaurante) {
		Restaurante restaurante=findById(id_restaurante);
		if (restaurante !=null) {
			getSession().delete(restaurante);
		}
		
	}

	@Override
	public void updateRestaurante(Restaurante restaurante) {
		getSession().update(restaurante);
	}

	@Override
	public Restaurante findById(Integer id_restaurante) {
		return getSession().get(Restaurante.class, id_restaurante);
	}

	@Override
	public List<Restaurante> todosLosRestaurantes() {
		
		return (List<Restaurante>) getSession().createQuery("from Restaurante").list();
	}
	
	@Override
	public Restaurante findByNombre(String name) {
		Restaurante restaurante=(Restaurante) getSession().createQuery("from Restaurante where = :namehql")
				                                          .setParameter("namehql", name).uniqueResult();
		return restaurante;
	}


		

}
