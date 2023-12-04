import tn.esprit.gestionemployes.AffectationHashMap;
import tn.esprit.gestiondepartement.Departement;
import tn.esprit.gestionemployes.Employe;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe("Jean", "Dupont", 123456);
        Employe e2 = new Employe("Pierre", "Martin", 234567);
        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Ressources humaines");

        AffectationHashMap affectation = new AffectationHashMap();

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);

        // Test de la méthode rechercherEmploye()
        System.out.println(affectation.rechercherEmploye(e1)); // true
        System.out.println(affectation.rechercherEmploye(new Employe("Paul", "Durand", 345678))); // false
// afficherEmployesEtDepartements()
        System.out.println(affectation.afficherEmployesEtDepartements());
        // Test de la méthode rechercherDepartement()
        System.out.println(affectation.rechercherDepartement(d1)); // true
        System.out.println(affectation.rechercherDepartement(new Departement("Comptabilité"))); // false
        affectation.afficherEmployesEtDepartements();
        // Test de la méthode supprimerEmploye()
        affectation.supprimerEmploye(e1);
        affectation.afficherEmployesEtDepartements();

        // Test de la méthode trierMap()
        TreeMap<Employe, Departement> triee = affectation.trierMap();
        System.out.println(triee);
    }
    AffectationHashMap affectation = new AffectationHashMap();






}