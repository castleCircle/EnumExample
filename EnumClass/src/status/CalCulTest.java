package status;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalCulTest {

	@Test
	void test() {
		Calculator code = Calculator.CALC_B;
		long originValue = 10000L;
		long result = code.calculate(originValue);
		
		assertThat(code, is(Calculator.CALC_B));
		assertThat(result, is(10000L*10));
	}

}
