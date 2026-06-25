package Elite;

public class StringDemo {
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 =new String("Hello");
		String s3 ="Hello";
		 System.out.println(s1==s2);
		 System.out.println(s1==s3);
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3));
		 s1 = s1+" world";
		 System.out.println(s1);
		 String name = "Sona";
		 String nameRegex="[A-Z]{1} [a-z]{3,}";
		 System.out.println(name.matches(nameRegex));
		 String cell = "7709741227";
		 String cellRegex = "[6-9] [0-9]{9}";
		 System.out.println(cell.matches(cellRegex));
		 String email = "Sona@gmail.com";
		 String emailRegex =  "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		 System.out.println(cell.matches(emailRegex));
	}
} 
