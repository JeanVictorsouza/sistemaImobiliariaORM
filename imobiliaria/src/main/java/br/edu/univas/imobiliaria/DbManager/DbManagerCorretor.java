package br.edu.univas.imobiliaria.DbManager;

import br.edu.univas.imobiliaria.*;
import javax.persistence.*;

public class DbManagerCorretor {
	private static String _persistenceName = "imobiliaria-jpa";
	
	public static Corretor find(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Corretor c = em.find(Corretor.class, id);
		
		em.close();
		emf.close();
		
		return c;
	}
	
	public static void persist(Corretor corretor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(corretor);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

	public static void remove(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Corretor c = em.find(Corretor.class, id);
		em.remove(c);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void merge(Corretor corretorNovo, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Corretor cOld = em.find(Corretor.class, id);
		
		cOld.setNome(corretorNovo.getNome());
		cOld.setTelefone(corretorNovo.getTelefone());
		cOld.setCpf(corretorNovo.getCpf());
		
		em.merge(cOld);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
