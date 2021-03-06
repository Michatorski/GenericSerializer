package org.iesfm.xml;

import java.util.List;
import java.util.Objects;

public class XmlComplexElement extends  XmlElement{
    private List<XmlElement> elements;

    public XmlComplexElement(String tagName, List<XmlElement> elements) {
        super(tagName);
        this.elements = elements;
    }



    public List<XmlElement> getElements() {
        return elements;
    }

    public void setElements(List<XmlElement> elements) {
        this.elements = elements;
    }

//    @Override
//    public String asString() {
//        String fatherElementOpener = "<" + getTagName() +">";
//        String fatherElementCloser = "</" + getTagName() +">";
//        StringBuilder buffer = new StringBuilder();
//
//        for (XmlElement element: elements){
//            //Construtendo un String con el bucle.
//            buffer.append(element.asString());
//            //Buffer = buffer + element;
//        }
//
//        return fatherElementOpener + buffer.toString()+ fatherElementCloser;
//    }

    @Override
    public String asString() {
        String fatherElementOpener = "<" + getTagName() +">";
        String fatherElementCloser = "</" + getTagName() +">";
        StringBuilder buffer = new StringBuilder();

        for (XmlElement element: elements){
            //Construtendo un String con el bucle.
            buffer.append(element.asString());
            //Buffer = buffer + element;
        }

        return fatherElementOpener + buffer.toString()+ fatherElementCloser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        XmlComplexElement that = (XmlComplexElement) o;
        return Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), elements);
    }

    @Override
    public String toString() {
        return "XmlComplexElement{" +
                "elements=" + elements +
                '}';
    }
}

