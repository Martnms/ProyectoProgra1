package proyPostulaciones;

public class Personas {

     //Atributos
     protected double duracionJornada;
     protected double dedSemproyecto;
     protected String nombre;

     //Constructor
     public Personas(double duracionJornada, double dedSemproyecto, String nombre) {
          this.duracionJornada = duracionJornada;
          this.dedSemproyecto = dedSemproyecto;
          this.nombre = nombre;
     }

     //Getters && Setters
     public double getDuracionJornada() {
          return duracionJornada;
     }

     public void setDuracionJornada(double duracionJornada) {
          this.duracionJornada = duracionJornada;
     }

     public double getDedSemproyecto() {
          return dedSemproyecto;
     }

     public void setDedSemproyecto(int dedSemproyecto) {
          this.dedSemproyecto = dedSemproyecto;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }



     @Override
     public String toString() {
          return "" + dedSemproyecto;
     }
}



