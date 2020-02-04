package com.ajnet.array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabet = new char[70];
		
		char ch = 'A';
		for(int i = 0; i < alphabet.length; i++, ch++) {
			alphabet[i] = ch;
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
	}

}
