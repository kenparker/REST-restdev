
package com.maggioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maggioni
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Developer {
    private String name;
    private String last;

    public Developer() {
        
    }
    public Developer(String name, String last) {
        this.name = name;
        this.last = last;
    }
    
    
}
