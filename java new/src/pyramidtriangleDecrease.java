
public class pyramidtriangleDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for (int i = 1; i <= 4; i++) {
		//	System.out.println("outer loop started");
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println("");
		}
	}

}
