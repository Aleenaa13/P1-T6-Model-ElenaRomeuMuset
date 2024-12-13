package p1.t6.model.romeumusetelena;

public final class Membre {
    private int equip; // id equip
    private Jugador jugador; // id jugador
    private TipusMembre tipus; // Titular o Convidat

    public Membre(int equip, Jugador jugador, TipusMembre tipus) {
        setEquip(equip);
        setJugador(jugador);
        setTipus(tipus);
    }

    public int getEquip() {
        return equip;
    }

    public void setEquip(int equip) {
        if (equip <= 0) {
            throw new IllegalArgumentException("L'identificador de l'equip ha de ser un valor positiu.");
        }
        this.equip = equip;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public TipusMembre getTipus() {
        return tipus;
    }

    public void setTipus(TipusMembre tipus) {
        if (tipus == null) {
            throw new IllegalArgumentException("El tipus de membre no pot ser null.");
        }
        this.tipus = tipus;
    }
}
