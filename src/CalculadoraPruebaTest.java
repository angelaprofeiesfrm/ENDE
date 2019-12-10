import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculadoraPruebaTest {
	CalculadoraPrueba calc;
	double resultado;
	double esperado;
	
	//Test Before (Inicialización del objeto "calc" de la clase "CalculadoraPrueba"
	@BeforeEach
	void before() {
		System.out.println("@Before: inicialización del objeto calc.");
		calc = new CalculadoraPrueba();
		resultado = 0.0;
		esperado = 0.0;
	}

	//Test del método suma
	@Test
	void testSuma() {
		System.out.println ("@testSuma");
		//CalculadoraPrueba calc = new CalculadoraPrueba();
		resultado = calc.Suma(0,0.00000001);
		esperado = 0.00000001;
		assertEquals(esperado, resultado, "Error en la suma");
		
	}
	
	//Test del método resta
	@Test
	void testResta() {
		System.out.println ("@testResta");
		//CalculadoraPrueba calc = new CalculadoraPrueba();
		resultado = calc.Resta(2,-1);
		esperado = 3;
		assertEquals(esperado, resultado, "Error en la resta");
		
	}
	
	//Test del métod Multi
	@Test
	void testMulti() {
		System.out.println ("@testMulti");
		//CalculadoraPrueba calc = new CalculadoraPrueba();
		resultado = calc.Multi(232323.232323,0);
		esperado = 0;
		assertEquals(esperado, resultado, "Error en la multiplicación");
		
	}
	
	//Test del método Div
	@Test
	void testDiv() {
		System.out.println ("@testDiv");
		//CalculadoraPrueba calc = new CalculadoraPrueba();
		
		resultado = calc.Div(0,0);
		esperado = -1;
		assertEquals(esperado, resultado, "Error en la División entre 0");
		
		resultado = calc.Div(10,2);
		esperado = 5;
		assertEquals(esperado, resultado, "Error en la División entre número distinto de cero");
		
	}
	
	@AfterEach
	void after() {
		System.out.println("@After: Terminando operación...\n");
		resultado = 0.0;
		esperado = 0.0;
	}

}
