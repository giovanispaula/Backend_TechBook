package com.techbook.techbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechbookApplication implements CommandLineRunner{


	public static void main(String[] args) throws Exception{
		SpringApplication.run(TechbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicação startada");
	}

}
