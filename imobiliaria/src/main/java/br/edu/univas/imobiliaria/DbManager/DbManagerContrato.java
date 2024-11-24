package br.edu.univas.imobiliaria.DbManager;

import br.edu.univas.imobiliaria.*;
import javax.persistence.*;

//teste classe

public class DbManagerContrato {
	private static String _persistenceName = "imobiliaria-jpa";

    public DbManagerContrato() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("imobiliaria-jpa");
    	EntityManager em = emf.createEntityManager();
    }

	private static Contrato _find(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Contrato c = em.find(Contrato.class, id);
		
		em.close();
		emf.close();
		
		return c;
	}
	
	public static void persist(Contrato contrato) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(contrato);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void find(int id) {
		Contrato c = _find(id);
		System.out.println(c.toString());
	}
	
	public static void remove(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Contrato c = em.find(Contrato.class, id);
		em.remove(c);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void merge(Contrato contratoNovo, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Contrato cOld = em.find(Contrato.class, id);
		
		cOld.setCod(contratoNovo.getCod());
		cOld.setCodCliente(contratoNovo.getCodCliente());
		cOld.setCodImovel(contratoNovo.getCodImovel());
		cOld.setDataContrato(contratoNovo.getDataContrato());
		cOld.setFormaPagamento(contratoNovo.getFormaPagamento());
		cOld.setTipo(contratoNovo.getTipo());
		cOld.setDataVenda(contratoNovo.getDataVenda());
		cOld.setValorVenda(contratoNovo.getValorVenda());
		cOld.setDataEntrada (contratoNovo.getDataEntrada ());
		cOld.setDataSaida(contratoNovo.getDataSaida());
		cOld.setValorMensalidade(contratoNovo.getValorMensalidade());
		
		em.merge(cOld);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
}