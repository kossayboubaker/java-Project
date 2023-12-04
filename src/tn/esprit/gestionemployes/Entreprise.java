package tn.esprit.gestionemployes;

import tn.esprit.gestiondepartement.Departement;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Entreprise implements IGestion<Employe> {

    Map<Employe, Departement> employes = new HashMap<>();
    private TreeMap<Object, Object> entreprise;

    @Override
    public void ajouterEmploye(Employe employe) {

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return entreprise.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {

        TreeMap<Object, Object> entreprise = null;
        return entreprise.containsKey(d);
    }

    @Override
    public void supprimerEmploye(Employe employe) {

    }

    @Override
    public void displayEmploye() {

    }

// to do
    // trier les employes par nom de département
    //trier les employes par leurs noms
}
