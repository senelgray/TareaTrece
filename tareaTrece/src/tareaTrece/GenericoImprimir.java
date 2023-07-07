package tareaTrece;
import java.util.List;

public class GenericoImprimir {


	    public static <T> void GenericoImprimir(List<T> lista) {
	        for (T elemento : lista) {
	            System.out.println(elemento);
	        }	
	    }

	    public static void main(String[] args) {
	        List<String> listaCadena = List.of("Prueba", "Resta", "Suma");
	        GenericoImprimir(listaCadena);

	        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5);
	        GenericoImprimir(listaNumeros);

	        List<Double> listaDecimales = List.of(1.5, 2.7, 3.9);
	        GenericoImprimir(listaDecimales);
	    }
	}
