
public class MetodoFechas{

public static boolean verBisiesto( int año) {

	boolean bisiesto;
	
	if (año<0) {
		throw new IllegalArgumentException("El año no puede ser negativo");
	}
	
	if (año%4 !=0){
		bisiesto= false;
	} else {
		if (año%400==0) {
			bisiesto= true;
		}else {
			bisiesto= false;
		}
	}
	return bisiesto;
}

}
