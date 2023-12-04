package tn.esprit.gestionemployes;

import tn.esprit.gestiondepartement.Departement;
import tn.esprit.gestionemployes.Employe;

import java.util.HashMap;
import java.util.TreeMap;
/*Cette classe contient une collection de type HashMap. La clé est un objet de type Employe
  la valeur est un objet de type Departement.*/
public class AffectationHashMap {
    private HashMap<Employe, Departement> map;
// Instruction 1 AffectationHashMap()
    public AffectationHashMap() {
        map = new HashMap<>();
    }
// Instructions 2 ajouterEmployeDepartement()
    public void ajouterEmployeDepartement(Employe e, Departement d) {
    if (map.containsKey(e)) {
        throw new RuntimeException("L'employé est déjà affecté à un département.");
    }

        map.put(e, d);
    }
// Instructions 3 afficherEmployeDepartement()
    public boolean afficherEmployesEtDepartements() {
        for (Employe e : map.keySet()) {
            System.out.println("Employé : " + e + ", département : " + map.get(e));
        }
        return false;
    }

//    Instructions 4 supprimerEmploye()

    public void supprimerEmploye(Employe e) {
        if (!map.containsKey(e)) {
            throw new RuntimeException("L'employé n'est pas affecté à un département.");
        }

        map.remove(e);
    }
// Instruction 5 supprimerEmployeDepartement()
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (!map.containsKey(e)) {
            throw new RuntimeException("L'employé n'est pas affecté à un département.");
        } else if (map.get(e) != d) {
            throw new RuntimeException("L'employé n'est pas affecté au département spécifié.");
        }

        map.remove(e);
    }
    // Instructions 6 afficherEmployes()
    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }
// Instructions 7 afficherDepartements()
    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }
// Instruction 8 rechercherEmploye (Employé e)
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }


    //Instruction 9 rechercherDepartement (Departement d)
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    //Instruction 10 TreeMap&lt;Employe, Departement&gt; trierMap()
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> triee = new TreeMap<>(map);
        return triee;
    }
}