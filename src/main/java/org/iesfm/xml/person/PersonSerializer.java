package org.iesfm.xml.person;

import org.iesfm.xml.XmlElement;
import org.iesfm.xml.XmlSerializer;
import org.iesfm.xml.XmlTextElement;

public class PersonSerializer implements XmlSerializer<Person> {

    private static final String NAME_TAG="name";
    private static final String SURNAME_TAG="surname";
    private static final String ADDRESS_TAG="address";

    private static final String PERSON_TAG="person";
    @Override
    public String toXml(Person person) {
        return null;
    }

    @Override
    public XmlElement toXmlElement(Person person) {

        XmlTextElement nameElememt = new XmlTextElement(NAME_TAG, person.getName());
        XmlTextElement surnameElememt = new XmlTextElement(SURNAME_TAG, person.getSurname());
        XmlTextElement addressElememt = new XmlTextElement(ADDRESS_TAG, person.getAdress());
        return null;
    }
}
