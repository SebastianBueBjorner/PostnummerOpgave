package com.company;

public class PostInfo {
    private int postnummer;
    private String byNavn;

    //Constructor
    public PostInfo(int postnummer, String byNavn) {
        this.postnummer = postnummer;
        this.byNavn = byNavn;
    }

    //Getters og Setters
    public int getPostnummer() {
        return postnummer;
    }
    public String getByNavn() {
        return byNavn;
    }
    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }
    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }


    public String toString() {
        return "Postnummer: " + postnummer + "  -  By: " + byNavn;
    }

}
