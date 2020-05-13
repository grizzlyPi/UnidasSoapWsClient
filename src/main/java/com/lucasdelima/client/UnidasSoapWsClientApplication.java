package com.lucasdelima.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lucasdelima.client.message.SoapMessage;
import com.lucasdelima.client.xsdtojava.EnviarLoteResponse;

@SpringBootApplication
public class UnidasSoapWsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidasSoapWsClientApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(SoapMessage msg) {
		return args -> {
			EnviarLoteResponse enviarLoteResponse = msg.getLoteResponse();
			System.out.println("Got Response as below ========= : ");
			System.out.println("Comfirmation: " + enviarLoteResponse.getReturn().getCodigo());
			System.out.println("Error Messsage: " + enviarLoteResponse.getReturn().getMensagem());
		};
	}
}