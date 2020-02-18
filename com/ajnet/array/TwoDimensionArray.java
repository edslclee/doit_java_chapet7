package com.ajnet.array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] array = new int [2][3];
		int [][] array = {{1,2,3},{4,5,6}};
		System.out.println("===================");
		System.out.println(array.length);
		System.out.println("===================");
		System.out.println(array[0].length);
		System.out.println("===================");
			
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println("");
		}
	
	}

}
