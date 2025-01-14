package entities;

public class Dipendente {
    //    attributi
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //    costruttori
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
}