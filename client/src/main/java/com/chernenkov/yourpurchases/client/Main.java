package com.chernenkov.yourpurchases.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.vaadin.polymer.paper.widget.PaperButton;


public class Main implements EntryPoint {


    public void onModuleLoad() {

        PaperButton button = new PaperButton("Press me!");
        button.setRaised(true);
        RootPanel.get().add(button);
    }
}
