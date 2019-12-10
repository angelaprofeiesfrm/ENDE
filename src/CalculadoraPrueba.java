
public final class CalculadoraPrueba {
//Definición de mi clase "CalculadoraPrueba"
	
//****   Atributos de mi clase "CalculadoraPrueba"    ****
	private double resultado; 	//Variable de tipo double para almacenar resultados de operaciones.
	private double num1;		//Operando uno para realizar operaciones.
	private double num2;		//Operando dos para realizar las operaciones.
	
//****   Métodos de mi clase   ****
	//Constructor: se ejecutará cuando en el programa principal "main()" se instancie este objeto.
	public CalculadoraPrueba() { 
		resultado = 0;			//Inicializo variable resultado a 0.0;
		num1 = 0;				//Inicializo variable del operando uno a 0.0;
		num2 = 0;				//Inicializo variable del operando dos a 0.0;
	}
	
	//Método de suma: recibe dos números de tipo double, realiza la operación suma y devuelve el resutlado.
	public double Suma(double a, double b) {
		return a + b;
	}
	
	//Método de resta: recibe dos números de tipo double, realiza la operación resta y devuelve el resutlado.
	public double Resta(double a, double b) {
		return a - b;
	}
	
	//Método de multiplicación: recibe dos números de tipo double, realiza la operación multiplicación y 
	//devuelve el resutlado.
	public double Multi(double a, double b) {
		return a * b;
	}
	
	//Método de División: recibe dos números de tipo double, realiza la operación división y devuelve 
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
		//Creación del objeto del tipo "CalculadoraPrueba" que llama al constructor.
		CalculadoraPrueba calc = new CalculadoraPrueba();
		
		//Imprimimos el resutlado de llamar al método suma de nuestro objeto con dos valores.
		System.out.println("Resultado de la suma: "+calc.Suma(3.0, 5));
		
		//Imprimimos el resutlado de llamar al método resta de nuestro objeto con dos valores.
		System.out.println("Resultado de la resta: "+calc.Resta(3.0, 5));
		
		//Imprimimos el resutlado de llamar al método multi de nuestro objeto con dos valores.
		System.out.println("Resultado de la multiplicación: "+calc.Multi(3.0, 5));
		
		//Imprimimos el resutlado de llamar al método div de nuestro objeto con dos valores.
		System.out.println("Resultado de la división: "+calc.Div(3.0, 0.5));

	}
	
	
	
	

}
