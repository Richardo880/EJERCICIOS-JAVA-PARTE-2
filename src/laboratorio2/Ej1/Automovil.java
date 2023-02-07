package laboratorio2.Ej1;

/*
                     Medio de Transporte
Transporte Terrestre -  Transporte Aereo - TransporteMaritimo
    Automovil               Avion               Barco
    Trenes                  Helicoptero         Bote
    Bicicletas				Jet                 Crucero

*/
public class Automovil extends TransporteTerrestre implements Comportamiento{
	private double combustible = 0;
	private int puertas;
	private boolean motorEncendido = false;

	public Automovil(String marca, String id, int cantPasajerosMax,int cantRuedas, int puertas){
		super(marca, id, cantPasajerosMax, cantRuedas);
		this.puertas = puertas;
	}

	public void arrancar(){
		if(combustible <= 0)
			throw new IllegalArgumentException("Debe cargar combustible.");

		this.motorEncendido = true;
		System.out.println("Motor encendido.");
	}

	public void apagarMotor(){
		this.motorEncendido =  false;
		System.out.println("Motor apagado");
	}
	public void frenar(){
		if(motorEncendido == false)
			throw new IllegalArgumentException("El motor debe estar encendido.");
		velocidad--;
	}
	public void acelerar(){
		if(motorEncendido == false)
			throw new IllegalArgumentException("El motor debe estar encendido.");
		velocidad++;
	}
	public void giroIzq(){
		if(motorEncendido == false)
			throw new IllegalArgumentException("El motor debe estar encendido.");
		System.out.println("Girando a la izq");
	}
	public void giroDer(){
		if(motorEncendido == false)
			throw new IllegalArgumentException("El motor debe estar encendido.");
		System.out.println("Girando a la derecha");
	}
	public void bocinar(){
		System.out.println("Honk! Honk!");
	}
	public void cargarCombustible(double cantCombustible){
		combustible = combustible + cantCombustible;
	}

	public double getCombustible(){
		return combustible;
	}

}

class MedioDeTransporte{
	private  String marca = "";
	private  String id  = "";
	public double velocidad = 0.0;
	private final int cantPasajerosMax;

	public MedioDeTransporte(String marca, String id, int cantPasajerosMax){
		this.marca = marca;
		this.id = id;
		this.cantPasajerosMax = cantPasajerosMax;
	}

	public void setVelocidad(double velocidad){
		if(velocidad < 0)
			throw new IllegalArgumentException("La velocidad debe ser >= 0");
		this.velocidad = velocidad;
	}

	public double getVelocidad(){
		return velocidad;
	}

	public String getMarca(){
		return marca;
	}

	public String getId(){
		return id;
	}

}

class TransporteTerrestre extends MedioDeTransporte{
	private int cantRuedas;

	public TransporteTerrestre(String marca, String id, int cantPasajerosMax, int cantRuedas){
		super(marca, id, cantPasajerosMax);
		if(cantRuedas <= 0)
			throw new IllegalArgumentException("La cantidad de ruedas debe ser > 0");
		this.cantRuedas = cantRuedas;
	}
}

class TransporteAereo extends MedioDeTransporte{
	public TransporteAereo(String marca, String id, int cantPasajerosMax){
		super(marca, id, cantPasajerosMax);
	}
}

class TransporteMaritimo extends MedioDeTransporte{
	public TransporteMaritimo(String marca, String id, int cantPasajerosMax){
		super(marca, id, cantPasajerosMax);
	}
}

class Bici extends TransporteTerrestre{
	public Bici(String marca, String id, int cantPasajerosMax,int cantRuedas){
		super(marca, id, cantPasajerosMax, cantRuedas);
	}
}


interface Comportamiento{

	public void arrancar();
	public void apagarMotor();
	public void frenar();
	public void acelerar();
	public void giroIzq();
	public void giroDer();
	public void bocinar();

}
