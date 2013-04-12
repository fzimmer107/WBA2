//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.11 um 05:24:53 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fotos" type="{}fotosType"/>
 *         &lt;element name="zutaten" type="{}zutatenType"/>
 *         &lt;element name="portionen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schwierigkeit" type="{}schwType"/>
 *         &lt;element name="brennwert" type="{}brennType"/>
 *         &lt;element name="zubereitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommentare" type="{}kommentarType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rType", propOrder = {
    "titel",
    "fotos",
    "zutaten",
    "portionen",
    "arbeitszeit",
    "schwierigkeit",
    "brennwert",
    "zubereitung",
    "kommentare"
})
public class RType {

    @XmlElement(required = true)
    protected String titel;
    @XmlElement(required = true)
    protected FotosType fotos;
    @XmlElement(required = true)
    protected ZutatenType zutaten;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portionen;
    @XmlElement(required = true)
    protected String arbeitszeit;
    @XmlElement(required = true)
    protected SchwType schwierigkeit;
    @XmlElement(required = true)
    protected BrennType brennwert;
    @XmlElement(required = true)
    protected String zubereitung;
    @XmlElement(required = true)
    protected KommentarType kommentare;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der fotos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FotosType }
     *     
     */
    public FotosType getFotos() {
        return fotos;
    }

    /**
     * Legt den Wert der fotos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FotosType }
     *     
     */
    public void setFotos(FotosType value) {
        this.fotos = value;
    }

    /**
     * Ruft den Wert der zutaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZutatenType }
     *     
     */
    public ZutatenType getZutaten() {
        return zutaten;
    }

    /**
     * Legt den Wert der zutaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatenType }
     *     
     */
    public void setZutaten(ZutatenType value) {
        this.zutaten = value;
    }

    /**
     * Ruft den Wert der portionen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortionen() {
        return portionen;
    }

    /**
     * Legt den Wert der portionen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortionen(BigInteger value) {
        this.portionen = value;
    }

    /**
     * Ruft den Wert der arbeitszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Legt den Wert der arbeitszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeitszeit(String value) {
        this.arbeitszeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SchwType }
     *     
     */
    public SchwType getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Legt den Wert der schwierigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SchwType }
     *     
     */
    public void setSchwierigkeit(SchwType value) {
        this.schwierigkeit = value;
    }

    /**
     * Ruft den Wert der brennwert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrennType }
     *     
     */
    public BrennType getBrennwert() {
        return brennwert;
    }

    /**
     * Legt den Wert der brennwert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrennType }
     *     
     */
    public void setBrennwert(BrennType value) {
        this.brennwert = value;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitung(String value) {
        this.zubereitung = value;
    }

    /**
     * Ruft den Wert der kommentare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KommentarType }
     *     
     */
    public KommentarType getKommentare() {
        return kommentare;
    }

    /**
     * Legt den Wert der kommentare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KommentarType }
     *     
     */
    public void setKommentare(KommentarType value) {
        this.kommentare = value;
    }

}
