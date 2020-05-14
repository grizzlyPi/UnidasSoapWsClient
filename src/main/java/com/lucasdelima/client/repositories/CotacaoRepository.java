package com.lucasdelima.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdelima.client.entities.Cotacao;

public interface CotacaoRepository extends JpaRepository<Cotacao, Long> {

}