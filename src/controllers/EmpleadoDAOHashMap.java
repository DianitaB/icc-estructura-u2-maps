package controllers;
import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap(){
        this.empleados = new HashMap<>();
    }
    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }

    @Override
    public void listarEmpleados() {
    
    }
}