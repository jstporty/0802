
public class MethodDemo4 {
	public static void main(String[] args) {
		int original=5;
		System.out.println("Before calling method, original="+original);
		mymethod(original);		
		System.out.println("In method, target="+original);
	}
	static void mymethod(int target) {//int target=original
		System.out.println("In method, target="+target);
		target=100;
		System.out.println("In method, target="+target);
		
	}
}
