package controllers;
import models.Empleado;


public interface EmpleadoDAO {
    
    public void listarEmpleados();

    public void add(Empleado emp);

    public void remove(int id);
}