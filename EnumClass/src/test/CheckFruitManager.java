package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum CheckFruitManager {

	YELLOW("노란색",Arrays.asList(Fruit.LEMON,Fruit.BANANA)),
	RED("빨간색",Arrays.asList(Fruit.APPLE)),
	EMPTY("없음",Collections.EMPTY_LIST);
	
	String color;
	List<Fruit> fruits;
	
	CheckFruitManager(String color,List<Fruit> fruits) {
		this.color = color;
		this.fruits = fruits;
	}
	
	public static CheckFruitManager findByColor(Fruit fruit) {
		return Arrays.stream(CheckFruitManager.values())
				.filter(color->color.hasFruit(fruit))
				.findAny()
				.orElse(EMPTY);
	}
	
	public boolean hasFruit(Fruit fruit) {
		return fruits.stream().anyMatch(fr->fr==fruit);
	}
	

}
