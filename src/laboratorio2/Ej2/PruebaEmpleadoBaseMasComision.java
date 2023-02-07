/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.Ej2;

import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class PruebaEmpleadoBaseMasComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Ricardo", "Toledo", "12345678", 100, 0.5, 3500);
        EmpleadoBaseMasComision empleado2 = new EmpleadoBaseMasComision("Lionel", "Messi", "87654321", 50, 0.2,2000);
        EmpleadoBaseMasComision empleado3 = new EmpleadoBaseMasComision("Cristiano", "Ronaldo", "7777777", 150, 0.8,3800);
        
        ArrayList<EmpleadoBaseMasComision> empleadosbase = new ArrayList();
        empleadosbase.add(empleado);
        empleadosbase.add(empleado2);
        empleadosbase.add(empleado3);
        
        for(int i = 0;i < empleadosbase.size();i++){
            //System.out.println(empleados.get(i));
            System.out.println("Informacion del empleado: ");
            System.out.println("==========================");
            System.out.println("Nombre: "+empleadosbase.get(i).obtenerPrimerNombre());
            System.out.println("Apellido: "+empleadosbase.get(i).obtenerApellidoPaterno());
            System.out.println("Numero de Cedula: "+empleadosbase.get(i).obtenerNumeroCedula());
            System.out.println("Las Ventas Brutas son: "+empleadosbase.get(i).obtenerVentasBrutas());
            System.out.println("La comision es: "+empleadosbase.get(i).obtenerTarifaComision());
            System.out.println("El salario base es: "+empleadosbase.get(i).obtenerSalarioBase());
            System.out.println("Su ingreso total: "+empleadosbase.get(i).ingresos());
            System.out.println("");
        }
    }
    
}
