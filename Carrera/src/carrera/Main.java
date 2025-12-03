package carrera;

public class Main {
	public static void main(String[] args) {		
		Tunel tunel = new Tunel ();
		
		Thread tortuga = new Thread(new Carrera (tunel, new Tortuga("Tortuga")));
		Thread liebre = new Thread(new Carrera (tunel, new Liebre("Liebre")));
		Thread pajaro = new Thread(new Carrera (tunel, new Pajaro("Pajaro")));
		Thread mono = new Thread(new Carrera (tunel, new Mono("Mono")));
		
		Animal animal = new Mono("Mono1");
		Animal animal2 = new Mono("Mono2");
		Animal animal3 = new Mono("Mono3");
		
		
		tortuga.start();
		liebre.start();
		pajaro.start();
		mono.start();
	}

}
