package entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calucateSalary() {
        double salary;
        return salary = getStipendio() * 2;
    }

    @Override
    public void checkIn(String orario) {
        System.out.println("Il dirigente " + getMatricola() + " ha fatto il check-in alle " + orario);
    }
}
