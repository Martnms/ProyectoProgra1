package proyPostulaciones;

import java.util.ArrayList;


public class Proyecto {
     //Atributos
     public String titulo;
     public String resumen;
     public String propuesta;
     public int duracion;
     public double presupuesto;
     public ArrayList<Personas> equipo;
     public String estado;

     //Constructor
     public Proyecto(String titulo, String resumen, String propuesta, int duracion, double presupuesto, ArrayList<Personas> equipo, String estado) {
          this.titulo = titulo;
          this.resumen = resumen;
          this.propuesta = propuesta;
          this.duracion = duracion;
          this.presupuesto = presupuesto;
          this.equipo = equipo;
          this.estado = estado;
     }

     //Métodos

     /*private void asignarPresupuesto(double gastos){
          this.pre
     }*/

     //Getters & Setters


     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getResumen() {
          return resumen;
     }

     public void setResumen(String resumen) {
          this.resumen = resumen;
     }

     public String getPropuesta() {
          return propuesta;
     }

     public void setPropuesta(String propuesta) {
          this.propuesta = propuesta;
     }

     public int getDuracion() {
          return duracion;
     }

     public void setDuracion(int duracion) {
          this.duracion = duracion;
     }

     public ArrayList<Personas> getEquipo() {
          return equipo;
     }

     public void setEquipo(ArrayList<Personas> equipo) {
          this.equipo = equipo;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }

     public double getPresupuesto() {
          return presupuesto;
     }

     public void setPresupuesto(int presupuesto) {
          this.presupuesto = presupuesto;
     }
}
