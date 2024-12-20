/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1.t6.model.romeumusetelena;

/**
 *
 * @author Usuari
 */
public class Temporada {
    private int any;

    public Temporada(int any) {
        this.any = any;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return any+"";
    }

    
}

