package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FruitTest {

	@Test
	void test() {
		
		Fruit fruit = Fruit.BANANA;
		CheckFruitManager cfm = CheckFruitManager.findByColor(fruit);
		
		assertThat(cfm.color, is("³ë¶õ»ö"));

	}

}
