package tn.esprit.GestionStudent;

public class Student {
    int id;
    String nom;
    int age;

    // constructor default
    public Student() {

    }

    // constructor with parameters
    public Student(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    // geter and setter




        // constructor with parameters


        // getter and setter for id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // getter and setter for nom
        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        // getter and setter for age
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // redefinition methods tostring() and equals()
        @Override
        public String toString() {
            return "Etudiant{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                    ", age=" + age +
                    '}';
        }


    }

