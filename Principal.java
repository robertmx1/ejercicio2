public class Principal{
	public static void main(String[] args){	
	int resultadoSuma;
	Suma metodoSuma = new Suma();
	resultadoSuma = metodoSuma.adicion(6,6);
	
	double resultadoDivision;
	Division metodoDividir = new Division();
	resultadoDivision = metodoDividir.dividir(15.6,2.5);

	System.out.println(resultadoSuma);
	System.out.println(resultadoDivision);
	}
}
