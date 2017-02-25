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
	
	private int gas = 100;
	
	/**
	*тест метода drive(int value).
	*/
	@Test
	public void whenDriveThenLeft() {		
		Car car = new Car();
		//gas = 100;
		//car.drive(20);
		assertThat(car.drive(20), is(80));
	}
	
	/**
	*test method fill(int value).
	*/
	@Test
	public void whenFillThenGas() {		
		Car car = new Car();
		//int gas = 50;
		car.fill(150);
		assertThat(gas, is(150));
	}
	
	/**
	*test method showGas().
	*/
	@Test
	public void whenGasThenShow() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Car car = new Car();
		car.showGas();
		assertThat(out.toString(), is("Gas: 100\r\n"));
	}
	

}