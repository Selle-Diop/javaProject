package models;

public class Etudiant {
    protected int id;
    protected String nomCoplet;
    protected String email;
    protected String matricule;
    protected String dateNaissance;
    protected String telephone;





    




    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomCoplet() {
        return nomCoplet;
    }

    public void setNomCoplet(String nomCoplet) {
        this.nomCoplet = nomCoplet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
