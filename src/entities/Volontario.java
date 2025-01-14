package entities;

import interfaces.Lavoratore;

public class Volontario implements Lavoratore {
    //    attributi
    private String nome;
    private int età;
    private String CV;

    //    costruttori
    public Volontario(String nome, int età, String CV, String time) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    @Override
    public void checkIn(String orario) {
        System.out.println("Il volontario " + nome + " ha effettuato il check-in alle ore " + orario);
    }
}
