//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.04 a las 09:10:41 AM CST 
//


package com.airopuerto.vuelos;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.airopuerto.vuelos package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.airopuerto.vuelos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstadoRequest }
     * 
     */
    public EstadoRequest createEstadoRequest() {
        return new EstadoRequest();
    }

    /**
     * Create an instance of {@link EstadoResponse }
     * 
     */
    public EstadoResponse createEstadoResponse() {
        return new EstadoResponse();
    }

    /**
     * Create an instance of {@link ReservaRequest }
     * 
     */
    public ReservaRequest createReservaRequest() {
        return new ReservaRequest();
    }

    /**
     * Create an instance of {@link ReservaResponse }
     * 
     */
    public ReservaResponse createReservaResponse() {
        return new ReservaResponse();
    }

}
