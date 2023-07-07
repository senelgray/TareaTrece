package tareaTrece;

import java.util.ArrayList;
import java.util.List;

public class LambdaGenericPromedio {
	  
	    public static void main(String[] args) {
	        List<Integer> listaNum = new ArrayList<>();
	        listaNum.add(56);
	        listaNum.add(88);
	        listaNum.add(35);
	        listaNum.add(94);
	        
	        double promedio = calcularPromedio(listaNum);


	        		System.out.println("El promedio es: " + promedio);
	        }
	    
    	public static <T extends Number> double calcularPromedio(List<T> listaNum) {
	        double suma =0;

	        for(T numero:listaNum) {
	        	suma += numero.doubleValue();
    	}

	        return suma/listaNum.size();
	    }
	}

	   
	
