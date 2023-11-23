package tn.esprit.gestionemployes;

import java.util.ArrayList;
import java.util.Objects;

public class Employe {

    int id;
    String nom;
    String prenom;
String nom_department;
int grade;


public Employe(){}
    public Employe(int id, String nom, String prenom, String nom_department, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_department = nom_department;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getNom_department() {
        return nom_department;
    }

    public void setNom_department(String nom_department) {
        this.nom_department = nom_department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public <T> Comparable<T> getDepartement() {
        return (Comparable<T>) nom_department;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionemployes.Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_department='" + nom_department + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        if (id != employe.id) return false;
        return Objects.equals(nom, employe.nom);
    }

    @Override
    public int hashCode() {

        return this.id+100;
    }
}



