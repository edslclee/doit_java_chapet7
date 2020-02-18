package com.ajnet.array;

public class ObjectArrayCopyDeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[3];
		Book[] libraryCopy = new Book[3];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("해리포터", "조안 롤링");
		
		libraryCopy[0] = new Book();
		libraryCopy[1] = new Book();
		libraryCopy[2] = new Book();
		
		for(int i = 0; i < library.length ; i++) {
			libraryCopy[i].setBookName(library[i].getBookName());
			libraryCopy[i].setAuthor(library[i].getAuthor());
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < libraryCopy.length; i++) {
			libraryCopy[i].showBookInfo();
		}
		
		library[0].setBookName("나목");
		library[0].setAuthor("박완서");
		
		System.out.println("=======================================");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < libraryCopy.length; i++) {
			libraryCopy[i].showBookInfo();
		}
		
		System.out.println("=======================================");
		
		for(Book s : libraryCopy) {
			System.out.println(s);
		}
		
	}

}
