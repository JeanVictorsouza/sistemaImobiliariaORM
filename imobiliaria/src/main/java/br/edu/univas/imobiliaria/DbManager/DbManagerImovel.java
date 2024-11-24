package br.edu.univas.imobiliaria.DbManager;

import br.edu.univas.imobiliaria.*;
import javax.persistence.*;

public class DbManagerImovel {
	private static String _persistenceName = "imobiliaria-jpa";
	
	public static Imovel find(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Imovel i = em.find(Imovel.class, id);
		
		em.close();
		emf.close();
		
		return i;
	}
	
	public static void persist(Imovel imovel) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(imovel);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

	public static void remove(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Imovel i = em.find(Imovel.class, id);
		em.remove(i);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void merge(Imovel imovelNovo, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(_persistenceName);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Imovel iOld = em.find(Imovel.class, id);
		
		iOld.setCodProprietario(imovelNovo.getCodProprietario());
		iOld.setCodCorretor(imovelNovo.getCodCorretor());
		iOld.setRua(imovelNovo.getRua());
		iOld.setBairro(imovelNovo.getBairro());
		iOld.setNumero(imovelNovo.getNumero());
		iOld.setComplemento(imovelNovo.getComplemento());
		iOld.setCep(imovelNovo.getCep());
		iOld.setCidade(imovelNovo.getCidade());
		iOld.setEstado(imovelNovo.getEstado());
		iOld.setTipo(imovelNovo.getTipo());
		iOld.setMetrosQuadrados(imovelNovo.getMetrosQuadrados());
		
		em.merge(iOld);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}