package org.iesfm.xml;

public interface XmlSerializer<T>{
    String toXml (T value);

    XmlElement toXmlElement(T value);
}
