import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
    EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

    EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
    EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);

    Empleado emp1 = new Empleado (5, "Pedro","Dev");
    Empleado emp2 = new Empleado(3,"Juan","Dev");
    Empleado emp3 = new Empleado(1,"Jose","Dev");
    Empleado emp4 = new Empleado(2,"Pedro","Dev");
    Empleado emp5 = new Empleado(4,"Pedro","Dev");

    empleadoContoller.crearEmpleado(emp5);
    empleadoContoller.crearEmpleado(emp5);
    empleadoContoller.crearEmpleado(emp5);
    


    public static void main(String[] args) throws Exception {
        runMapExamlpe();
        runEmpleadoExample();
    }

    private static void runEmpleadoExample() {
        
    }


    private static void runMapExamlpe() {
        System.out.println("DIANA BORJA");
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }

}
