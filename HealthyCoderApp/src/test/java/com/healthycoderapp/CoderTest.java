package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoderTest {
private Coder coder;
	@Test
	void ArgumentSetup() {
		coder = new Coder();
		coder.setAge(10);
		coder.setGender(Gender.MALE);
		coder.setHeight(100);
		coder.setWeight(40);
	}
}
