/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.Ej3y4;

/**
 *
 * @author Diego
 */
public class Empleado {
    protected String primerNombre;
    protected String apellidoPaterno;
    protected String numeroCedula;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroCedula) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
    }

    @Override
    public String toString(){
        return String.format("%s: %s \n %s: %s \n %s: %s",
                "Nombre", this.primerNombre,
                "Apellido", this.apellidoPaterno,
                "Cedula", this.numeroCedula); 
    }
}
