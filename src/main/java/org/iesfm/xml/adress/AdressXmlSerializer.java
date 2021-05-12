package org.iesfm.xml.adress;

import org.iesfm.xml.XmlElement;
import org.iesfm.xml.XmlSerializer;
import org.iesfm.xml.XmlTextElement;

import java.util.LinkedList;

public class AdressXmlSerializer implements XmlSerializer<Adress> {

    public static final String STREET_TAG = "street";
    public static final String NUMBER_TAG = "number";
    public static final String DOOR_TAG = "door";
    public static final String CITY_TAG = "city";
    public static final String ADRESS_TAG = "adress";

    @Override
    public String toXml(Adress adress) {

        String streetElement = "<street>" + adress.getStreet() + "</street>";
        String numberElement = "<number>" + adress.getNumber() + "</ number>";
        String doorElement = "<door>" + adress.getDoor() + "</door>";
        String cityElement = "<city>" + adress.getCity() + "</city>";

        String adressElement = "<adress>" + streetElement + numberElement + doorElement + cityElement + "</adress>";

        return adressElement;
    }

    @Override
    public XmlElement toXmlElement(Adress adress) {

        XmlElement streetElement = new XmlTextElement("street", adress.getStreet());
        XmlElement numberElement = new XmlTextElement("number", adress.getNumber() + "");
        XmlElement doorElement = new XmlTextElement("door", adress.getDoor());
        XmlElement cityElement = new XmlTextElement("city", adress.getCity());

        LinkedList<XmlElement> elements = new LinkedList<>();


        return null;
    }


}
