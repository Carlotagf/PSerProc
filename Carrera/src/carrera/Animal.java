package carrera;


public abstract class Animal {
		protected String nombre;
		
		public Animal(String nombre) {
			// TODO Auto-generated constructor stub
			super();
			this.nombre = nombre;
		}
		
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	public void avanzar() {
	}		public String getNombre() {
			// TODO Auto-generated method stub
			return nombre;
		}
		
		
		protected abstract int getAvanza();
	

	

}
