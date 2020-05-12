//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.05.11 às 10:24:25 PM BRT 
//


package com.lucasdelima.client.xsdtojava;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de proposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="proposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anotacaoAdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cbhpmPrincipalCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cbhpmPrincipalDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigosCBHPM" type="{http://ws.sic.norti/}codigoCBHPM" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codproposta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dtAnotacaoAdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtCirurgia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtEntregaGEOPM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fornecedores" type="{http://ws.sic.norti/}fornecedorProposta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itens" type="{http://ws.sic.norti/}propostaItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="medicoCRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicoNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroProposta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pacienteCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prestadorCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prestadorEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prestadorNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prestadorTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prestadorUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recontratualizacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="respenvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoAtendimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proposta", propOrder = {
    "anexo",
    "anotacaoAdm",
    "cbhpmPrincipalCod",
    "cbhpmPrincipalDescricao",
    "codigosCBHPM",
    "codproposta",
    "dtAnotacaoAdm",
    "dtCirurgia",
    "dtEntrada",
    "dtEntregaGEOPM",
    "fornecedores",
    "guia",
    "itens",
    "medicoCRM",
    "medicoNome",
    "numeroProposta",
    "pacienteCodigo",
    "pacienteNome",
    "prestadorCNPJ",
    "prestadorEmail",
    "prestadorNome",
    "prestadorTelefone",
    "prestadorUF",
    "protocolo",
    "recontratualizacao",
    "respenvio",
    "senha",
    "tipoAtendimento"
})
public class Proposta {

    protected String anexo;
    protected String anotacaoAdm;
    protected String cbhpmPrincipalCod;
    protected String cbhpmPrincipalDescricao;
    @XmlElement(nillable = true)
    protected List<CodigoCBHPM> codigosCBHPM;
    protected int codproposta;
    protected String dtAnotacaoAdm;
    protected String dtCirurgia;
    protected String dtEntrada;
    protected String dtEntregaGEOPM;
    @XmlElement(nillable = true)
    protected List<FornecedorProposta> fornecedores;
    protected String guia;
    @XmlElement(nillable = true)
    protected List<PropostaItem> itens;
    protected String medicoCRM;
    protected String medicoNome;
    protected int numeroProposta;
    protected String pacienteCodigo;
    protected String pacienteNome;
    protected String prestadorCNPJ;
    protected String prestadorEmail;
    protected String prestadorNome;
    protected String prestadorTelefone;
    protected String prestadorUF;
    protected String protocolo;
    protected Boolean recontratualizacao;
    protected String respenvio;
    protected String senha;
    protected String tipoAtendimento;

    /**
     * Obtém o valor da propriedade anexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexo() {
        return anexo;
    }

    /**
     * Define o valor da propriedade anexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexo(String value) {
        this.anexo = value;
    }

    /**
     * Obtém o valor da propriedade anotacaoAdm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacaoAdm() {
        return anotacaoAdm;
    }

    /**
     * Define o valor da propriedade anotacaoAdm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacaoAdm(String value) {
        this.anotacaoAdm = value;
    }

    /**
     * Obtém o valor da propriedade cbhpmPrincipalCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbhpmPrincipalCod() {
        return cbhpmPrincipalCod;
    }

    /**
     * Define o valor da propriedade cbhpmPrincipalCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbhpmPrincipalCod(String value) {
        this.cbhpmPrincipalCod = value;
    }

    /**
     * Obtém o valor da propriedade cbhpmPrincipalDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbhpmPrincipalDescricao() {
        return cbhpmPrincipalDescricao;
    }

    /**
     * Define o valor da propriedade cbhpmPrincipalDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbhpmPrincipalDescricao(String value) {
        this.cbhpmPrincipalDescricao = value;
    }

    /**
     * Gets the value of the codigosCBHPM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigosCBHPM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigosCBHPM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodigoCBHPM }
     * 
     * 
     */
    public List<CodigoCBHPM> getCodigosCBHPM() {
        if (codigosCBHPM == null) {
            codigosCBHPM = new ArrayList<CodigoCBHPM>();
        }
        return this.codigosCBHPM;
    }

    /**
     * Obtém o valor da propriedade codproposta.
     * 
     */
    public int getCodproposta() {
        return codproposta;
    }

    /**
     * Define o valor da propriedade codproposta.
     * 
     */
    public void setCodproposta(int value) {
        this.codproposta = value;
    }

