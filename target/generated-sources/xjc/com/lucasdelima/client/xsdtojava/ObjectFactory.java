//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.05.13 às 08:46:24 PM BRT 
//


package com.lucasdelima.client.xsdtojava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lucasdelima.client.xsdtojava package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnviarLote_QNAME = new QName("http://ws.sic.norti/", "enviarLote");
    private final static QName _EnviarLoteResponse_QNAME = new QName("http://ws.sic.norti/", "enviarLoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lucasdelima.client.xsdtojava
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarLote }
     * 
     */
    public EnviarLote createEnviarLote() {
        return new EnviarLote();
    }

    /**
     * Create an instance of {@link EnviarLoteResponse }
     * 
     */
    public EnviarLoteResponse createEnviarLoteResponse() {
        return new EnviarLoteResponse();
    }

    /**
     * Create an instance of {@link LoteProposta }
     * 
     */
    public LoteProposta createLoteProposta() {
        return new LoteProposta();
    }

    /**
     * Create an instance of {@link Proposta }
     * 
     */
    public Proposta createProposta() {
        return new Proposta();
    }

    /**
     * Create an instance of {@link CodigoCBHPM }
     * 
     */
    public CodigoCBHPM createCodigoCBHPM() {
        return new CodigoCBHPM();
    }

    /**
     * Create an instance of {@link FornecedorProposta }
     * 
     */
    public FornecedorProposta createFornecedorProposta() {
        return new FornecedorProposta();
    }

    /**
     * Create an instance of {@link PropostaItem }
     * 
     */
    public PropostaItem createPropostaItem() {
        return new PropostaItem();
    }

    /**
     * Create an instance of {@link RespostaEnviarLote }
     * 
     */
    public RespostaEnviarLote createRespostaEnviarLote() {
        return new RespostaEnviarLote();
    }

    /**
     * Create an instance of {@link RespostaCriarProposta }
     * 
     */
    public RespostaCriarProposta createRespostaCriarProposta() {
        return new RespostaCriarProposta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLote }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.sic.norti/", name = "enviarLote")
    public JAXBElement<EnviarLote> createEnviarLote(EnviarLote value) {
        return new JAXBElement<EnviarLote>(_EnviarLote_QNAME, EnviarLote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLoteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLoteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.sic.norti/", name = "enviarLoteResponse")
    public JAXBElement<EnviarLoteResponse> createEnviarLoteResponse(EnviarLoteResponse value) {
        return new JAXBElement<EnviarLoteResponse>(_EnviarLoteResponse_QNAME, EnviarLoteResponse.class, null, value);
    }

}
