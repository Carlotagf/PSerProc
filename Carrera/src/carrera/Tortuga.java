package carrera;

public class Tortuga extends Animal {
	private int avanzar = 0;
	private int velocidad = 2;
	
	
	
	public Tortuga ( String nombre) {
		super(nombre);
	}
	
	
	@Override
	public void avanzar() {
		this.avanzar = this.avanzar + this.velocidad;
		System.out.println("La tortuga " + nombre + " avanzó " + this.avanzar + " m");
		
	}

	@Override
	protected int getAvanza() {
		return avanzar;
	}

	

	

}
