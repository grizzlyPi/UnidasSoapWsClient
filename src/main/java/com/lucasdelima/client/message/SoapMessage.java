package com.lucasdelima.client.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.lucasdelima.client.xsdtojava.EnviarLote;
import com.lucasdelima.client.xsdtojava.EnviarLoteResponse;
import com.lucasdelima.client.xsdtojava.LoteProposta;
import com.lucasdelima.client.xsdtojava.Proposta;

@Component
public class SoapMessage extends WebServiceGatewaySupport{
	
	@Autowired
	private WebServiceTemplate template;
	
	@Value("${default-uri}")
	private String defaultUri;
	
	public EnviarLoteResponse geLotetResponse() {
		
		EnviarLote enviarLote = new EnviarLote();
		LoteProposta loteProposta = new LoteProposta();
		Proposta proposta = new Proposta();
		
		proposta.setPacienteNome("Alex Green");
		proposta.setAnotacaoAdm("This is a java test!");
		proposta.setNumeroProposta(1);
		proposta.setProtocolo("123");
		proposta.setAnexo("0360");
		
		loteProposta.setNumeroLote(99);
		loteProposta.getPropostas().add(proposta);
		
		enviarLote.setLote(loteProposta);
		
		EnviarLoteResponse enviarLoteResponse =  (EnviarLoteResponse) template
				.marshalSendAndReceive(defaultUri, enviarLote, new SoapActionCallback(defaultUri));
		
		return enviarLoteResponse;	
	}
}