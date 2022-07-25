package postChecker;
import java.io.*;


public  class Generador {
    Verificador v2 = new Verificador();
    Verificador v1 = new Verificador();
    Verificador v3 = new Verificador();
    int cont = v2.cont;


      public void generarRechazados(int cont) throws IOException{
          FileWriter archivo1=null;
          PrintWriter escritor1=null;


          if (cont >= 3) {try {
              archivo1=new FileWriter("Rechazo.txt");
              escritor1=new PrintWriter(archivo1);
              escritor1.println("Titulo: Proyecto1\n" +
                                "Resumen: ResumenProyecto1\n" +
                                "Duracion: 11 meses\n" +
                                "Integrantes: Fernando-Juan-Gabriel\n"+
                                "Propuesta: Propuesta 1\n"+
                                "Debe corregir:\n"+
                                "-Presupuesto\n"+
                                "-Las horas correspondientes a sus integrantes\n"+
                                "=====Su proyecto ha sido rechazado=====");

          }
          catch (IOException e){
              System.out.println("Error: "+ e.getMessage());
          }
          finally {
              archivo1.close();
          }


          }

      }

      public void generarAprobadosObs(int cont) throws IOException{
          FileWriter archivo3=null;
          PrintWriter escritor3=null;


          if (cont >0 && cont < 3) {try {
              archivo3=new FileWriter("AprobadosObs.txt");
              escritor3=new PrintWriter(archivo3);
              escritor3.println("Titulo: Proyecto3\n" +
                                "Resumen: ResumenProyecto3\n" +
                                "Propuesta:Propuesta3\n"+
                                "Duracion: 10 meses\n" +
                                "Integrantes: Lalo-Nata-Kim\n"+
                                "Debe corregir: -Presupuesto\n"+
                                "======Felicitaciones su proyecto ha sido aprobado con observaciones=====\n");

          }
          catch (IOException e){
              System.out.println("Error: "+ e.getMessage());
          }
          finally {
              archivo3.close();
          }


          }

      }

    public void generarAprobados(int cont) throws IOException{
        FileWriter archivo=null;
        PrintWriter escritor=null;


        if (cont == 0) {try {
            archivo=new FileWriter("Aprobados.txt");
            escritor=new PrintWriter(archivo);
            escritor.println("Titulo: Proyecto2\n" +
                             "Resumen: ResumenProyecto2\n" +
                             "Propuesta: Propuesta 2\n"+
                             "Duracion: 12 meses\n" +
                             "Integrantes: Pepe-Rodrigo-Nico\n"+
                             "=====Felicitaciones su proyecto ha sido aprobado=====\n");

        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            archivo.close();
        }


        }

    }


}
