package com.study.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.project.entities.Category;
import com.study.project.entities.Product;

@SpringBootApplication
public class WebServiceJpaSpringBootApplication {

	public static void main(String[] args) {
		
		
//		User user1 = new User(null, "ALopes", "lopes@gmail.com", "12341234", "123456");
//		User user2 = new User(null, "Alfredo", "alfredo@gmail.com", "43214321", "123456");
//		
//		Order order = new Order(null, Instant.parse("2020-01-06T14:27:07Z"), OrderStatus.PAID, user1);
//		Order order1 = new Order(null, Instant.parse("2020-01-06T14:27:07Z"), OrderStatus.SHIPPED, user2);
		
		Category category1 = new Category(null, "Books");
//		Category category2 = new Category(null, "Computers");
//		System.out.println("#############################################");
//		System.out.println(order);
//		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("use-jpa");
		EntityManager em = factory.createEntityManager();
		
		
		
//		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
//		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
//		
//		Order o1 = new Order();
//		o1.setMoment(Instant.parse("2019-06-20T19:53:07Z"));
//		o1.setClient(u1);
//		o1.setId(null);
//		o1.setOrderStatus(OrderStatus.PAID);
//		
//		
//		Order o2 = new Order();
//		o2.setId(null);
//		o2.setMoment(Instant.parse("2019-06-20T19:53:07Z"));
//		o2.setClient(u2);
//		o2.setOrderStatus(OrderStatus.SHIPPED);

		Product p1 = new Product(null, "O Poder do Agora", "Bom livro", 35.0, null);
		p1.getCategories().add(category1);
		
		em.getTransaction().begin();
		em.persist(category1);
		em.persist(p1);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
//		SpringApplication.run(WebServiceJpaSpringBootApplication.class, args);
	}

}
