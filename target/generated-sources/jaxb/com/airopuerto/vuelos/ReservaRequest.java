//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.04 a las 09:10:41 AM CST 
//


package com.airopuerto.vuelos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompaniaDeVuelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombrePasajero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companiaDeVuelo",
    "nombrePasajero"
})
@XmlRootElement(name = "ReservaRequest")
public class ReservaRequest {

    @XmlElement(name = "CompaniaDeVuelo", required = true)
    protected String companiaDeVuelo;
    @XmlElement(name = "NombrePasajero", required = true)
    protected String nombrePasajero;

    /**
     * Obtiene el valor de la propiedad companiaDeVuelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompaniaDeVuelo() {
        return companiaDeVuelo;
    }

    /**
     * Define el valor de la propiedad companiaDeVuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompaniaDeVuelo(String value) {
        this.companiaDeVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    /**
     * Define el valor de la propiedad nombrePasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePasajero(String value) {
        this.nombrePasajero = value;
    }

}
