package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TP02MateoRamirezApp {

	public static void main(String[] args) {
		System.setProperty("server.port", "8096");
		SpringApplication.run(TP02MateoRamirezApp.class, args);
	}

}