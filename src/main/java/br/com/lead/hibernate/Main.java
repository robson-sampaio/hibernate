package br.com.lead.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List ;

public class Main {

	private static EntityManagerFactory entityManagerFactory;
	
	
	
	public static void main(String[] args) {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
//		Lembrete lembrete = new Lembrete();
//		lembrete.setTitulo("Fé");
//		lembrete.setDescricao("É importante");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		List<Lembrete> lembretes = null;
//		Lembrete lembrete = null;
		
		
		//Delete
		try {
			Lembrete lembrete = em.find(Lembrete.class, 1L);
			
			em.getTransaction().begin();
			em.remove(lembrete);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			
			System.out.println("DEETE: " + e.getMessage());
		}finally {
			em.close();
		}
		
//		// Editar/atualizar uma entidade
//		try {
//			Lembrete lembrete = em.find(Lembrete.class, 1L);
//			
//			lembrete.setTitulo("Reunião");
//			lembrete.setDescricao("Reunião de pesquisa 27/06");
//			
//			em.getTransaction().begin();
//			em.merge(lembrete);
//			em.getTransaction().commit();
//		}catch(Exception e) {
//			em.getTransaction().rollback();
//			
//			System.out.println("UPDATE: " + e.getMessage());
//		}finally {
//			em.close();
//		}
		
		
//      // Requisição por valor de parametro		
//		try {
//			lembretes = em.createQuery("from Lembrete l where l.titulo LIKE '%F%'").getResultList();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}finally {
//			em.close();
//		}
//		
//		if(lembretes != null) {
//			lembretes.forEach(System.out::println);
//		}
		
//		try {
//			lembrete = em.find(Lembrete.class, 1L);
//			System.out.println(lembrete);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}finally {
//			em.close();
//		}
		
		
//		// Requisição à tabela
//		try {
//			lembretes = em.createQuery("from Lembrete").getResultList();
//		}catch(Exception e) {
//			System.out.println("LIST ALL: " + e.getMessage());
//		}finally {
//			em.close();
//		}
//		
//		if(lembretes != null) {
//			lembretes.forEach(System.out::println);
//		}
		
		
//		//persistindo um objeto
//		try {
//			System.out.println("Begin try ... ");
//			em.getTransaction().begin();
//			em.persist(lembrete);
//			em.getTransaction().commit();
//		}catch(Exception e) {
//			em.getTransaction().rollback();
//			System.out.println("INSERT: " + e.getMessage());
//		}finally{
//			em.close();
//		}
		
		
		
		
	}

}
