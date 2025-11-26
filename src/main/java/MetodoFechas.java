
public static boolean MetodoFechas ( int anio) {

	boolean bisiesto = false;
	
	if (anio<0) {
		throw new IllegalArgumentException("El año no puede ser negativo");
	}
	
	if (anio%4 !=0){
		bisiesto= false;
	}
}
