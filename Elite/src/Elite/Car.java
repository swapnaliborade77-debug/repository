package Elite;

public class Car {
	private String model;
	private String[] features;
	public Car(String model,String...features) { 
		this.model=model;
		this.features=features;
		
		
	}
	public void specs() {
		System.out.println("Feature of "+model);
		for(String f:features)
			System.out.println(f);
		
	}
	public static void main(String[] args) {
		Car astor= new Car("BMW","keyless","ABS","ADAS"); 
				astor.specs();
		
	}

}

