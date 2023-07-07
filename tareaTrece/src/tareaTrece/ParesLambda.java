package tareaTrece;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public class ParesLambda {

	
	public static void main (String[] args) {
		List<Integer> numero = new ArrayList<>();

		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		numero.add(5);
		numero.add(6);

		Function<Integer, Double> multidos = (multi) -> multi%2==0;

		List<Double> resultado = new ArrayList<>();

		for(Integer multi:numero) {
			resultado.add(multidos.apply(multi));
		}
		System.out.println("Los resultados son: "+resultado);
		}
		}
	