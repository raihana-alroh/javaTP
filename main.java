package control;

import model.Employe;
import model.ListeEmploye;
import util.EmployeDejaPresentException;

public class Main {
    public static void main(String[] args) {

        //Creation des objets
        Employe emp1 = new Employe("Jhon",33);
        Employe emp2 = new Employe("Smith",30);
        Employe emp3 = new Employe("Jeniver",25);

        //Creation de la collection (indirectement)
        ListeEmploye listeEmploye = new ListeEmploye();

        //Ajout dans la collection d'une employe
        try {
            listeEmploye.ajouterEmploye(emp1);
        }catch (EmployeDejaPresentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getEmploye());
        }

        try {
            listeEmploye.ajouterEmploye(emp2);
        }catch (EmployeDejaPresentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getEmploye());
        }

        try {
            listeEmploye.ajouterEmploye(emp3);
        }catch (EmployeDejaPresentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getEmploye());
        }

        try {
            listeEmploye.ajouterEmploye(emp1);
        }catch (EmployeDejaPresentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getEmploye());
        }
    }
}
