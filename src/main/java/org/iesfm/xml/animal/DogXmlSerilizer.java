package org.iesfm.xml.animal;

import org.iesfm.xml.XmlComplexElement;
import org.iesfm.xml.XmlElement;
import org.iesfm.xml.XmlSerializer;
import org.iesfm.xml.XmlTextElement;

import java.util.LinkedList;

public class DogXmlSerilizer implements XmlSerializer<Dog> {

    public static final String NAME_TAG = "name";
    public static final String AGE_TAG= "age";
    public static final String COLOR_TAG = "calor";
    public static final String DOG_TAG = "dog";

    @Override
    public String toXml(Dog dog) {

//        //Dog (name:"Rocky", age: 1, color: white);
//        //<dog><name>Rocky</name><age>4</age><color>White</color></dog>
//
//        String nameElement = "<name>" + dog.getName() + "</name>";
//        String ageElement = "<age>" + dog.getAge() + "</age>";
//        String colorElement = "<color>" + dog.getColor() + "</color>";
//
//        String  dogElement = "<dog>" + nameElement + ageElement + colorElement + "</dog>";
//
//        return dogElement;
        return toXmlElement(dog).asString();
    }

    @Override
    public XmlElement toXmlElement(Dog dog) {

        XmlElement name = new XmlTextElement(NAME_TAG, dog.getName());
        XmlElement color = new XmlTextElement(COLOR_TAG, dog.getColor());
        XmlElement age = new XmlTextElement(AGE_TAG, dog.getAge() + "");

        LinkedList<XmlElement> elements = new LinkedList<>();

        elements.add(name);
        elements.add(color);
        elements.add(age);

       return new XmlComplexElement(DOG_TAG, elements);


    }
}
