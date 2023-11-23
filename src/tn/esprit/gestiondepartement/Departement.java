package tn.esprit.gestiondepartement;

import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbr_employes;


    public Departement() {

    }
    public Departement(int id, String nom, int nbr_employes) {
        this.id = id;
        this.nom = nom;
        this.nbr_employes = nbr_employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setDepartement(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }

    public int getDepartement() {
        return nbr_employes;
    }



    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbr_employes=" + nbr_employes +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departement that = (Departement) o;

        if (id != that.id) return false;
        if (nbr_employes != that.nbr_employes) return false;
        return Objects.equals(nom, that.nom);
    }
    public void afficherDepartement() {
        // Code pour afficher la liste des employés
        Departement[] Departements = new Departement[0];
        for (Departement employe : Departements) {
            System.out.println(employe);
        }

}}
