package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DietPlanTest {
private DietPlan dietPlan;
	@Test
	void argumentSetup() {
		dietPlan = new DietPlan();
		dietPlan.setCalories(100);
		dietPlan.setCarbohydrate(10);
		dietPlan.setFat(100);
		dietPlan.setProtein(100);
		System.out.println(dietPlan);
	}

}
