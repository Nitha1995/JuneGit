package Stringpgms;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="welcome";
		String s3="Hello";
		String s4="Helloo welocme luminar";
		String s5="    hellooo";
//concat
		System.out.println("concat");
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(1+2+s1+s2+4+5);
//equals
		System.out.println("equals");
		System.out.println(s1.equals(s2));//compare
		System.out.println(s1.equalsIgnoreCase(s3));
//upper and lower
		System.out.println("upper and lower");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
//contains
		System.out.println("contains");
		System.out.println(s1.contains("luminar"));//any other string contains
//length
		System.out.println("length");
		System.out.println(s1.length());
//startswith and endwith
		System.out.println("startswith");
		System.out.println(s1.startsWith("hello"));//true starting il expected word undo
		System.out.println("Endswith");
		System.out.println(s1.endsWith("luminar"));//true
//substring
		System.out.println("substring");
		System.out.println(s1.substring(0,3));
//trim
		System.out.println("trim");
		System.out.println(s5.trim());//starting and ending white spaces remove
//split
		System.out.println("split");
		String[]st =s4.split("");
		for(String v:st) {
			System.out.println(v);
		}
//replace
		System.out.println("replace");
		System.out.println(s1.replace("hello","haikkkkk"));
//charAt
		System.out.println("charAt");
		System.out.println(s1.charAt(1));
}

}
