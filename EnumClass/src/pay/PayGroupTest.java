package pay;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayGroupTest {

	@Test
	void test() {
		
		PayType payType = PayType.BAEMIN_PAY;
		PayGroup2 payGroup = PayGroup2.findByPayCode(payType);
		
		assertThat(payGroup.name(),is("CARD"));
		assertThat(payGroup.getTitle(), is("Ä«µå"));
		
	}

}
