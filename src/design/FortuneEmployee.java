package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		Person emp1 = new EmployeeInfo("Selenium Testing","Action", 3152,6.1,"American");
		System.out.println(((EmployeeInfo) emp1).employeeName());
		System.out.println(((EmployeeInfo) emp1).getDept());
		System.out.println(((EmployeeInfo) emp1).employeeId());
		System.out.println(((EmployeeInfo) emp1).getEthnicity());
		System.out.println(((EmployeeInfo) emp1).getHeight());
		System.out.println(((EmployeeInfo) emp1).calculateSalary());
		emp1.groceryBudget();
		((EmployeeInfo) emp1).benefitLayout();
		emp1.job();
		emp1.function();
		System.out.println();
		((EmployeeInfo) emp1).calculateEmployeePension();
		((EmployeeInfo) emp1).calculateEmployeeBonus();

	}

}

