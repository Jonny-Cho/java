package Exercise;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

// 1. 레이아웃 구성
// 2. 5x5 배열 만들기 & 랜덤 숫자 섞기
// 3. 레이아웃에 버튼으로 만들기
// + 객체지향적으로 다듬기
// 4. 이벤트구현 / 클릭하면 노랑색상 / 그 값 불러옴
// 5. 빙고체크 / 빙고맞으면 초록색상

public class BingoPrac extends Frame{
	final int SIZE = 5;
	int bingoCnt = 0; // 빙고카운트
	
	Button[] btnArr = null;
	int[][] bArr = new int[SIZE][SIZE]; // 빙고 체크위한 배열
	String[] numStr = new String[25];
			
	BingoPrac(){
		this("Bingo game");
	}
	
	BingoPrac(String title){
		super(title);
		//1. 레이아웃 구성------------------------------------------
		setLayout(new GridLayout(SIZE, SIZE));
		
		EventHandler handler = new EventHandler();
		addWindowListener(handler);
		
		for(int i=0;i<numStr.length;i++){
			numStr[i] = Integer.toString(i+1);
		}
		// 배열 섞기
		for(int i=0;i<numStr.length;i++){
			//0~24중에 하나 뽑아 변수에 넣기
			int random = (int)(Math.random()*numStr.length);
			//자리바꿈
			String tmp = numStr[i];
			numStr[i] = numStr[random];
			numStr[random] = tmp;
		}
		
		btnArr = new Button[SIZE * SIZE];
		for (int i=0;i<SIZE*SIZE;i++){
			btnArr[i] = new Button(numStr[i]);
			add(btnArr[i]);
			btnArr[i].addActionListener(handler);
		}
		
		setBounds(600, 250, 400, 400); // 컴포넌트 위치(x, y)와 크기 (width, height)
		setVisible(true); // 내용을 화면에 표시한다
		
	}
	
	public static void main(String[] args) {
		BingoPrac win = new BingoPrac("Bingo Game");
		win.setVisible(true);
	} // main method
	
	public void print() { // 빙고배열 bArr 출력
		for(int i=0;i<bArr.length;i++){
			for(int j=0;j<bArr[i].length;j++){
				System.out.print(bArr[i][j] ? "O" : "X");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println(this.bingoCnt);
	}
	
	boolean checkBingo() {
		this.bingoCnt = 0;
		int garoCnt = 0;
		int seroCnt = 0;
		int crossgaroCnt = 0;
		int crossseroCnt = 0;
		for(int i=0;i<bArr.length;i++){
			garoCnt = 0; seroCnt = 0;
			for(int j=0;j<bArr[i].length;j++){
				if(bArr[i][j]==1){garoCnt++;};
				if(bArr[j][i]==1){seroCnt++;};
				if(i==j && bArr[i][j]==1){crossgaroCnt++;};
				if(i+j==4 && bArr[i][j]==1){crossseroCnt++;};
			}
			if(garoCnt==5){bingoCnt++;};
			if(seroCnt==5){bingoCnt++;};
		}
		if(crossgaroCnt==5){bingoCnt++;};
		if(crossseroCnt==5){bingoCnt++;};
		
		return bingoCnt;
	}
	
	
	
} // class BingoPrac

class EventHandler extends WindowAdapter implements ActionListener{
	public void windowClosing(WindowEvent e) { // Frame의 닫기 버튼을 눌렀을 때 호출된다.
		e.getWindow().setVisible(false); // Frame을 화면에서 보이지 않도록 하고
		e.getWindow().dispose(); // 메모리에서 제거한다.
		System.exit(0); // 프로그램을 종료한다.
	}
	
	public void actionPerformed(ActionEvent ae){
		Button btn = (Button)ae.getSource();
		System.out.println(btn.getLabel());
		btn.setBackground(Color.YELLOW);
	}
}
