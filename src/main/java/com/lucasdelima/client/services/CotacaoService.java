package com.lucasdelima.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdelima.client.entities.Cotacao;
import com.lucasdelima.client.repositories.CotacaoRepository;

@Service
public class CotacaoService {
	
	@Autowired
	private CotacaoRepository repo;
	
	public Cotacao getCotacao() {
		return repo.findAll().get(0);
	}
}