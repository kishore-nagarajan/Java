package org.string;
public class Strings {
	public static void main(String[] args) {
		String s="No-90 Balaji Nagar, Pallikaranai, Chennai-608001";
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean startsWith = s.startsWith("No");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("9001");
		System.out.println(endsWith);
		
		char charAt = s.charAt(25);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('i');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('i');
		System.out.println(lastIndexOf);
		
		int indexOf2 = s.indexOf('i', 15);
		System.out.println(indexOf2);
		
		int indexOf3 = s.indexOf("al", 14);
		System.out.println(indexOf3);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		
		
		
		
		
		
		
		
		
		
		int x=123;
		String i=s.valueOf(x)+'1';
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
