package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void remove(int id) {
        Empleado tEmpleado = new Empleado(id);
        empleados.remove(tEmpleado);

    }

    @Override
    public void listarEmpleados() {
       for(Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
}