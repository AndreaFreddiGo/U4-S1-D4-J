import entities.*;

public class Main {
    public static void main(String[] args) {

//        Dipendente d1 = new Dipendente("A123", 1500, Dipartimento.AMMINISTRAZIONE);
//        Dipendente d2 = new Dipendente("B456", 1300, Dipartimento.VENDITE);
//        Dipendente d3 = new Dipendente("C789", 1600, Dipartimento.PRODUZIONE);
//
//        Dipendente[] dipendenti = {d1, d2, d3};
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("Matricola: " + dipendenti[i].getMatricola());
//        }

        Dipendente d1 = new DipendenteFullTime("A123", 1500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2 = new DipendentePartTime("B456", 1300, Dipartimento.VENDITE, 20);
        Dipendente d3 = new DipendenteFullTime("C789", 1600, Dipartimento.PRODUZIONE);
        Dipendente d4 = new Dirigente("D101", 1500, Dipartimento.PRODUZIONE);

        Dipendente[] dipendenti = {d1, d2, d3, d4};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Lo stipendio del dipendente con la matricola: " + dipendenti[i].getMatricola() + " è: " + dipendenti[i].calucateSalary());
        }
    }
}