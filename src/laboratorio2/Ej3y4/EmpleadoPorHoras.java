package laboratorio2.Ej3y4;


public class EmpleadoPorHoras extends laboratorio2.Ej3y4.Empleado{
    private double horas;
    private double sueldo;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroCedula,double horas, double sueldo) {
        super(primerNombre, apellidoPaterno, numeroCedula);
        if(horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException("El total de horas debe ser >= 0.0 y <=168.0");
                this.horas = horas;
        if(sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo debe ser >= 0.0");
                this.sueldo = sueldo;
    }

    public double obtenerHoras() {
        return horas;
    }

    public void establecerHoras(double horas) {
        if(horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException("El total de horas debe ser >= 0.0 y <=168.0");
                this.horas = horas;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double sueldo) {
        if(sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo debe ser >= 0.0");
                this.sueldo = sueldo;
    }
    
    public double obtenerIngresos(){
        if(this.horas <= 40){
            return this.horas*this.sueldo;
        }else{
            return (40*this.sueldo) + ((this.horas-40)*(1.5*this.sueldo));
        }
    }
    
    @Override
    public String toString(){     
        return String.format("%s %n%s:%.2f%n%s: %.2f",
        super.toString(),"Horas trabajadas", obtenerHoras(),
        "Su ingreso total es", obtenerIngresos()); 
    }
    
    
    
}
