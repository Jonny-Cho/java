package ch6;

class TvTest4 {
	public static void main(String[] args) {
		tv[] tvArr = new Tv[3]; // ���̰� 3�� Tv��ü �迭
		
		// Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i<tvArr.length;i++){
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length;i++){
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
}

class Tv {
	// Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