    /**
     * Obtém o valor da propriedade dtAnotacaoAdm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAnotacaoAdm() {
        return dtAnotacaoAdm;
    }

    /**
     * Define o valor da propriedade dtAnotacaoAdm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAnotacaoAdm(String value) {
        this.dtAnotacaoAdm = value;
    }

    /**
     * Obtém o valor da propriedade dtCirurgia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCirurgia() {
        return dtCirurgia;
    }

    /**
     * Define o valor da propriedade dtCirurgia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCirurgia(String value) {
        this.dtCirurgia = value;
    }

    /**
     * Obtém o valor da propriedade dtEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEntrada() {
        return dtEntrada;
    }

    /**
     * Define o valor da propriedade dtEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEntrada(String value) {
        this.dtEntrada = value;
    }

    /**
     * Obtém o valor da propriedade dtEntregaGEOPM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEntregaGEOPM() {
        return dtEntregaGEOPM;
    }

    /**
     * Define o valor da propriedade dtEntregaGEOPM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEntregaGEOPM(String value) {
        this.dtEntregaGEOPM = value;
    }

    /**
     * Gets the value of the fornecedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fornecedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFornecedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FornecedorProposta }
     * 
     * 
     */
    public List<FornecedorProposta> getFornecedores() {
        if (fornecedores == null) {
            fornecedores = new ArrayList<FornecedorProposta>();
        }
        return this.fornecedores;
    }

    /**
     * Obtém o valor da propriedade guia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuia() {
        return guia;
    }

    /**
     * Define o valor da propriedade guia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuia(String value) {
        this.guia = value;
    }

    /**
     * Gets the value of the itens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropostaItem }
     * 
     * 
     */
    public List<PropostaItem> getItens() {
        if (itens == null) {
            itens = new ArrayList<PropostaItem>();
        }
        return this.itens;
    }

    /**
     * Obtém o valor da propriedade medicoCRM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoCRM() {
        return medicoCRM;
    }

    /**
     * Define o valor da propriedade medicoCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoCRM(String value) {
        this.medicoCRM = value;
    }

    /**
     * Obtém o valor da propriedade medicoNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoNome() {
        return medicoNome;
    }

    /**
     * Define o valor da propriedade medicoNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoNome(String value) {
        this.medicoNome = value;
    }

    /**
     * Obtém o valor da propriedade numeroProposta.
     * 
     */
    public int getNumeroProposta() {
        return numeroProposta;
    }

    /**
     * Define o valor da propriedade numeroProposta.
     * 
     */
    public void setNumeroProposta(int value) {
        this.numeroProposta = value;
    }

    /**
     * Obtém o valor da propriedade pacienteCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteCodigo() {
        return pacienteCodigo;
    }

    /**
     * Define o valor da propriedade pacienteCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteCodigo(String value) {
        this.pacienteCodigo = value;
    }

    /**
     * Obtém o valor da propriedade pacienteNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteNome() {
        return pacienteNome;
    }

    /**
     * Define o valor da propriedade pacienteNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteNome(String value) {
        this.pacienteNome = value;
    }

    /**
     * Obtém o valor da propriedade prestadorCNPJ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorCNPJ() {
        return prestadorCNPJ;
    }

    /**
     * Define o valor da propriedade prestadorCNPJ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorCNPJ(String value) {
        this.prestadorCNPJ = value;
    }

    /**
     * Obtém o valor da propriedade prestadorEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorEmail() {
        return prestadorEmail;
    }

    /**
     * Define o valor da propriedade prestadorEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorEmail(String value) {
        this.prestadorEmail = value;
    }

    /**
     * Obtém o valor da propriedade prestadorNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorNome() {
        return prestadorNome;
    }

    /**
     * Define o valor da propriedade prestadorNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorNome(String value) {
        this.prestadorNome = value;
    }

    /**
     * Obtém o valor da propriedade prestadorTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorTelefone() {
        return prestadorTelefone;
    }

    /**
     * Define o valor da propriedade prestadorTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorTelefone(String value) {
        this.prestadorTelefone = value;
    }

    /**
     * Obtém o valor da propriedade prestadorUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorUF() {
        return prestadorUF;
    }

    /**
     * Define o valor da propriedade prestadorUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorUF(String value) {
        this.prestadorUF = value;
    }

    /**
     * Obtém o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolo(String value) {
        this.protocolo = value;
    }

    /**
     * Obtém o valor da propriedade recontratualizacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecontratualizacao() {
        return recontratualizacao;
    }

    /**
     * Define o valor da propriedade recontratualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecontratualizacao(Boolean value) {
        this.recontratualizacao = value;
    }

    /**
     * Obtém o valor da propriedade respenvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespenvio() {
        return respenvio;
    }

    /**
     * Define o valor da propriedade respenvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespenvio(String value) {
        this.respenvio = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade tipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Define o valor da propriedade tipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
    }

}
