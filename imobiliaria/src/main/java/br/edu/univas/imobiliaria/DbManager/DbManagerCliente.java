package br.edu.univas.imobiliaria.DbManager;

import br.edu.univas.imobiliaria.*;
import javax.persistence.*;

public class DbManagerCliente {
	private static String _persistenceName = "imobiliaria-jpa";
	
	private static Cliente _find(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Cliente c = em.find(Cliente.class, id);
		
		em.close();
		emf.close();
		
		return c;
	}
	
	public static void persist(Cliente cliente) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void find(int id) {
		Cliente c = _find(id);
		System.out.println(c.toString());
	}
	
	public static void remove(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Cliente c = em.find(Cliente.class, id);
		em.remove(c);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void merge(Cliente clienteNovo, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Cliente cOld = em.find(Cliente.class, id);
		
		cOld.setNome(clienteNovo.getNome());
		cOld.setTelefone(clienteNovo.getTelefone());
		cOld.setTipo(clienteNovo.getTipo());
		cOld.setCpf(clienteNovo.getCpf());
		cOld.setCnpj(clienteNovo.getCnpj());
		
		em.merge(cOld);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
