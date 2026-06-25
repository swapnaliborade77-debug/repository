package Elite;

import Employee.Employee;

public class Manger extends Employee {
	    private double commission;
	    public Manger(double salary, double commission) {
	        super(salary);
	        this.commission = commission;
	    }

	    @Override
	    public double getSalary() {
	        return super.getSalary() + commission;
	    }
	}


