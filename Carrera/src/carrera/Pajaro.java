package carrera;

public class Pajaro extends Animal{
	
	private int velocidad = 3;
	private int avanzar = 0;
	
	
	public Pajaro(String nombre) {
		super(nombre);
	}

	public int getAvanza() {
		return avanzar;
	}

	@Override
	public void avanzar() {
		
		volar();
		
		if (avanzar > 40 && avanzar < 50) { 
			avanzar = 50;
			System.out.println("El pájaro " + nombre + " voló y llegó hasta " + this.avanzar + " m");
			
		} else if (avanzar > 140 && avanzar < 150) { 
			avanzar = 150;
			System.out.println("El pájaro " + nombre + " voló y llegó hasta " + this.avanzar + " m"); 
			
		} else {
			
			if (velocidad == 3) { 
				this.avanzar = this.avanzar + this.velocidad;
					System.out.println("El pajaro " + nombre + " avanzó " + this.avanzar + " m");
					
			} else if (velocidad == 10) {			
				this.avanzar = this.avanzar + this.velocidad;
					System.out.println("El pájaro " + nombre + " voló y llegó hasta " + this.avanzar + " m");
					
			} else if (velocidad == -10) { 
				if (avanzar >= 50 && avanzar <= 61 || avanzar >= 150 && avanzar <= 161) { 
					while (velocidad == -10) { 
						volar();
					}
						this.avanzar = this.avanzar + this.velocidad; 
						System.out.println("El pajaro " + nombre + " avanzó " + this.avanzar + " m");
					}
				} else { 
					this.avanzar = this.avanzar + this.velocidad; 
					System.out.println("El pájaro " + nombre + " voló hacia atrás, hasta los " + this.avanzar + " m");
				}
			
		}
	}
	
	
	public void volar() {
		int volarRandom = (int) (Math.random()*10 + 1); 
		if (volarRandom > 7) {  
			this.velocidad = 10;
		} else if (volarRandom < 3) { 
			this.velocidad = -10;
		} else {
			this.velocidad = 3;
		}
	}
	

}
