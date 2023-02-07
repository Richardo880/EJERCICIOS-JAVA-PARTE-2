package laboratorio2.Ej1;

public class AppAuto{
	public static void main(String[] args){
		Automovil auto1 = new Automovil("Chevrolet", "ABC123", 5, 4, 4);
		auto1.cargarCombustible(100);
		auto1.arrancar();
		auto1.acelerar();
		System.out.println("Velocidad: " + auto1.getVelocidad() + "km/h");
		System.out.println("Marca: " + auto1.getMarca() );
		auto1.giroIzq();
		auto1.bocinar();
		auto1.apagarMotor();
		auto1.giroDer();
	}
}