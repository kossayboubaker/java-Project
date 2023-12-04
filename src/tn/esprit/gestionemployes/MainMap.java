package tn.esprit.gestionemployes;

import java.util.HashMap;
import java.util.Map;

public class MainMap {


    public static void main(String[] args) {

        // id et nom sont leurs noms
        Map<Integer, String> classes = new HashMap<>();

       classes.put(4, "Maths");
        classes.put(4, "java");
        classes.put(122, "Maths");
        classes.put(5552, "Physique");
        classes.put(3, "Anglais");

        classes.remove(3);
        System.out.println(classes.get(3));
        classes.containsValue("java");
        //afficher les
       // classes.


        System.out.println(classes);



    }
}




















