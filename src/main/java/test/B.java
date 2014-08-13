/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import org.eclipse.persistence.annotations.Customizer;

/**
 *
 * @author chiccomask
 */
@Entity
@Customizer(EclipseLinkSequenceCustomizer.class)
public class B extends Base {

    
    private static final long serialVersionUID = 1L;
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
