package entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private int hours;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int hours) {
        super(matricola, stipendio, dipartimento);
        this.hours = hours;
    }

    @Override
    public double calucateSalary() {
        double salary;
        return salary = getStipendio() / 40 * this.hours;
    }

    @Override
    public void checkIn(String orario) {
        System.out.println("Il dipendente Part Time " + getMatricola() + " ha fatto il check-in alle " + orario);
    }
}
