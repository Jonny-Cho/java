package star;

public class Star6 {

	public static void main(String[] args) {
//		for(int i=1; i<=5;i++){
//			for(int j=1;j<=6-i;j++){
//				System.out.print("*");
//			}
//			System.out.println(" ");
//	}
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i<=j){
					System.out.print("*");	
				}
				else{
					System.out.print("_");
				}
			}
			System.out.println();
		}
}
}