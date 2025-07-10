import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;


public class App {

    public static void main(String[] args) throws Exception {
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runMapExample() {
        System.out.println("DIANA BORJA");
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }
    private static void runEmpleadoExample() {
        System.out.println("DIANA BORJA ");
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);
        EmpleadoDAOTreeMap empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        
        empleadoContoller.agregarEmpleados(emp1);
        empleadoContoller.agregarEmpleados(emp2);
        empleadoContoller.agregarEmpleados(emp3);
        empleadoContoller.agregarEmpleados(emp4);
        empleadoContoller.agregarEmpleados(emp5);

        
        empleadoContoller2.agregarEmpleados(emp1);
        empleadoContoller2.agregarEmpleados(emp2);
        empleadoContoller2.agregarEmpleados(emp3);
        empleadoContoller2.agregarEmpleados(emp4);
        empleadoContoller2.agregarEmpleados(emp5);
        
        System.out.println("HashMap");
        empleadoContoller.listarEmpleados();
        System.out.println("\nTreeMap");
        empleadoContoller2.listarEmpleados();

    }
    public static void runEjerccios(){
        Ejercicios ej = new Ejercicios();

        // Primer ejercicios 
        System.out.println("DIANA BORJA");
        System.out.println("--EJERCICIO 1--");
        System.out.println(Ejercicios.areAnagrams("listen", "silent"));    
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));     
        System.out.println(Ejercicios.areAnagrams("triangle", "integral"));
        System.out.println(Ejercicios.areAnagrams("amor", "roma"));      
        System.out.println(Ejercicios.areAnagrams("ecuador", "acuerdo"));       
        System.out.println(Ejercicios.areAnagrams("aeiou", "abcd"));  

        //Ssegundo ejercicios
        System.out.println("-- EJERICICIO 2--");
        int[] res1 = ej.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        int[] res2 = ej.sumatoriaDeDos(new int[]{1, 7, 2, 4}, 6);
        int[] res3 = ej.sumatoriaDeDos(new int[]{2, 4, 5, 1}, 10);
        imprimirResultado(res1); 
        imprimirResultado(res2); 
        imprimirResultado(res3); 

        // Tercer ejercicios
        System.out.println("--EJERCICIO 3--");
        ej.contarCaracteres("hola");
        ej.contarCaracteres("holaaaaa");
        ej.contarCaracteres("bikers");
        ej.contarCaracteres("rodadas");

        //cuarto ejercicio
        System.out.println("-- EJERCICIO 4--");
        System.out.println("roma / amora: " + ej.sonAnagramas("selva", "valse"));      
        System.out.println("listen / silent: " + ej.sonAnagramas("listen", "silent")); 
        System.out.println("apple / paple: " + ej.sonAnagramas("apple", "paple"));     // true
        System.out.println("test / tset: " + ej.sonAnagramas("test", "tset")); 

    }

    private static void imprimirResultado(int[] resultado) {
    if (resultado != null) {
        System.out.println("Índices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
    } else {
        System.out.println("No se encontró ninguna combinación.");
    }
  }
}
