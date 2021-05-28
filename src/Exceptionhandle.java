
public class Exceptionhandle {
	public static void main(String[] args) {
		int a = 10;
		int b= 10;
		try {
			int c = a/b;
			System.out.println(c + " = c ");
			
			int[] marks = {45, 56 , 56, 76, 56};
			System.out.println(marks[2]);
			
			String str = null;
			System.out.println(str.charAt(2));
			
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println("null pointer");
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("finally block");
			System.out.println("resource close");
		}
	
		
	}
}
