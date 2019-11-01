package table;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableTest {

	@Test
	void test() {
		TableStatus origin = TableStatus.Y;
		
		String t1 = origin.getTable1Value();
		boolean t2 = origin.isTable2Value();
		
		assertThat(origin, is(TableStatus.Y));
		assertThat(t1, is("1"));
		assertThat(t2, is(true));
		
		
		TableStatus origin2 = TableStatus.N;
		
		String t3 = origin2.getTable1Value();
		boolean t4 = origin2.isTable2Value();
		
		assertThat(origin2, is(TableStatus.N));
		assertThat(t3, is("0"));
		assertThat(t4, is(false));
		
	}

}
