package org.iesfm.xml.adress;

import org.iesfm.xml.XmlSerializer;

public class AdressXmlSerializer implements XmlSerializer <Adress> {
    @Override
    public String toXml(Adress adress) {

        String streetElement = "<street>" + adress.getStreet() + "</street>";
        String numberElement ="<number>" + adress.getNumber() + "</ number>";
        String doorElement = "<door>" + adress.getDoor() + "</door>";
        String cityElement ="<city>" + adress.getCity() + "</city>";

        String adressElement = "<adress>" + streetElement + numberElement + doorElement + cityElement + "</adress>";

        return adressElement;
    }
}
