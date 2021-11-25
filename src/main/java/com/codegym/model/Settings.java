package com.codegym.model;

public class Settings {
    private String Languages;
    private int pageSize;
    private boolean spamsFilter;
    private  String Signature;

    public Settings(String languages, int pageSize, boolean spamsFilter, String signature) {
        Languages = languages;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        Signature = signature;
    }

    public Settings() {
    }

    public String getLanguages() {
        return Languages;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
