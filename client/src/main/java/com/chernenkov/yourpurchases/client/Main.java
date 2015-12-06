package com.chernenkov.yourpurchases.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.Window;


public class Main implements EntryPoint {


    public void onModuleLoad() {
        RequestBuilder builder =
                new RequestBuilder(RequestBuilder.GET, "/server/rest/records/double?string=" + URL.encodeQueryString("hello"));

        builder.setCallback(new RequestCallback() {
            public void onResponseReceived(Request request, Response response) {
                Window.alert("response = " + response.getText());
            }

            public void onError(Request request, Throwable exception) {
                Window.alert("error");
            }
        });

        try {
            builder.send();
        } catch (RequestException e) {
            e.printStackTrace();
        }
    }
}
