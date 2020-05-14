package com.lucasdelima.client.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoteProposta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Integer numeroProposta;
	private String dtEntrada;
	private String senha;
	private String protocolo;
	private String anexo;
	private String pacienteNome;
	private String pacienteCodigo;
	private String tipoAtendimento;
	private String dtEntregaGEOPM;
	private String prestadorNome;
	private String prestadorCNPJ;
	private String prestadorUF;
	private String cbhpmPrincipalCod;
	private String cbhpmPrincipalDescricao;
	private String dtAnotacaoAdm;
	
	public LoteProposta() {		
	}

	public LoteProposta(Long id, Integer numeroProposta, String dtEntrada, String senha, String protocolo, String anexo,
			String pacienteNome, String pacienteCodigo, String tipoAtendimento, String dtEntregaGEOPM,
			String prestadorNome, String prestadorCNPJ, String prestadorUF, String cbhpmPrincipalCod,
			String cbhpmPrincipalDescricao, String dtAnotacaoAdm) {
		super();
		Id = id;
		this.numeroProposta = numeroProposta;
		this.dtEntrada = dtEntrada;
		this.senha = senha;
		this.protocolo = protocolo;
		this.anexo = anexo;
		this.pacienteNome = pacienteNome;
		this.pacienteCodigo = pacienteCodigo;
		this.tipoAtendimento = tipoAtendimento;
		this.dtEntregaGEOPM = dtEntregaGEOPM;
		this.prestadorNome = prestadorNome;
		this.prestadorCNPJ = prestadorCNPJ;
		this.prestadorUF = prestadorUF;
		this.cbhpmPrincipalCod = cbhpmPrincipalCod;
		this.cbhpmPrincipalDescricao = cbhpmPrincipalDescricao;
		this.dtAnotacaoAdm = dtAnotacaoAdm;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getNumeroProposta() {
		return numeroProposta;
	}

	public void setNumeroProposta(Integer numeroProposta) {
		this.numeroProposta = numeroProposta;
	}

	public String getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getPacienteNome() {
		return pacienteNome;
	}

	public void setPacienteNome(String pacienteNome) {
		this.pacienteNome = pacienteNome;
	}

	public String getPacienteCodigo() {
		return pacienteCodigo;
	}

	public void setPacienteCodigo(String pacienteCodigo) {
		this.pacienteCodigo = pacienteCodigo;
	}

	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public String getDtEntregaGEOPM() {
		return dtEntregaGEOPM;
	}

	public void setDtEntregaGEOPM(String dtEntregaGEOPM) {
		this.dtEntregaGEOPM = dtEntregaGEOPM;
	}

	public String getPrestadorNome() {
		return prestadorNome;
	}

	public void setPrestadorNome(String prestadorNome) {
		this.prestadorNome = prestadorNome;
	}

	public String getPrestadorCNPJ() {
		return prestadorCNPJ;
	}

	public void setPrestadorCNPJ(String prestadorCNPJ) {
		this.prestadorCNPJ = prestadorCNPJ;
	}

	public String getPrestadorUF() {
		return prestadorUF;
	}

	public void setPrestadorUF(String prestadorUF) {
		this.prestadorUF = prestadorUF;
	}

	public String getCbhpmPrincipalCod() {
		return cbhpmPrincipalCod;
	}

	public void setCbhpmPrincipalCod(String cbhpmPrincipalCod) {
		this.cbhpmPrincipalCod = cbhpmPrincipalCod;
	}

	public String getCbhpmPrincipalDescricao() {
		return cbhpmPrincipalDescricao;
	}

	public void setCbhpmPrincipalDescricao(String cbhpmPrincipalDescricao) {
		this.cbhpmPrincipalDescricao = cbhpmPrincipalDescricao;
	}

	public String getDtAnotacaoAdm() {
		return dtAnotacaoAdm;
	}

	public void setDtAnotacaoAdm(String dtAnotacaoAdm) {
		this.dtAnotacaoAdm = dtAnotacaoAdm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoteProposta other = (LoteProposta) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
}