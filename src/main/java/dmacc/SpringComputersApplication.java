package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Computers;
import dmacc.beans.OperatingSystem;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputersRepository;

@SpringBootApplication
public class SpringComputersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
		/*
		@Autowired
		ComputersRepository repo;
	
		
		@Override
		public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		ApplicationContext appContext = new
	AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Computers c = appContext.getBean("computers",
	Computers.class);
		c.setProcessor("M2 Max");
		repo.save(c);
		
		Computers x = new Computers("Dell", "XPS 15", "Intel Core i7", 16, 512.00);
		OperatingSystem w = new OperatingSystem("Windows", 11, "x64");
		x.setOperatingSystem(w);
		repo.save(x);
		
		
		List<Computers> allMyComputers = repo.findAll();
		for(Computers systems: allMyComputers) {
			System.out.println(systems.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	*/

}
