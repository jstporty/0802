
public class MethodDemo2 {
	public static void main(String[] args) {

		System.out.println("Program is Starting....");	
		MethodDemo2 md = new MethodDemo2();
		int start=1,last=100;
		int result = md.makeSum(start,last);
		System.out.println(start+"부터"+last+"까지합은"+result);
		start=30;last=50;
		 result = md.makeSum(start,last);
		md.makeSum(30, 50);
		System.out.println(start+"부터"+last+"까지합은"+result);

		
		System.out.println("Program is Over.......");
	}

	
	int makeSum(int start, int last) { // Call by Value
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}

		System.out.println("Method is Over.......");
		return sum; // return;//이것은 생략되어있음ㅋ.
	}
}
