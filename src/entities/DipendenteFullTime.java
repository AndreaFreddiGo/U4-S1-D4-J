package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calucateSalary() {
        double salary;
        return salary = getStipendio();
    }

    @Override
    public void checkIn(String orario) {
        System.out.println("Il Dipendente Full Time " + getMatricola() + " ha fatto il check-in alle " + orario);
    }
}

