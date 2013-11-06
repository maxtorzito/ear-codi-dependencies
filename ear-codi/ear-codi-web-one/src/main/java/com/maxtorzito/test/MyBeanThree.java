/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

/**
 *
 * You can use managedbean/viewscoped or named/viewaccessscoped and the error is the same
 * 
 * You will see:
 * 
 * Caused by: java.lang.IllegalStateException: no org.apache.myfaces.extensions.cdi.core.api.provider.BeanManagerProvider in place!
 * Please ensure that you configured the CDI implementation of your choice properly. If your setup is correct, please clear all caches
 * and compiled artifacts. If there is still a problem, try one of the controlled bootstrapping add-ons for the CDI implementation you are using.
 * 
 * But if you change the from public to private then the error dissapears.
 * 
 */
@Named
@ViewAccessScoped
public class MyBeanThree implements Serializable{
    
    private String value;

    public MyBeanThree() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
