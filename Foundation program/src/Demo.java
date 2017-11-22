
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	void show() {
		System.out.println("Method call");
	}

	void getGreating(String user) {
		System.out.println("Hi" + user + "welcome");
	}

	double calculateNetSalary(double basicSalary, float travelAllowance, float dearnessAllowance,
			float houseRentAllowance, float providentFund) {
		double netSalary = basicSalary + (houseRentAllowance * (basicSalary / 100))
				+ (travelAllowance * (basicSalary / 100)) + (dearnessAllowance * (basicSalary / 100))
				- (providentFund * (basicSalary / 100));
		return netSalary;
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Hello welcome");

		long accountNumber = 123454567892333456L;
		float houseRentAllowance = 5.0f;
		double travelAllowance = 5.3;
		boolean status = true;
		int white = 0xfff;
		short black = (short) ~white;
		double providentFund = houseRentAllowance;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name = bf.readLine();
		int age = Integer.valueOf(bf.readLine());

		System.out.println(name + 3);
		System.out.println(age + 3);

		/*
		 * System.out.println("Object 1");
		 *  Employee employee = new Employee();
		 * 
		 * System.out.println(employee.getId());
		 * System.out.println(employee.getEmail());
		 * System.out.println(employee.getName());
		 * System.out.println(employee.getPhone());
		 * System.out.println(employee.isGender()); 
		 * employee.setId(2);
		 * employee.setEmail("a@gmail.com"); employee.setName("janu");
		 * employee.setPhone(9123456789L); employee.setGender(true);
		 * System.out.println(employee.getId());
		 * 
		 * System.out.println(employee.getEmail());
		 * 
		 * System.out.println(employee.getName());
		 * 
		 * System.out.println(employee.getPhone());
		 * 
		 * System.out.println(employee.isGender());
		 * 
		 * System.out.println("Object 2"); Employee employee1 = new Employee();
		 * System.out.println(employee1.getId());
		 * System.out.println(employee1.getEmail());
		 * System.out.println(employee1.getName());
		 * System.out.println(employee1.getPhone());
		 * System.out.println(employee1.isGender()); employee1.setId(5);
		 * employee1.setEmail("abc@gmail.com"); employee1.setName("boobi");
		 * employee1.setPhone(9123214241L); employee1.setGender(true);
		 * System.out.println(employee1.getId());
		 * 
		 * System.out.println(employee1.getEmail());
		 * 
		 * System.out.println(employee1.getName());
		 * 
		 * System.out.println(employee1.getPhone());
		 * 
		 * System.out.println(employee1.isGender());
		 */
	}

}
