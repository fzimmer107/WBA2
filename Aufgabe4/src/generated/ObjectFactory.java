//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.11 um 05:24:53 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Rezepte_QNAME = new QName("", "rezepte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RezepteType }
     * 
     */
    public RezepteType createRezepteType() {
        return new RezepteType();
    }

    /**
     * Create an instance of {@link RType }
     * 
     */
    public RType createRType() {
        return new RType();
    }

    /**
     * Create an instance of {@link BrennType }
     * 
     */
    public BrennType createBrennType() {
        return new BrennType();
    }

    /**
     * Create an instance of {@link ZutatenType }
     * 
     */
    public ZutatenType createZutatenType() {
        return new ZutatenType();
    }

    /**
     * Create an instance of {@link ZType }
     * 
     */
    public ZType createZType() {
        return new ZType();
    }

    /**
     * Create an instance of {@link KType }
     * 
     */
    public KType createKType() {
        return new KType();
    }

    /**
     * Create an instance of {@link KommentarType }
     * 
     */
    public KommentarType createKommentarType() {
        return new KommentarType();
    }

    /**
     * Create an instance of {@link FotosType }
     * 
     */
    public FotosType createFotosType() {
        return new FotosType();
    }

    /**
     * Create an instance of {@link FType }
     * 
     */
    public FType createFType() {
        return new FType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RezepteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rezepte")
    public JAXBElement<RezepteType> createRezepte(RezepteType value) {
        return new JAXBElement<RezepteType>(_Rezepte_QNAME, RezepteType.class, null, value);
    }

}
