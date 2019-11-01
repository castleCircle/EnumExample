package table;
public enum TableStatus {

	Y("1",true),
	N("0",false);
	
	private String tableValue;
	private boolean tableValue2;
	
	TableStatus(String tableValue,boolean tableValue2) {
		this.tableValue = tableValue;
		this.tableValue2 = tableValue2;
	}
	
	public String getTable1Value() {
		return tableValue;
	}
	
	public boolean isTable2Value() {
		return tableValue2;
	}
}

