package tn.esprit.gestionemployes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeArrayList implements IGestion<Employe> {
    ArrayList<Employe> employes = new ArrayList<>();

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
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public void trierEmployeParId() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    public void trierEmployeParNomDepartementEtGrade() {
       Collections.sort(employes, new Comparator<tn.esprit.gestionemployes.Employe>() {
            @Override
            public int compare(tn.esprit.gestionemployes.Employe e1, tn.esprit.gestionemployes.Employe e2) {
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
}