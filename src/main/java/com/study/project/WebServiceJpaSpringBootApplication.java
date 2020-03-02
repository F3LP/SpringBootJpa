package com.study.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceJpaSpringBootApplication {

	public static void main(String[] args) {
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		
//		User user = new User(null, "Lopes", "lopes@gmail.com", "12341234", "123456");
//		
//		Order order = new Order(null, Instant.parse("2015-01-06T14:27:07Z"), user);
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("use-jpa");
//		EntityManager em = factory.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(user);
//		em.persist(order);
//		em.getTransaction().commit();
//		
//		em.close();
//		factory.close();
//		
		SpringApplication.run(WebServiceJpaSpringBootApplication.class, args);
	}

}
