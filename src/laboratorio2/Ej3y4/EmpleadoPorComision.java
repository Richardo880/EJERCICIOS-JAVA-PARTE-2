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
public class EmpleadoPorComision extends Empleado{
    
    protected double ventasBrutas; // ventas totales por semana
    protected double tarifaComision; // porcentaje de comisión

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision, String primerNombre, String apellidoPaterno, String numeroCedula) {
        super(primerNombre, apellidoPaterno, numeroCedula);
        
        if(ventasBrutas <0.0){
            throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
        }
        
        if(tarifaComision <=0.0|| tarifaComision >=1.0){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }
    
        
    // establece el valor de ventas brutas
    public void establecerVentasBrutas(double ventasBrutas)  {
        if(ventasBrutas <0.0)
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }
    
    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    // establece la tarifa de comisión
    public void establecerTarifaComision(double tarifaComision){
        if(tarifaComision <=0.0|| tarifaComision >= 1.0)
            throw new IllegalArgumentException( 
                    "La tarifa de comisión debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    // calcula los ingresos
    public double ingresos()  {
        return obtenerTarifaComision() * obtenerVentasBrutas(); 
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s \n %s: %s \n %s: %.2f \n %s: %.2f",
                "Nombre", this.primerNombre, this.apellidoPaterno,
                "Cedula", this.numeroCedula,
                "Ventas brutas", obtenerVentasBrutas(),
                "Comision", obtenerTarifaComision());
    }
    
    
}
