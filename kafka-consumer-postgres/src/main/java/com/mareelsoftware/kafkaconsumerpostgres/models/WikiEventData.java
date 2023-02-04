package com.mareelsoftware.kafkaconsumerpostgres.models;

public class WikiEventData {
    private int id;
    private String wikiEventData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
