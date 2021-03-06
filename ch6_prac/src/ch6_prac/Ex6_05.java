package ch6_prac;

public class Ex6_05 {
	public static void main(String args[]){
		Student3 s = new Student3("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student3{ //클래스
	String name; //학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	Student3(String name, int ban, int no, int kor, int eng, int math){ //생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float result = (int)(getTotal() / 3f*10+0.5f)/10f;
		return result;
	}

	String info(){ 
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}