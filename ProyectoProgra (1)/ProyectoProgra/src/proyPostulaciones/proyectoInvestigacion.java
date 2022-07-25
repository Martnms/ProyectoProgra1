package proyPostulaciones;

import java.util.ArrayList;


public class proyectoInvestigacion extends Proyecto{
    //Atributos
    protected String investigadorResponsable;

    //COnstructor
    public proyectoInvestigacion(String titulo, String resumen, String propuesta, int duracion, int presupuesto, ArrayList<Personas> personas, String estado, String investigadorResponsable) {
        super(titulo, resumen, propuesta, duracion, presupuesto, personas, estado);
        this.investigadorResponsable = investigadorResponsable;
    }

    //Métodos
    private void asignarPresupuestoInv(){

    }
    //Getters && Setters
    public String getInvestigadorResponsable() {
        return investigadorResponsable;
    }

    public void setInvestigadorResponsable(String investigadorResponsable) {
        this.investigadorResponsable = investigadorResponsable;
    }
}
