package tn.esprit.gestionemployes;

import tn.esprit.gestiondepartement.Departement;

// interface generique
public interface IGestion<T> {

    public void ajouterEmploye(T t);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);

    boolean rechercherDepartement(Departement d);

    public void supprimerEmploye(T t);
    public void displayEmploye();

}
