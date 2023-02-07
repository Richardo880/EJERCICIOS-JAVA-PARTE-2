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
public class PruebaEmpleadoPorComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoPorComision empleado = new EmpleadoPorComision("Ricardo", "Toledo", "12345678", 10, 0.5);
        EmpleadoPorComision empleado2 = new EmpleadoPorComision("Lionel", "Messi", "87654321", 5, 0.2);
        EmpleadoPorComision empleado3 = new EmpleadoPorComision("Cristiano", "Ronaldo", "7777777", 15, 0.8);
        
        ArrayList<EmpleadoPorComision> empleados = new ArrayList();
        empleados.add(empleado);
        empleados.add(empleado2);
        empleados.add(empleado3);
        
        for(int i = 0;i < empleados.size();i++){
            //System.out.println(empleados.get(i));
            System.out.println("Informacion del empleado: ");
            System.out.println("==========================");
            System.out.println("Nombre: "+empleados.get(i).obtenerPrimerNombre());
            System.out.println("Apellido: "+empleados.get(i).obtenerApellidoPaterno());
            System.out.println("Numero de Cedula: "+empleados.get(i).obtenerNumeroCedula());
            System.out.println("Las Ventas Brutas son: "+empleados.get(i).obtenerVentasBrutas());
            System.out.println("La comision es: "+empleados.get(i).obtenerTarifaComision());
            System.out.println("Su ingreso total: "+empleados.get(i).ingresos());
            System.out.println("");
        }


    }
    
    
    
}
