package entities;

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
}
