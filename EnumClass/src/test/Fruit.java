package test;

public enum Fruit {

	LEMON("����"),
	BANANA("�ٳ���"),
	APPLE("���");
	
	String fruit;
	
	public String getFruit() {
		return fruit;
	}

	Fruit(String fruit){
		this.fruit = fruit;
	}
	
}
