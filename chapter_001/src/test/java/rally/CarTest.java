package rally;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
*тесты методов класса Car.
*@author Dinid Saetgareev (dins0086@mail.ru)
*@since 13:21 24.02.2017
*@version 1.0
*/
public class CarTest {
	
	
	/**
	*тест метода drive(int value).
	*/
	@Test
	public void whenDriveThenLeft() {
		int gas = 100;
		Car car = new Car();		
		car.drive(10);
		assertThat(gas, is("90"));
	}
	
	/**
	*test method fill(int value).
	*/
	@Test
	public void whenFillThenGas() {
		int gas = 50;
		Car car = new Car();
		car.fill(150);
		assertThat(gas, is("150"));
	}
	
	/**
	*test method showGas().
	*/
	/**@Test
	public void whenGasThenShow() {
	int gas = 100;
	Car car = new Car();
	String result = car.showGas();
	assertThat(result, is("Gas: 100"));
	}*/
	

}