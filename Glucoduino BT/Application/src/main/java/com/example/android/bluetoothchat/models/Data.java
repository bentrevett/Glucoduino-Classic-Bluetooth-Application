package com.example.android.bluetoothchat.models;

/**
 * Created by bentr_000 on 11/03/2015.
 */
public class Data {
    private String header;
    private String body;
    private String date;


    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return this.header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
}