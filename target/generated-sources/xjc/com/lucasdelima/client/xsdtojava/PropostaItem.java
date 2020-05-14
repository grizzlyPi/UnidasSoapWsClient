//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.05.14 às 07:41:40 PM BRT 
//


package com.lucasdelima.client.xsdtojava;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de propostaItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="propostaItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnpjValorReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoANVISA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoInternoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoTUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="similarA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propostaItem", propOrder = {
    "cnpjValorReferencia",
    "codigoANVISA",
    "codigoInternoPostal",
    "codigoTUS",
    "descricaoItem",
    "kit",
    "numero",
    "quantidade",
    "similarA",
    "unidade",
    "valorReferencia"
})
public class PropostaItem {

    protected String cnpjValorReferencia;
    protected String codigoANVISA;
    protected String codigoInternoPostal;
    protected String codigoTUS;
    protected String descricaoItem;
    protected int kit;
    protected int numero;
    protected int quantidade;
    protected int similarA;
    protected String unidade;
    protected BigDecimal valorReferencia;

    /**
     * Obtém o valor da propriedade cnpjValorReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjValorReferencia() {
        return cnpjValorReferencia;
    }

    /**
     * Define o valor da propriedade cnpjValorReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjValorReferencia(String value) {
        this.cnpjValorReferencia = value;
    }

    /**
     * Obtém o valor da propriedade codigoANVISA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoANVISA() {
        return codigoANVISA;
    }

    /**
     * Define o valor da propriedade codigoANVISA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoANVISA(String value) {
        this.codigoANVISA = value;
    }

    /**
     * Obtém o valor da propriedade codigoInternoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInternoPostal() {
        return codigoInternoPostal;
    }

    /**
     * Define o valor da propriedade codigoInternoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInternoPostal(String value) {
        this.codigoInternoPostal = value;
    }

    /**
     * Obtém o valor da propriedade codigoTUS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTUS() {
        return codigoTUS;
    }

    /**
     * Define o valor da propriedade codigoTUS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTUS(String value) {
        this.codigoTUS = value;
    }

    /**
     * Obtém o valor da propriedade descricaoItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoItem() {
        return descricaoItem;
    }

    /**
     * Define o valor da propriedade descricaoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoItem(String value) {
        this.descricaoItem = value;
    }

    /**
     * Obtém o valor da propriedade kit.
     * 
     */
    public int getKit() {
        return kit;
    }

    /**
     * Define o valor da propriedade kit.
     * 
     */
    public void setKit(int value) {
        this.kit = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade similarA.
     * 
     */
    public int getSimilarA() {
        return similarA;
    }

    /**
     * Define o valor da propriedade similarA.
     * 
     */
    public void setSimilarA(int value) {
        this.similarA = value;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidade(String value) {
        this.unidade = value;
    }

    /**
     * Obtém o valor da propriedade valorReferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorReferencia() {
        return valorReferencia;
    }

    /**
     * Define o valor da propriedade valorReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorReferencia(BigDecimal value) {
        this.valorReferencia = value;
    }

}
