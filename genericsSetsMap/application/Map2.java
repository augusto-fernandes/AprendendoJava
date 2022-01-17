package application;

import java.util.HashMap;
import java.util.Map;

import entities.Map2Entities;

public class Map2 {

	public static void main(String[] args) {
		Map<Map2Entities, Double> stock = new HashMap<>();
		Map2Entities p1 = new Map2Entities("Tv", 900.0);
		Map2Entities p2 = new Map2Entities("Notebook", 1200.0);
		Map2Entities p3 = new Map2Entities("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		Map2Entities ps = new Map2Entities("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
