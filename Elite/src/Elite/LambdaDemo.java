package Elite;


interface Hello {
	String Greet();
	default void demo() {
		System.out.println("Hello Demo  " +temp());
	}
	
	static void test() {
		System.out.println("Hello test");
	}
	private String temp() {
		return "Hello temp";
		
	}
}

@FunctionalInterface
interface printer{
	void print(String name);
}



public class LambdaDemo {
	public static void main(String[] args) {
		Hello h1 = ()->"Hello Lambda";
		System.out.println(h1.Greet());
		
		Hello h2 = ()->{
		String msg ="Bonjour Lambda";
		return msg;
		
		
	};
	System.out.println(h2.Greet());
	printer p1 = (name)->System.out.println(name);
	p1.print("sona");
	
	
	printer p2 = System.out::println;
	p2.print("Amazing");
	
	h1.demo();
	Hello.test();
	
	
	
	
	
	}

}
