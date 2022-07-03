package models;

public class Chambre {
    private int id;
    private String numEtage;
    private String numChambre;
    private TypeChambre typeChambre;
    private Pavillon pavillon;

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public String getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(String numEtage) {
        this.numEtage = numEtage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numChambre=" + numChambre + ", numEtage=" + numEtage + ", pavillon=" + pavillon
                + ", typeChambre=" + typeChambre + "]";
    }
    
}
