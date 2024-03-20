package tmb;

public class persona {
	public class Persona {
	    protected int edad;
	    protected double peso;
	    protected double altura;
	    protected String genero;
	    

	    // Constructor
	    public Persona(int edad, double peso, double altura, String genero) {
	        this.edad = edad;
	        this.peso = peso;
	        this.altura = altura;
	        this.genero = genero;
	        
	    }

	    // Getters y setters
	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setgenero(String genero) {
	        this.genero = genero;
	       
	    }
	}


	
	
}

