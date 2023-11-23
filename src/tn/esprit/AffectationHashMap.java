package tn.esprit;

import tn.esprit.gestiondepartement.Departement;

import java.util.HashMap;

import static java.lang.System.out;

public class AffectationHashMap {
    private static HashMap<Employe, Departement> affectations = new HashMap<>();

    public void affecterEmploye(Employe employe, Departement departement) {
        affectations.put(employe, departement);
    }

    public void desaffecterEmploye(Employe employe) {
        affectations.remove(employe);
    }

    public Departement getDepartement(Employe employe) {
        return affectations.get(employe);
    }

    public void displayAffectations() {
        for (Employe employe : affectations.keySet()) {
            Departement departement = affectations.get(employe);
            out.println(employe.getNom() + " " + employe.getPrenom() + " -> " + departement.getNom());
        }
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            out.println("L'employé " + e.getNom() + " " + e.getPrenom() + " a été affecté au département " + d.getNom());
        } else {
            out.println("L'employé " + e.getNom() + " " + e.getPrenom() + " est déjà affecté à un département");
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Employe employe : affectations.keySet()) {
            Departement departement = affectations.get(employe);
            out.println("Employé : " + employe.getNom() + " " + employe.getPrenom() + " | Département : " + departement.getNom());
        }
    }

    public static class Employe  {
        private String nom;
        private String prenom;

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
    }
    Employe employe = new Employe();
    Departement departement = affectations.remove(employe);

}