package p1.t6.model.romeumusetelena;

public final class Usuari {
    private String login;
    private String nom;
    private String password;

    public Usuari(String login, String nom, String password) {
        setLogin(login);
        setNom(nom);
        setPassword(password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null || login.length() < 4) {
            throw new IllegalArgumentException("El login no pot ser null i ha de tenir almenys 4 caràcters.");
        }
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.length() < 4) {
            throw new IllegalArgumentException("El nom no pot ser null i ha de tenir almenys 4 caràcters.");
        }
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("La contrasenya no pot ser null i ha de tenir almenys 6 caràcters.");
        }
        this.password = password;
    }
}
