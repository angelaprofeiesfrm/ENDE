
public final class CalculadoraPrueba {
//Definici�n de mi clase "CalculadoraPrueba"
	
//****   Atributos de mi clase "CalculadoraPrueba"    ****
	private double resultado; 	//Variable de tipo double para almacenar resultados de operaciones.
	private double num1;		//Operando uno para realizar operaciones.
	private double num2;		//Operando dos para realizar las operaciones.
	
//****   M�todos de mi clase   ****
	//Constructor: se ejecutar� cuando en el programa principal "main()" se instancie este objeto.
	public CalculadoraPrueba() { 
		resultado = 0;			//Inicializo variable resultado a 0.0;
		num1 = 0;				//Inicializo variable del operando uno a 0.0;
		num2 = 0;				//Inicializo variable del operando dos a 0.0;
	}
	
	//M�todo de suma: recibe dos n�meros de tipo double, realiza la operaci�n suma y devuelve el resutlado.
	public double Suma(double a, double b) {
		return a + b;
	}
	
	//M�todo de resta: recibe dos n�meros de tipo double, realiza la operaci�n resta y devuelve el resutlado.
	public double Resta(double a, double b) {
		return a - b;
	}
	
	//M�todo de multiplicaci�n: recibe dos n�meros de tipo double, realiza la operaci�n multiplicaci�n y 
	//devuelve el resutlado.
	public double Multi(double a, double b) {
		return a * b;
	}
	
	//M�todo de Divisi�n: recibe dos n�meros de tipo double, realiza la operaci�n divisi�n y devuelve 
	//el resutlado.
	public double Div(double a, double b) {
		if (b>0) {
			return a / b;
		}
		else {
			return -1;
		}
	}
	
	//Programa principal
	public static void main(String[] args) {
		//Creaci�n del objeto del tipo "CalculadoraPrueba" que llama al constructor.
		CalculadoraPrueba calc = new CalculadoraPrueba();
		
		//Imprimimos el resutlado de llamar al m�todo suma de nuestro objeto con dos valores.
		System.out.println("Resultado de la suma: "+calc.Suma(3.0, 5));
		
		//Imprimimos el resutlado de llamar al m�todo resta de nuestro objeto con dos valores.
		System.out.println("Resultado de la resta: "+calc.Resta(3.0, 5));
		
		//Imprimimos el resutlado de llamar al m�todo multi de nuestro objeto con dos valores.
		System.out.println("Resultado de la multiplicaci�n: "+calc.Multi(3.0, 5));
		
		//Imprimimos el resutlado de llamar al m�todo div de nuestro objeto con dos valores.
		System.out.println("Resultado de la divisi�n: "+calc.Div(3.0, 0.5));

	}
	
	
	
	

}
