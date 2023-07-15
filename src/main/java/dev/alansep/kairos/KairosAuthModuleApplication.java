package dev.alansep.kairos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class KairosAuthModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KairosAuthModuleApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("adminadmin"));
	}

}
