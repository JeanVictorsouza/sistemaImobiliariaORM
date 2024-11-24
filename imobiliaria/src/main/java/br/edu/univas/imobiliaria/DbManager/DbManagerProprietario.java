package br.edu.univas.imobiliaria.DbManager;

import br.edu.univas.imobiliaria.*;
import javax.persistence.*;

public class DbManagerProprietario {
	private static String _persistenceName = "imobiliaria-jpa";
	
	public static Proprietario find(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Proprietario p = em.find(Proprietario.class, id);
		
		em.close();
		emf.close();
		
		return p;
	}
	
	public static void persist(Proprietario proprietario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(proprietario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

	public static void remove(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Proprietario p = em.find(Proprietario.class, id);
		em.remove(p);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void merge(Proprietario proprietarioNovo, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Proprietario pOld = em.find(Proprietario.class, id);
		
		pOld.setNome(proprietarioNovo.getNome());
		pOld.setTelefone(proprietarioNovo.getTelefone());
		pOld.setTipo(proprietarioNovo.getTipo());
		pOld.setCpf(proprietarioNovo.getCpf());
		pOld.setCnpj(proprietarioNovo.getCnpj());
		
		em.merge(pOld);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
