package ch11;

public class MyVectorAnswerTest {

	public static void main(String[] args){
		MyVectorAnswer v = new MyVectorAnswer();
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		
		System.out.println(v.remove(1));
		System.out.println(v);
		
		System.out.println(v.indexOf("3"));
		System.out.println(v.indexOf("1"));
		
		v.clear();
		System.out.println(v);
	}
	
}
