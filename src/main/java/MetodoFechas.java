import java.util.*;
public class MetodoFechas{

public static boolean verBisiesto( int año) {
	
	boolean bisiesto;
	
	if (año<1866) {
		throw new IllegalArgumentException("Antes del 1866 no existían los años bisiestos");
	}
	
	 if (año % 4 != 0) {
	        bisiesto = false;
	    } else if (año % 100 != 0) { 
	        bisiesto = true;
	    } else if (año % 400 == 0) { 
	        bisiesto = true;
	    } else {
	        bisiesto = false;
	    }
	return bisiesto;
}
public static void main(String[] args) {
	Scanner TECLADO= new Scanner(System.in);
	System.out.println("meta usted el año en el que estamos");
	int fecha = TECLADO.nextInt();
	
	boolean bisiesto= verBisiesto(fecha);
	
	if (bisiesto==true) {
		System.out.println("El año es bisiesto");
		
	}else {
		System.out.println("El año no es bisiesto");
	}
}
}