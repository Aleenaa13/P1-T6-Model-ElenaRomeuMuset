/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1.t6.model.romeumusetelena;

/**
 *
 * @author Usuari
 */
public final class Equip {
    private int id;
    private String nom;
    private TipusEquip tipus;
    private int anyTemporada;
    private int idCategoria;

    public Equip(int id, String nom, TipusEquip tipus, int anyTemporada, int idCategoria) {
        this.id = id;
        setNom(nom);
        setTipus(tipus);
        this.anyTemporada = anyTemporada;
        this.idCategoria = idCategoria;
    }
    
    //aquest constructor serveix per introduir dades a la base de dades ja que el id és autonúmeric
    public Equip(String nom, TipusEquip tipus, int anyTemporada, int idCategoria) {
        setNom(nom);
        setTipus(tipus);
        this.anyTemporada = anyTemporada;
        this.idCategoria = idCategoria;
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

    public TipusEquip getTipus() {
        return tipus;
    }

    public void setTipus(TipusEquip tipus) {
        if (tipus == null) {
            throw new IllegalArgumentException("El camp 'tipus' no pot ser null");
        }
        this.tipus = tipus;
    }

    public int getAnyTemporada() {
        return anyTemporada;
    }

    public void setAnyTemporada(int anyTemporada) {
        this.anyTemporada = anyTemporada;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return  nom + " " + anyTemporada;
    }
    
    
    
    
}

