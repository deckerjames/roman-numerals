package com.liberymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
		String convertedNumber = "";
		   	
		if (numberToConvert < 1 || numberToConvert > 3000)
	        return "Nice try!  Take a shot!";
	    while (numberToConvert >= 1000) {
	        convertedNumber += "M";
	        numberToConvert -= 1000;        }
	    while (numberToConvert >= 900) {
	        convertedNumber += "CM";
	        numberToConvert -= 900;
	    }
	    while (numberToConvert >= 500) {
	        convertedNumber += "D";
	        numberToConvert -= 500;
	    }
	    while (numberToConvert >= 400) {
	        convertedNumber += "CD";
	        numberToConvert -= 400;
	    }
	    while (numberToConvert >= 100) {
	        convertedNumber += "C";
	        numberToConvert -= 100;
	    }
	    while (numberToConvert >= 90) {
	        convertedNumber += "XC";
	        numberToConvert -= 90;
	    }
	    while (numberToConvert >= 50) {
	        convertedNumber += "L";
	        numberToConvert -= 50;
	    }
	    while (numberToConvert >= 40) {
	        convertedNumber += "XL";
	        numberToConvert -= 40;
	    }
	    while (numberToConvert >= 10) {
	        convertedNumber += "X";
	        numberToConvert -= 10;
	    }
	    while (numberToConvert >= 9) {
	        convertedNumber += "IX";
	        numberToConvert -= 9;
	    }
	    while (numberToConvert >= 5) {
	        convertedNumber += "V";
	        numberToConvert -= 5;
	    }
	    while (numberToConvert >= 4) {
	        convertedNumber += "IV";
	        numberToConvert -= 4;
	    }
	    while (numberToConvert >= 1) {
	        convertedNumber += "I";
	        numberToConvert -= 1;
	    }    
	    return convertedNumber;
	}
}

		