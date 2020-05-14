package com.lucasdelima.client.message;

import javax.xml.bind.JAXBIntrospector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.lucasdelima.client.entities.OpmeCotacao;
import com.lucasdelima.client.services.OpmeCotacaoService;
import com.lucasdelima.client.xsdtojava.EnviarLote;
import com.lucasdelima.client.xsdtojava.EnviarLoteResponse;
import com.lucasdelima.client.xsdtojava.LoteProposta;
import com.lucasdelima.client.xsdtojava.Proposta;

@Component
public class SoapMessage extends WebServiceGatewaySupport {

	@Autowired
	private WebServiceTemplate template;
	
	@Autowired
	private OpmeCotacaoService service;

	@Value("${default-uri}")
	private String defaultUri;

	public SoapMessage() {
		
	}

	public EnviarLoteResponse getLoteResponse() {

		EnviarLote enviarLote = new EnviarLote();
		LoteProposta loteProposta = new LoteProposta();
		Proposta proposta = new Proposta();

		OpmeCotacao cotacao = service.getCotacao();
		
		proposta.setPacienteNome(cotacao.getPacienteNome());
		proposta.setProtocolo(cotacao.getProtocolo());
		proposta.setNumeroProposta(cotacao.getNumeroProposta());

		loteProposta.setNumeroLote(1);
		loteProposta.getPropostas().add(proposta);

		enviarLote.setLote(loteProposta);

		EnviarLoteResponse enviarLoteResponse = (EnviarLoteResponse) JAXBIntrospector
				.getValue(template.marshalSendAndReceive(defaultUri, enviarLote, new SoapActionCallback(defaultUri)));
		
		return enviarLoteResponse;
	}
}