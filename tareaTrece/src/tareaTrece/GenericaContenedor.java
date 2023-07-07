package tareaTrece;


	public class GenericaContenedor<T> {
	    private T elemento;

	    public void agregarElemento(T elemento) {
	        this.elemento = elemento;
	    }

	    public T obtenerElemento() {
	        return elemento;
	    }

	    public static void main(String[] args) {
	    	GenericaContenedor<String> contenedorString = new GenericaContenedor<>();
	        contenedorString.agregarElemento("Prueba");
	        String elementoString = contenedorString.obtenerElemento();
	        System.out.println("Elemento cadena de texto: " + elementoString);

	        GenericaContenedor<Integer> contenedorInteger = new GenericaContenedor<>();
	        contenedorInteger.agregarElemento(42);
	        Integer elementoInteger = contenedorInteger.obtenerElemento();
	        System.out.println("Elemento entero: " + elementoInteger);
	    }
	}

