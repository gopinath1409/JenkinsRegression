package com.stepdefinition;

import com.base.LibGlobal;

import cucumber.api.java.Before;

public class HookClass extends LibGlobal {

	@Before
	public void beforeScenario1() {
		System.out.println("Before scenario 1");
		
	}

	@Before
	public void beforeScenario3() {
		System.out.println("Before scenario 3");
		
	}

	@Before
	public void beforeScenario2() {
		System.out.println("Before scenario ");
		
	}

	

}
