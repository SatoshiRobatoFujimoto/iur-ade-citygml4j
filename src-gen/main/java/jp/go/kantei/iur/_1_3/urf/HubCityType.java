//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HubCityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HubCityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}_GenericApplicationPropertyOfHubCity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HubCityType", propOrder = {
    "_GenericApplicationPropertyOfHubCity"
})
public class HubCityType
    extends UrbanFunctionType
{

    @XmlElementRef(name = "_GenericApplicationPropertyOfHubCity", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfHubCity;

    /**
     * Gets the value of the genericApplicationPropertyOfHubCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfHubCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfHubCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfHubCity() {
        if (_GenericApplicationPropertyOfHubCity == null) {
            _GenericApplicationPropertyOfHubCity = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfHubCity;
    }

    public boolean isSet_GenericApplicationPropertyOfHubCity() {
        return ((this._GenericApplicationPropertyOfHubCity!= null)&&(!this._GenericApplicationPropertyOfHubCity.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfHubCity() {
        this._GenericApplicationPropertyOfHubCity = null;
    }

}
