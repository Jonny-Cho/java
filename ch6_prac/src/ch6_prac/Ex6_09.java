package ch6_prac;

// static을 붙여야 하는 멤버는?

class Marine {
	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	int weapon = 6; // 공격력
	int armor = 0; // 방어력

	void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

/*
 마린의 공경력과 방어력은 모든마린에게 공통된 사항이다.
 weapon, armor앞에 static을 붙이자
 이와 관련된 메소드 weaponUp(), armorUp()도
 
  */

class ch6_09 {
	public static void main(String args[]) {
	}
}
