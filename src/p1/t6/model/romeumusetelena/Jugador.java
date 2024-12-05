/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1.t6.model.romeumusetelena;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public final class Jugador {
    private int id;
    private String nom;
    private String cognoms;
    private Adreca adreca;
    private String foto;
    private int anyFiRevisioMedica;
    private String IBAN;
    private String idLegal;
    private Date dataNaix;
    private char sexe;

    public Jugador(int id, String nom, String cognoms, Adreca adreca, String foto, int anyFiRevisioMedica, String IBAN, String idLegal, Date dataNaix, char sexe) throws GestorBDEsportsException {
        this.id = id;
        setNom(nom);
        setCognoms(cognoms);
        setAdreca(adreca);
        setFoto(foto);
        this.anyFiRevisioMedica = anyFiRevisioMedica;
        setIBAN(IBAN);
        setIdLegal(idLegal);
        setDataNaix(dataNaix);
        setSexe(sexe);
    }

    public Jugador(String nom, String cognoms, Adreca adreca, String foto, int anyFiRevisioMedica, String IBAN, String idLegal, Date dataNaix, char sexe) throws GestorBDEsportsException {
        setNom(nom);
        setCognoms(cognoms);
        setAdreca(adreca);
        setFoto(foto);
        this.anyFiRevisioMedica = anyFiRevisioMedica;
        setIBAN(IBAN);
        setIdLegal(idLegal);
        setDataNaix(dataNaix);
        setSexe(sexe);
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null) {
            throw new IllegalArgumentException("El camp 'nom' no pot ser null");
        }
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        if (cognoms == null) {
            throw new IllegalArgumentException("El camp 'cognoms' no pot ser null");
        }
        this.cognoms = cognoms;
    }

    public Adreca getAdreca() {
        return adreca;
    }

    public void setAdreca(Adreca adreca) {
        if(adreca == null){
            throw new IllegalArgumentException("El camp 'adreça' no pot ser null");
        }
        this.adreca = adreca;
    }
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        if (foto == null) {
            throw new IllegalArgumentException("El camp 'foto' no pot ser null");
        }
        this.foto = foto;
    }

    public int getAnyFiRevisioMedica() {
        return anyFiRevisioMedica;
    }
    
    ///posar que no pugui ser un any inferior a l'any actual
    public void setAnyFiRevisioMedica(int anyFiRevisioMedica) throws GestorBDEsportsException {
        if(anyFiRevisioMedica < 0){
            throw new GestorBDEsportsException("El any fi revisió mèdica no pot ser negatiu");
        }
        this.anyFiRevisioMedica = anyFiRevisioMedica;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        if (IBAN == null) {
            throw new IllegalArgumentException("El camp 'IBAN' no pot ser null");
        }
        this.IBAN = IBAN;
    }

    public String getIdLegal() {
        return idLegal;
    }

    public void setIdLegal(String idLegal) {
        if (idLegal == null) {
            throw new IllegalArgumentException("El camp 'idLegal' no pot ser null");
        }
        this.idLegal = idLegal;
    }

    public Date getDataNaix() {
        return dataNaix;
    }

    public void setDataNaix(Date dataNaix) {
        this.dataNaix = dataNaix;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) throws GestorBDEsportsException {
        if(sexe != 'H' && sexe !='D'){
            throw new GestorBDEsportsException("Sexe no valid");
        }
        this.sexe = sexe;
       
    }

    
}

