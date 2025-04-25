package Models;

import Models.Direccion;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
      public Direccion getDireccion() {
        return direccion;
      }
      public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
        }
public boolean compareCodigoDireccion(Persona persona) {
    boolean condicion = direccion.getCodigo() > persona.getDireccion().getCodigo();
    return condicion;
    
}
public boolean compareCodigoDireccion(int codigoDireccion) {
    boolean condicion = direccion.getCodigo() > codigoDireccion;
    return condicion;
    
}
public boolean equalsByCodigoDireccion(Persona persona) {
    boolean condicion = direccion.getCodigo() == persona.getDireccion().getCodigo();
    return condicion;
    
}
public boolean equalsByCodigoDireccion(int codigoDireccion) {
    boolean condicion = direccion.getCodigo() == codigoDireccion;
    return condicion;
    
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return nombre + " " + apellido + " " + edad + " " + direccion.getCalle() + " " + direccion.getNumeroDeCalle() + " " + direccion.getCodigo();
}


}

