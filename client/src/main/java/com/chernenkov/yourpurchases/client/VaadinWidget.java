package com.chernenkov.yourpurchases.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;


public class VaadinWidget extends Composite {
    interface MainUiBinder extends UiBinder<HTMLPanel, VaadinWidget>{
    }

    private static MainUiBinder ourMainUiBinder = GWT.create(MainUiBinder.class);

    public VaadinWidget(){
        initWidget(ourMainUiBinder.createAndBindUi(this));

    }

}
