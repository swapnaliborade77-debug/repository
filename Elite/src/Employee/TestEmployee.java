package Employee;

import Elite.Manger;
import Elite.clerk;

public class TestEmployee {

    public static void main(String[] args) {

        Manger m = new Manger(1500, 1000);
        clerk c = new clerk(1200, 500);

        showSalary(m);
        showSalary(c);
    }

    private static void showSalary(Employee e) {
    	if(e instanceof Manger) 
        System.out.println("Employee Salary: " + e.getSalary());
    	else
    		System.out.println("Clerk Salary:"+e.getSalary());
    }
}