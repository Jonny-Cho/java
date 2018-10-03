/*package ch11_prac;

import java.util.*;


// 1. Comparable 인터페이스 구현
class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name +","+ban +","+no +","+kor + ","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
	
	// 3. 문자열 비교를 위한 getName 메서드 생성
	String getName(){
		return name;
	}
	
	// 2. compareTo 오버라이딩.
	// 사전순으로 this.getName()이 파라미터보다 작으면 -1, 같으면 0, 크면 1을 return
	@Override
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
	
}


public class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		
		// 문제. 사용자가 만든 객체는 sort 메서드가 제대로 작동하지 않는다.
		// 어떤 객체를 기준으로 어떻게 정렬해야 할지 알 수 없기 때문.
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	
	}
}*/