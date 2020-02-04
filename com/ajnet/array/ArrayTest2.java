package com.ajnet.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 0.0;
		
		for(int i = 0; i < num.length ; i ++) {
			total += num[i];
		}
		System.out.println("Total = " + total);
		
		
		//유효한 갯수만큼만 사용
		double[] number = new double[5];
		
		int size =0;
		
		number[0] = 10.0; size++;
		number[1] = 20.0; size++;
		number[2] = 30.0; size++;
		
		double totalMulti = 1;
		
		for(int i = 0; i < size ; i++) {
			totalMulti *= number[i];
		}
		
		System.out.println("Total = " + totalMulti);

	}

}
