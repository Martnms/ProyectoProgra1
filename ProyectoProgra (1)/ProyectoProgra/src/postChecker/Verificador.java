package postChecker;
import proyPostulaciones.Proyecto;
public class Verificador {

    int cont = 0;
    public void verificarPresupuesto(double presupuesto) {
        if (presupuesto <= 30000000) {
            System.out.println("Presupuesto aprobado");
        }
        else {
            cont = cont + 1;
            System.out.println("Presupuesto rechazado");
        }
    }

    public void verificarDedTotales(double dedSemProyecto) {

        if (dedSemProyecto <= 44) {
            if (dedSemProyecto <= 22) {
                System.out.println("Es media jornada");

                if (dedSemProyecto < 22) {
                    System.out.println("completó las horas correspondientes");
                }
            }

            if (dedSemProyecto <= 44 && dedSemProyecto >= 22) {
                System.out.println("es jornada completa");

                if (dedSemProyecto < 44 && dedSemProyecto >= 20) {
                    System.out.println("completo las horas correspondientes");
                }
            }
        } else {
            System.out.println("no superó las horas correspondientes");
            cont = cont + 1;
        }
    }



    public void contTotal(int cont){
                if (cont >= 3) {
                    System.out.println("El proyecto ha sido rechazado");


                }
                if (cont >0 && cont < 3) {
                    System.out.println("El proyecto ha sido aprobado con observaciones");


                }
                if (cont == 0) {
                    System.out.println("El proyecto ha sido aprobado");


                }


            }
        }

