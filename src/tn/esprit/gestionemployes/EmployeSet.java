package tn.esprit.gestionemployes;


import java.util.HashSet;
import java.util.Set;

public class EmployeSet implements IGestion<Employe> {
    Set<Employe> employes = new HashSet<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
       for( Employe e : employes)
        {
          if(e.getNom().equals(nom))
          {
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

    }

    public void trierEmployeParNomDepartementEtGrade() {
        /*Collections.sort(employes, new Comparator<tn.esprit.gestionemployes.Employe>() {
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
        });*/
    }
}