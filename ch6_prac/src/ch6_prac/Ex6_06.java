package ch6_prac;

class Ex6_06 {
	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	//Math.sqrt

	static double getDistance(int x, int y, int x1, int y1) { // cm
		double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		return result;
		
	}
	
	public static void main(String args[]) { //cm -> cm 호출
		System.out.println(getDistance(1,1,2,2));
	}
		
}

