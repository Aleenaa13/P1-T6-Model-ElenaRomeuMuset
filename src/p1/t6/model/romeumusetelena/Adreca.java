/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1.t6.model.romeumusetelena;

/**
 *
 * @author Elena
 */
public final class Adreca {
    private String direccio;
    private String codiPostal;
    private String poblacio;

    public Adreca(String direccio, String codiPostal, String poblacio) {
        setDireccio(direccio);
        setCodiPostal(codiPostal);
        setPoblacio(poblacio);
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        if(direccio.equals("")){
            throw new IllegalArgumentException("La 'direcció' no pot ser null");
        }
        this.direccio = direccio;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        if(codiPostal.equals("")){
            throw new IllegalArgumentException("El 'codi postal' no pot ser null");
        }
        this.codiPostal = codiPostal;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        if(codiPostal.equals("")){
            throw new IllegalArgumentException("La 'poblacio' no pot ser null");
        }
        this.poblacio = poblacio;
    }
    
    
}
