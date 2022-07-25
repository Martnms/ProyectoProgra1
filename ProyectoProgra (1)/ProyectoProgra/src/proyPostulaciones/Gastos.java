package proyPostulaciones;

public class Gastos {

    //Atributos
    private double operacionales;
    private double equipamiento;
    private double remuneraciones;

    //Sólo usar para ProyInvestigacion
    private double conferencias;
    private double viaticos;

    //Costructor

    public Gastos(double operacionales, double equipamiento, double conferencias, double viaticos, double remuneraciones) {
        this.operacionales = operacionales;
        this.equipamiento = equipamiento;
        this.remuneraciones = remuneraciones;
        this.conferencias = conferencias;
        this.viaticos = viaticos;
    }

    //Constructor2
    public Gastos(double operacionales, double equipamiento, double remuneraciones) {
        this.operacionales = operacionales;
        this.equipamiento = equipamiento;
        this.remuneraciones = remuneraciones;
    }

    //Métodos

    public double calculoRemuneaciones(double dedSemProyecto) { //recibe horas semanales del constructor y devuelve remuneraciones

        double remuneracion = 0.0;

        if (dedSemProyecto > 0.0 && dedSemProyecto <= 5.0) {
            remuneracion = 7538 * dedSemProyecto;
        }
        if (dedSemProyecto > 5.0 && dedSemProyecto <= 10.0) {
            remuneracion = 8954 * dedSemProyecto;
        }
        if (dedSemProyecto > 10.0) {
            remuneracion = (9459 * dedSemProyecto) + 11168;
        }

        return remuneraciones = remuneracion; //asignar a remuneraciones
    }

    public double sumaDeGastos() {
        return operacionales + equipamiento + remuneraciones;
    }

    public double sumaDeGastosInv() {
        return operacionales + equipamiento + remuneraciones + conferencias + viaticos;
    }

    //Getters & Setters


    public double getOperacionales() {
        return operacionales;
    }

    public void setOperacionales(double operacionales) {
        this.operacionales = operacionales;
    }

    public double getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(double equipamiento) {
        this.equipamiento = equipamiento;
    }

    public double getRemuneraciones() {
        return remuneraciones;
    }

    public void setRemuneraciones(double remuneraciones) {
        this.remuneraciones = remuneraciones;
    }

    public double getConferencias() {
        return conferencias;
    }

    public void setConferencias(double conferencias) {
        this.conferencias = conferencias;
    }

    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }
}



