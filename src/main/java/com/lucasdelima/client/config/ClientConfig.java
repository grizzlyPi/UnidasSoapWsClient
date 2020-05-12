package com.lucasdelima.client.config;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class ClientConfig {
	
	@Value("${defaul-uri}")
	private String defaulUri;
	
	@Value("${client-user-name}")
	private String userName;
	
	@Value("${client-user-password}")
	private String userPassword;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.lucasdelima.client.xsdtojava");
		return marshaller;	
	}
	
	@Bean
	public WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setDefaultUri(defaulUri);
		webServiceTemplate.setMarshaller(marshaller());
		webServiceTemplate.setUnmarshaller(marshaller());
		webServiceTemplate.setMessageSender(httpComponentsMessageSender());
		return webServiceTemplate;
	}
	
	@Bean
	public HttpComponentsMessageSender httpComponentsMessageSender() {
		HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();	
		// set the basic authorization credentials
		httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());		
		return httpComponentsMessageSender;
	}
	
	@Bean
	public UsernamePasswordCredentials usernamePasswordCredentials() {
		// pass the user name and password to be used
		return new UsernamePasswordCredentials(userName, userPassword);
	}
}