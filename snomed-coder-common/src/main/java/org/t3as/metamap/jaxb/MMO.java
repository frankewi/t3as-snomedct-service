//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.07 at 11:12:55 AM EST 
//


package org.t3as.metamap.jaxb;

/*
 * #%L
 * NICTA t3as SNOMED service common classes
 * %%
 * Copyright (C) 2014 NICTA
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining
 * it with H2, GWT, or JavaBeans Activation Framework (JAF) (or a
 * modified version of those libraries), containing parts covered by the
 * terms of the H2 License, the GWT Terms, or the Common Development and
 * Distribution License (CDDL) version 1.0 ,the licensors of this Program
 * grant you additional permission to convey the resulting work.
 * #L%
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cmdLine",
    "aAs",
    "negations",
    "utterances"
})
@XmlRootElement(name = "MMO")
public class MMO {

    @XmlElement(name = "CmdLine", required = true)
    protected CmdLine cmdLine;
    @XmlElement(name = "AAs", required = true)
    protected AAs aAs;
    @XmlElement(name = "Negations", required = true)
    protected Negations negations;
    @XmlElement(name = "Utterances", required = true)
    protected Utterances utterances;

    /**
     * Gets the value of the cmdLine property.
     * 
     * @return
     *     possible object is
     *     {@link CmdLine }
     *     
     */
    public CmdLine getCmdLine() {
        return cmdLine;
    }

    /**
     * Sets the value of the cmdLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmdLine }
     *     
     */
    public void setCmdLine(CmdLine value) {
        this.cmdLine = value;
    }

    /**
     * Gets the value of the aAs property.
     * 
     * @return
     *     possible object is
     *     {@link AAs }
     *     
     */
    public AAs getAAs() {
        return aAs;
    }

    /**
     * Sets the value of the aAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAs }
     *     
     */
    public void setAAs(AAs value) {
        this.aAs = value;
    }

    /**
     * Gets the value of the negations property.
     * 
     * @return
     *     possible object is
     *     {@link Negations }
     *     
     */
    public Negations getNegations() {
        return negations;
    }

    /**
     * Sets the value of the negations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Negations }
     *     
     */
    public void setNegations(Negations value) {
        this.negations = value;
    }

    /**
     * Gets the value of the utterances property.
     * 
     * @return
     *     possible object is
     *     {@link Utterances }
     *     
     */
    public Utterances getUtterances() {
        return utterances;
    }

    /**
     * Sets the value of the utterances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utterances }
     *     
     */
    public void setUtterances(Utterances value) {
        this.utterances = value;
    }

}
