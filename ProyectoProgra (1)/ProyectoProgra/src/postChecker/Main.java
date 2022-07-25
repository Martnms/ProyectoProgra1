package postChecker;

import proyPostulaciones.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Personas> l1 = new ArrayList<Personas>();
        ArrayList<Personas> l2 = new ArrayList<Personas>();
        ArrayList<Personas> l3 = new ArrayList<Personas>();

        //Creación de Personas
        Memoristas m1 = new Memoristas(60.0, "Gabriel", 4.0);
        mediaJornada mj1 = new mediaJornada(70.0, "Fernando", 3.0);
        jornadaCompleta jc1 = new jornadaCompleta(60.0, "Juan", 10.0);

        Practicantes prac2 = new Practicantes(30.0, 15.0, "Pepe", 15.0);
        personalAdministrativo pA2 = new personalAdministrativo(16.0, "Rodrigo");
        jornadaCompleta jc2 = new jornadaCompleta(20.0, "Nico", 12.0);

        mediaJornada mj3 = new mediaJornada(20.0, "Lalo", 20.0);
        Practicantes prac3 = new Practicantes(44.0, 44.0, "Nata", 0.0);
        personalAdministrativo pA3 = new personalAdministrativo(8.0, "Kim");

        //Añadadir Personas
        l1.add(m1);
        l1.add(mj1);
        l1.add(jc1);

        l2.add(prac2);
        l2.add(pA2);
        l2.add(jc2);

        l3.add(mj3);
        l3.add(prac3);
        l3.add(pA3);

        //Crear gastos
        Gastos g1 = new Gastos(300000000.0, 2300.0, mj1.getDedSemproyecto());
        Gastos g2 = new Gastos(25000.0, 27000.0, jc2.getDedSemproyecto());
        Gastos g3 = new Gastos(50000000.0, 450000, mj3.getDedSemClases());

        //Crear Postulaciones
        Proyecto pr1 = new Proyecto("Proyecto1", "ResumenProyecto1", "Propuesta1", 11, g1.sumaDeGastos(), l1, "rechazado");
        Proyecto pr2 = new Proyecto("Proyecto2", "ResumenProyecto2", "Propuesta3", 12, g2.sumaDeGastos(), l2, "aprobado");
        Proyecto pr3 = new Proyecto("Proyecto3", "ResumenProyecto3", "Propuesta3", 10, g3.sumaDeGastos(), l3, " aprobado con Obs");

        //Lista de Proyectos
        ArrayList<Proyecto> lp1 = new ArrayList<Proyecto>();
        lp1.add(pr1);
        lp1.add(pr2);
        lp1.add(pr3);


        Verificador v1 = new Verificador();
        System.out.println("======Verificando primer proyecto======");
        Generador ge1= new Generador();
        v1.verificarPresupuesto(pr1.getPresupuesto());
        v1.verificarDedTotales(m1.getDedSemproyecto());
        v1.verificarDedTotales(mj1.getDedSemproyecto());
        v1.contTotal(v1.cont);
        ge1.generarRechazados(v1.cont);


        Verificador v2=new Verificador();
        System.out.println("======Verificando segundo proyecto======");
        Generador ge2=new Generador();
        v2.verificarPresupuesto(pr2.getPresupuesto());
        v2.verificarDedTotales(prac2.getDedSemproyecto());
        v2.verificarDedTotales(pA2.getDedSemproyecto());
        v2.verificarDedTotales(jc2.getDedSemproyecto());
        v2.contTotal(v2.cont);
        ge2.generarAprobados(v2.cont);

        Verificador v3=new Verificador();
        System.out.println("======Verificando tercer proyecto======");
        Generador ge3=new Generador();
        v3.verificarPresupuesto(pr3.getPresupuesto());
        v3.verificarDedTotales(mj3.getDedSemproyecto());
        v3.verificarDedTotales(prac3.getDedSemproyecto());
        v3.verificarDedTotales(pA3.getDedSemproyecto());
        v3.contTotal(v3.cont);
        ge3.generarAprobadosObs(v3.cont);

    }
}
