package carrera;

public class Carrera implements Runnable{

	public Tunel tunel;
	public Animal animal;
	
	
	
	public Carrera(Tunel tunel, Animal animal) {
		this.tunel = tunel;
		this.animal = animal;
	}

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			if (animal.getAvanza() == 50) { 
				try {
					tunel.entraTunel();
					System.out.println( animal.getNombre() + " entra al tunel");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			} else if (animal.getAvanza() == 150) { 
				tunel.saleTunel();
				System.out.println(animal.getNombre() + " sale del tunel");
			}
			
			animal.avanzar();
			if (animal.getAvanza() >= 300) { 
				System.out.println(animal.getNombre() + " entra en la meta");
				//return;
				System.exit(0); 
			}
			
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
