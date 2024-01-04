
public class Firstclass {
	int a = 5;
	public void getData() {
	
		
		System.out.println("I am in method");
		//return "hello";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstclass fn = new Firstclass();
		secondclass sn = new secondclass();
		sn.setData();
		fn.getData();
		System.out.println(fn.a);
		System.out.println("a");
		System.out.println("hi");
		System.out.println("hello world");
		
	}

}
