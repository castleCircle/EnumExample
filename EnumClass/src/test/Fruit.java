package test;

public enum Fruit {

	LEMON("레몬"),
	BANANA("바나나"),
	APPLE("사과");
	
	String fruit;
	
	public String getFruit() {
		return fruit;
	}

	Fruit(String fruit){
		this.fruit = fruit;
	}
	
}
