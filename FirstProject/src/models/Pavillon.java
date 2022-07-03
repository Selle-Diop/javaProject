package models;

public class Pavillon {
    private int id;
    private int nombreEtage;
    private int numPav;

    public int getNumPav() {
        return numPav;
    }

    public void setNumPav(int numPav) {
        this.numPav = numPav;
    }

    public int getNombreEtage() {
        return nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nombreEtage=" + nombreEtage + ", numPav=" + numPav + "]";
    }
}
