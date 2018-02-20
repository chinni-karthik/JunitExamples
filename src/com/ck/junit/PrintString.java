package com.ck.junit;

public class PrintString {
	public String printGivenStringInLower(String input) {
		return input.toLowerCase();
	}

	public boolean isLengthOfStringEven(String input) {
		boolean isEvenLength = input.length() % 2 == 0 ? true : false;
		return isEvenLength;
	}
}
