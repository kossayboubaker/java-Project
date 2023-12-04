package tn.esprit.gestionemployes;

import tn.esprit.gestiondepartement.Departement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeArrayList implements IGestion<Employe> {
    static ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for( int i=0;i< employes.size();i++)
        {
            if (employes.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int compareNom = e1.getNom().compareTo(e2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }
                int compareDepartement = e1.getDepartement().compareTo(e2.getDepartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }

    // trierEmploye par nom
    public void trierEmployeParNom() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }
}