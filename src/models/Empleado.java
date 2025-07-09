package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String nombre;
    private String cargo;

    public Empleado(int id){
        this.id = id;
    }

    public Empleado(int id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Empleado otro) {
        return Integer.compare(this.id, otro.id);  
    }

    @Override
    public String toString() {
        return "Empleado ID: " + id + " Nombre: '" + nombre + " Cargo: '" + cargo + "'";
    }

}