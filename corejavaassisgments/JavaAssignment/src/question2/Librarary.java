package question2;

import java.util.Scanner;

public class Librarary {
	 private static final int MAX_BOOKS = 5;
	 public static void main(String[] args) {
	        Author author1 =new Author("Siva", 30, "Male");
	        Author author2 =new Author("sankar",33, "Male");
	        Author author3 =new Author("Indra", 28, "Male");
	        Author author4 =new Author("Rishi", 26, "Male");
	        Author author5 =new Author("Vasantha", 27, "Male");
	        Book[] book =new Book[5];
	        book[0] =new Book("java", author1, 100, 500, 101);
	        book[1] =new Book("j2ee", author2, 200, 600, 102);
	        book[2] =new Book("C++", author3, 300, 500, 103);
	        book[3] =new Book("Docker", author4, 400, 700, 104);
	        book[4] =new Book("AWS", author5, 100, 400, 105);
	        try {
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter book index number to get the details");
	        int indexnumber = scanner.nextInt();
	        System.out.println("Book detals:"+book[indexnumber]);
	        }catch(Exception e) {
	            System.out.println(e.getMessage());
	        }

	 

	    }}
