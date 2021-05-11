package org.iesfm.xml.animal;

import org.iesfm.xml.XmlSerializer;

public class DogXmlSerilizer implements XmlSerializer<Dog> {
    @Override
    public String toXml(Dog dog) {

        //Dog (name:"Rocky", age: 1, color: white);
        //<dog><name>Rocky</name><age>4</age><color>White</color></dog>

        String nameElement = "<name>" + dog.getName() + "</name>";
        String ageElement = "<age>" + dog.getAge() + "</age>";
        String colorElement = "<color>" + dog.getColor() + "</color>";

        String  dogElement = "<dog>" + nameElement + ageElement + colorElement + "</dog>";

        return dogElement;
    }
}
