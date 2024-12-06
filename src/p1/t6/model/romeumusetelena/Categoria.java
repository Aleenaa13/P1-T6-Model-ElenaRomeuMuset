/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1.t6.model.romeumusetelena;

/**
 *
 * @author Usuari
 */
public class Categoria {
    private final int id;
    private final String nom;
    private final int edatMin;
    private final int edatMax;

    public Categoria(int id, String nom, int edatMin, int edatMax) {
        this.id = id;
        this.nom = nom;
        this.edatMin = edatMin;
        this.edatMax = edatMax;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getEdatMin() {
        return edatMin;
    }

    public int getEdatMax() {
        return edatMax;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nom=" + nom + ", edatMin=" + edatMin + ", edatMax=" + edatMax + '}';
    }
    
}

