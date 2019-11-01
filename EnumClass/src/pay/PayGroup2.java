package pay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PayGroup2 {
	
	CASH("현금",Arrays.asList(PayType.ACCOUNT_TRANSFER,PayType.ON_SITE_PAYMENT,PayType.TOSS)),
	CARD("카드",Arrays.asList(PayType.PAYCO,PayType.CARD,PayType.KAKAO_PAY,PayType.BAEMIN_PAY)),
	EMPTY("없음",Collections.EMPTY_LIST);
	
	String title;
	List<PayType> payList;
	
	PayGroup2(String title, List<PayType> payList){
		this.title = title;
		this.payList = payList;
	}
	
	public static PayGroup2 findByPayCode(PayType paytype) {
		return Arrays.stream(PayGroup2.values())
				.filter(payGroup->payGroup.hasPayCode(paytype))
				.findAny()
				.orElse(EMPTY);
	}
	
	public boolean hasPayCode(PayType paytype) {
		return payList.stream().anyMatch(pay->pay==(paytype));
	}
	
	public String getTitle() {
		return title;
	}
	

}
