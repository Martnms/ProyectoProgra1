package proyPostulaciones;

public class Estudiantes extends Personas {
    //Atributos
    protected double dedSemClases;

    //Constructor
    public Estudiantes(double duracionJornada, double dedSemproyecto, String nombre, double dedSemClases) {
        super(duracionJornada, dedSemproyecto, nombre);
        this.dedSemClases = dedSemClases;
    }

    //Getters && Setters
    public double getDedSemClases() {
        return dedSemClases;
    }
    public void setDedSemClases(double dedSemClases) {
        this.dedSemClases = dedSemClases;
    }
}
