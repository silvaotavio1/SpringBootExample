package org.otavio;

import org.otavio.models.User;
import org.otavio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Otávio", "Silva"));
		userRepository.save(new User("Paulo", "Andrade"));
		userRepository.save(new User("Teste", "Pedro"));
	}
}
