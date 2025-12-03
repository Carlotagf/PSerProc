package carrera;

public class Mono extends Animal {
	private int velocidad = 6;
	private int avanzar;
	private boolean liana = false;
	

	public Mono(String nombre) {
		super(nombre);
		
	}

	@Override
	protected int getAvanza() {
		return avanzar;
	}
	
	public void avanzar() {
		if (avanzar == 6 ) {
			this.avanzar = this.getAvanza() + this.velocidad;
			System.out.println("El mono " + nombre + " avanzó " + this.avanzar + " m ");
		} 
		
	}
	
	
	

	public synchronized void empiezaLiana() throws InterruptedException {
		while (liana) {
			wait();
		}
		liana = true;
	}
	public synchronized void acabaLiana() {
		liana = false;
		notify();
	}
	

}
