package models;

public class Boursier extends Etudiant {
    protected boolean montantBourse;
    protected TypeBourse typeBourse;

    

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }
    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }
    public boolean isMontantBourse() {
        return montantBourse;
    }
    public void setMontantBourse(boolean montantBourse) {
        this.montantBourse = montantBourse;
    }
    
}
