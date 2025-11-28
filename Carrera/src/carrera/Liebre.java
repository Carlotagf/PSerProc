package carrera;

public class Liebre extends Animal{
	private int velocidad = 5;
	private int avanzar = 0;
	int liebreduerme = 0;
	int segundosparada;
	
	public Liebre(String nombre) {
		super(nombre);
	}
	
	
	public int getAvanza() {
		return avanzar;
	}
	
	@Override
	public void avanzar() {
		if (liebreduerme != 4) {  
			
            	this.avanzar = this.getAvanza() + this.velocidad;
    			System.out.println("La liebre " + nombre + " avanzó " + this.avanzar + " m");
    			liebreduerme ++;
    			segundosparada = 10;
    			
		}	else if (liebreduerme== 4) { 
				System.out.println("La liebre " + nombre + " está dormida y no avanza hasta dentro de " + segundosparada + " segundos");
				segundosparada --;
				
				if (segundosparada == 0) { 
					liebreduerme = 0;
				}
		}
		
	}
	

}
