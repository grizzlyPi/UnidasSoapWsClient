package com.lucasdelima.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdelima.client.entities.OpmeCotacao;
import com.lucasdelima.client.repositories.OpmeCotacaoRepository;

@Service
public class OpmeCotacaoService {
	
	@Autowired
	private OpmeCotacaoRepository repo;
	
	public OpmeCotacao getCotacao() {
		return repo.findAll().get(0);
	}
}