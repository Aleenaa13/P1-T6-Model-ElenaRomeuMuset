package p1.t6.model.romeumusetelena;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
          this.password = encriptarContrasenya(password);
    }
    
    /**
     * Encripta una contraseña usando SHA-1
     * @param contrasenya La contraseña a encriptar
     * @return La contraseña encriptada con el prefijo "sha1-"
     */
    public static String encriptarContrasenya(String contrasenya) {
        // Si la contraseña ya está cifrada, la devolvemos directamente
        if (contrasenya.startsWith("ERM-SHA1")) {
            return contrasenya;
        }
        
        try {
            // Crear instancia de MessageDigest con SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            
            // Convertir la contraseña a bytes y calcular el hash
            byte[] hash = md.digest(contrasenya.getBytes());
            
            // Convertir el hash a formato hexadecimal
            StringBuilder sb = new StringBuilder();
            sb.append("ERM-SHA1");
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al cifrar la contrasenya: " + e.getMessage());
        }
    }
}
