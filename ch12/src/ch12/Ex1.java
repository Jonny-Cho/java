package ch12;

class Box<T> {
	T item;
	
	void setItem(T item){
		this.item = item;
	}
	T getItem(){
		return item;
	}
}

class Box2 {
	Object item;
	
	void setItem(Object item){
		this.item = item;
	}
	Object getItem(){
		return item;
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		b.setItem("123");
		System.out.println(b.getItem());
		
		Box<Integer> n = new Box<Integer>();
		n.setItem(1);
		System.out.println(n.getItem()+1);
		
		Box2 b2 = new Box2();
		b2.setItem("123");
		System.out.println(b2.getItem());
		
		Box2 n2 = new Box2();
		n2.setItem(123);
		System.out.println(n2.getItem());
	}
}
