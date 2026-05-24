package igfinal.model;

public class VilleTouristique {

    private String nom;

    private String pays;

    private String description;

    private boolean visitee;



    public VilleTouristique(String nom, String pays, String description, boolean visitee) {
        this.nom = nom;
        this.pays = pays;
        this.description = description;
        this.visitee = visitee;
    }

    public String getNom() {
        return nom;
    }

    public String getPays() {
        return pays;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVisitee() {
        return visitee;
    }


    @Override
    public String toString() {
        return nom + " - " + pays;
    }

}