package pay;

public enum PayType {

	ACCOUNT_TRANSFER("������ü"),
	REMITTANCE("�������Ա�"),
	ON_SITE_PAYMENT("�������"),
	TOSS("�佺"),
	PAYCO("������"),
	CARD("�ſ�ī��"),
	KAKAO_PAY("īī������"),
	BAEMIN_PAY("�������"),
	POINT("����Ʈ"),
	COUPON("����"),
	EMPTY("����");
	
	private String title;
	
	PayType(String title){
		this.title= title;
	}
	
	public String getTitle() {
		return title;
	}
}
