package com.lucasdelima.client.h2seeding;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.lucasdelima.client.entities.OpmeCotacao;
import com.lucasdelima.client.repositories.OpmeCotacaoRepository;

@Component
@Profile("test")
public class DbSeeding implements CommandLineRunner {

	@Autowired
	private OpmeCotacaoRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		OpmeCotacao c1 = new OpmeCotacao(null, "Bruce Wayne", 1, "11");
		OpmeCotacao c2 = new OpmeCotacao(null, "Martha Wayne", 2, "12");
		
		repo.saveAll(Arrays.asList(c1, c2));
	}
}