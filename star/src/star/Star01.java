package star;

public class Star01 {

	public static void main(String[] args) {
		for(int i =1; i<=5;i++){
//			System.out.println("*****");
		for(int j =1;j<=5;j++){
			
			if(j>=i){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}
