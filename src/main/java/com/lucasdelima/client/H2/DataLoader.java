package com.lucasdelima.client.H2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.lucasdelima.client.entities.Cotacao;
import com.lucasdelima.client.repositories.CotacaoRepository;

@Component
@Profile("test")
public class DataLoader implements CommandLineRunner {

	@Autowired
	private CotacaoRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		Cotacao c1 = new Cotacao(null, "Bruce Wayne", 1, "11");
		Cotacao c2 = new Cotacao(null, "Martha Wayne", 2, "12");
		
		repo.saveAll(Arrays.asList(c1, c2));
	}
}