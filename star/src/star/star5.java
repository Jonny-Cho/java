package star;

public class star5 {

	public static void main(String[] args) {
		// ctrl+D ���ٻ���
		// sysout �Է��ϰ� ctrl+space
		
		
		// for��
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// if��
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i-j>=0){
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
