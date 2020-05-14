//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.05.13 às 08:46:24 PM BRT 
//


package com.lucasdelima.client.xsdtojava;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de loteProposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="loteProposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroLote" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="propostas" type="{http://ws.sic.norti/}proposta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loteProposta", propOrder = {
    "numeroLote",
    "propostas"
})
public class LoteProposta {

    protected int numeroLote;
    @XmlElement(nillable = true)
    protected List<Proposta> propostas;

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     */
    public int getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     */
    public void setNumeroLote(int value) {
        this.numeroLote = value;
    }

    /**
     * Gets the value of the propostas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propostas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropostas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proposta }
     * 
     * 
     */
    public List<Proposta> getPropostas() {
        if (propostas == null) {
            propostas = new ArrayList<Proposta>();
        }
        return this.propostas;
    }

}
