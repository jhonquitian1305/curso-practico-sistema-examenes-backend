package com.sistema.examenes;

import com.sistema.examenes.entities.Rol;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.entities.UserRol;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user = new User();
		user.setName("Cristian");
		user.setLastname("Ramirez");
		user.setUsername("cristian");
		user.setPassword("12345");
		user.setEmail("c1@gmail.com");
		user.setPhone("849184881");
		user.setProfile("profile.png");

		Rol rol = new Rol();
		rol.setName("ADMIN");

		Set<UserRol> userRoles = new HashSet<>();
		UserRol userRol = new UserRol();
		userRol.setRol(rol);
		userRol.setUser(user);
		userRoles.add(userRol);

		User userSaved = userService.saveUser(user, userRoles);
		System.out.println(userSaved.getUsername());*/
	}
}
