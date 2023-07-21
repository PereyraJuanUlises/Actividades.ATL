package Clase10.Clases;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private int dni;

    public Persona(){

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String parametroNombre){
        nombre = parametroNombre;
    }
    public int getId(){
        return id;
    }
    public void setId(int parametroId){
        id = parametroId;
    }
    public LocalDate getFechaNacimiento (){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate parametroFechaNacimiento){
        fechaNacimiento = parametroFechaNacimiento;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int parametroDni){
        dni= parametroDni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarPersonas() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni=" + dni +
                '}';
    }
    public boolean esMayor (){
        if(edad>=18){
            return true;
        }else {
            return false;
        }
    }
}
