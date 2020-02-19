package com.ajnet.array;

import java.util.ArrayList;

public class ArrayListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String> ();
		//ArrayList의 Method를 보려면 ArrayLIst에 cursor 놓고 F1 key
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		
		for(String s : arrayList) {
			System.out.println(s);
		}
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
