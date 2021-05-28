
public class User{
	private int age;

	public int getAge() {
		return age;
	}
	//called code
//	public void setAge(int a) {
//		if(a<18) {
//			try {
//				throw new CustomExceptionHandler("age cant be <18")
//			}catch(CustomExceptionHandler e) {
//				e.p
//			}
//			
//		}else {
//			age = a;
//		}
//		
//	
//	
//	}
	public void setAge(int a) throws CustomExceptionHandler {
		if(a<18) {
			throw new CustomExceptionHandler("age cant be <18");
		}else {
			age = a;
		}
	}
	//calling code
	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(5);
		}catch(CustomExceptionHandler e) {
			System.out.println("not allowed");
		}
		
		System.out.println(user.getAge());;
	}
	
}
