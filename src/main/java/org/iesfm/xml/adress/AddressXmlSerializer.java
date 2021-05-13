package org.iesfm.xml.adress;

import org.iesfm.xml.XmlComplexElement;
import org.iesfm.xml.XmlElement;
import org.iesfm.xml.XmlSerializer;
import org.iesfm.xml.XmlTextElement;

import java.util.LinkedList;

public class AddressXmlSerializer implements XmlSerializer<Address> {

    public static final String STREET_TAG = "street";
    public static final String NUMBER_TAG = "number";
    public static final String DOOR_TAG = "door";
    public static final String CITY_TAG = "city";

    // tag adress, elemento compuesto
    public static final String ADDRESS_TAG = "adress";

    @Override
    public String toXml(Address address) {
//
//        String streetElement = "<street>" + adress.getStreet() + "</street>";
//        String numberElement = "<number>" + adress.getNumber() + "</ number>";
//        String doorElement = "<door>" + adress.getDoor() + "</door>";
//        String cityElement = "<city>" + adress.getCity() + "</city>";
//
//        String addressElement = "<address>" + streetElement + numberElement + doorElement + cityElement + "</adress>";
//
//        return addressElement;

        return toXmlElement(address).asString();
    }

    @Override
    public XmlElement toXmlElement(Address address) {

        XmlElement streetElement = new XmlTextElement(STREET_TAG, address.getStreet());
        XmlElement numberElement = new XmlTextElement(NUMBER_TAG, address.getNumber() + "");
        XmlElement doorElement = new XmlTextElement(DOOR_TAG, address.getDoor());
        XmlElement cityElement = new XmlTextElement(CITY_TAG, address.getCity());


        LinkedList<XmlElement> elements = new LinkedList<>();
        elements.add(streetElement);
        elements.add(numberElement);
        elements.add(doorElement);
        elements.add(cityElement);

      return  new XmlComplexElement(ADDRESS_TAG, elements );

    }


}
