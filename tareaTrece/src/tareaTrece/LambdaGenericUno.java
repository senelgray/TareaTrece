package tareaTrece;
import java.util.ArrayList;
	import java.util.List;

	class Persona {
	    private String nombre;
	    private int edad;

	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }
	}
	public class LambdaGenericUno {
	    public static void main(String[] args) {
	        List<Persona> listaPersonas = new ArrayList<>();
	        listaPersonas.add(new Persona("Juan", 25));
	        listaPersonas.add(new Persona("María", 35));
	        listaPersonas.add(new Persona("Pedro", 40));
	        listaPersonas.add(new Persona("Laura", 28));

	        List<String> nombresMayores30 = filtrarPersonasMayores30(listaPersonas);

	        System.out.println("Personas mayores de 30 años:");
	        for (String nombre : nombresMayores30) {
	            System.out.println(nombre);
	        }
	    }
	    public static List<String> filtrarPersonasMayores30(List<Persona> listaPersonas) {
	        List<String> nombresMayores30 = new ArrayList<>();

	        for (Persona persona : listaPersonas) {
	            if (persona.getEdad() > 30) {
	                nombresMayores30.add(persona.getNombre());
	            }
	        }

	        return nombresMayores30;
	    }

	   
	}
