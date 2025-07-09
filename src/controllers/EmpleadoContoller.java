package controllers;


import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO empleadoDAO;
 
    public void crearEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }
    
    public void listarEmpleados(){

    }
}