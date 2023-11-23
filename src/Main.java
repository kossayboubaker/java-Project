import tn.esprit.gestionemployes.Employe;
import tn.esprit.gestionemployes.EmployeArrayList;
import tn.esprit.gestionemployes.EmployeSet;

public class Main {
    public static  void main(String[] args) {

        int taille = 60;
        String[] pays = new String[taille];

    Employe e1 = new Employe(1, "toto", "toto", "departement1", 1);
    Employe e2 = new Employe(2, "titi", "titi", "departement1", 1);
    Employe e3 = new Employe(3, "xxx", "xxx", "departement2", 2);
    Employe e4 = new Employe(3, "xxx", "xxx", "departement2", 2);

    EmployeSet employeArrayList = new EmployeSet();

        employeArrayList.ajouterEmploye(e4);
        employeArrayList.ajouterEmploye(e3);
    employeArrayList.ajouterEmploye(e1);
    employeArrayList.ajouterEmploye(e2);
    employeArrayList.ajouterEmploye(e3);
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
    employeArrayList.displayEmploye();

    }


    }

