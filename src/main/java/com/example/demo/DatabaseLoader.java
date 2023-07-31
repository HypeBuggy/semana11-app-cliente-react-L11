package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repositoryI;

	@Autowired
	public DatabaseLoader(InstrumentoRepository repository) {
		this.repositoryI = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repositoryI.save(new Instrumento("Guitarra", "Cuerda", "de madera "));
		this.repositoryI.save(new Instrumento("Ukelele", "Cuerda", "pequeña y de madera "));
		this.repositoryI.save(new Instrumento("Melodica", "VIento", "color roja y brillante "));
	}
}