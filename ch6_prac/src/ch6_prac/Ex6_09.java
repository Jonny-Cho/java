package ch6_prac;

// static�� �ٿ��� �ϴ� �����?

class Marine {
	int x = 0, y = 0; // Marine (x,y) �� ��ġ��ǥ
	int hp = 60; // ���� ü��
	int weapon = 6; // ���ݷ�
	int armor = 0; // ����

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
 ������ ����°� ������ ��縶������ ����� �����̴�.
 weapon, armor�տ� static�� ������
 �̿� ���õ� �޼ҵ� weaponUp(), armorUp()��
 
  */

class ch6_09 {
	public static void main(String args[]) {
	}
}
