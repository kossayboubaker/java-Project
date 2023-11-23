package tn.esprit.gestiondepartement;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet<T> implements IDepartement<T> {
    private HashSet<T> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(T t) {
        departements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (T departement : departements) {
            if (departement.toString().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(T t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(T t) {
        departements.remove(t);
    }

    @Override
    public void displayDepartement() {
        for (T departement : departements) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<T> trierDepartementById() {
        // Cette méthode n'est pas applicable pour HashSet car HashSet n'est pas trié
        return null;
    }
}