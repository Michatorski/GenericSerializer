package org.iesfm.xml;

import java.util.Objects;

public class XmlTextElement extends XmlElement{

    private String value;

    public XmlTextElement(String tagName, String value) {
        super(tagName);
        this.value = value;
    }

    public abstract  String  asString()
    {
         String tagName = "name";
         value = "Rocky";
         String res = "<" +tagName+ ">" + value + "</" +tagName+ ">" ;

         return res;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        XmlTextElement that = (XmlTextElement) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), value);
    }

    @Override
    public String toString() {
        return "XmlTextElement{" +
                "value='" + value + '\'' +
                '}';
    }
}
