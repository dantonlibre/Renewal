package com.class11;

public class ThisKeyword4 {

	int z;

	ThisKeyword4() {
		System.out.println("This is a default constractor");
	}

	ThisKeyword4(String a) {
		this();
		System.out.println("Parametrized constractor");
	}

}
