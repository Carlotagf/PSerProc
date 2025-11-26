package carrera;

public class Tortuga extends Animal {
	private int avanzar = 0;
	private int velocidad = 2;
	
	public int getAvanzar() {
		return avanzar;
	}
	
	public Tortuga ( String nombre) {
		super(nombre);
	}
	
	
	@Override
	public void avanzar() {
		this.avanzar = this.avanzar + this.velocidad;
		System.out.println("La tortuga " + nombre + " avanzó " + this.avanza + " m");
		
	}

	
	

}
