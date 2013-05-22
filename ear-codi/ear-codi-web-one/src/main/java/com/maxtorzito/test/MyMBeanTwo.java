package com.maxtorzito.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.config.view.View;
import org.apache.myfaces.extensions.cdi.core.api.config.view.ViewConfig;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;
import org.apache.myfaces.extensions.cdi.jsf.api.config.view.InitView;
import org.apache.myfaces.extensions.cdi.jsf.api.config.view.PreRenderView;

@Named
@ViewAccessScoped
@View(Index.class)
public class MyMBeanTwo implements Serializable, ViewConfig {

    private String messagePostConstruct;
    private String messageInitView;
    private String messagePreRenderView;

    @PostConstruct
    public void myPostConstruct() {
        messagePostConstruct = "HI, IM PostConstruct";
    }

    @InitView
    public void myInitView() {
        messageInitView = "HI, IM InitView";
    }

    @PreRenderView
    protected void preRenderView() {
        messagePreRenderView = "HI, IM PreRenderView";
    }

    public String getMessageInitView() {
        return messageInitView;
    }

    public void setMessageInitView(String messageInitView) {
        this.messageInitView = messageInitView;
    }

    public String getMessagePostConstruct() {
        return messagePostConstruct;
    }

    public void setMessagePostConstruct(String messagePostConstruct) {
        this.messagePostConstruct = messagePostConstruct;
    }

    public String getMessagePreRenderView() {
        return messagePreRenderView;
    }

    public void setMessagePreRenderView(String messagePreRenderView) {
        this.messagePreRenderView = messagePreRenderView;
    }
}