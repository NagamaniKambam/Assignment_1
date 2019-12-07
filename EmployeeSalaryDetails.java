import java.util.Scanner;

class TaxCalculationDetails {
	Scanner sc = new Scanner(System.in);
	double ESI, PF, PT, Incometax;
    double Basicsalary;
	double Netsalary;
	double Discount;
	double Annualsalary;
	double Deductedamount;
	// Calculating for PF amount
	public void esi() {
		System.out.println("Basic salary of the employee is : ");
		Basicsalary = sc.nextDouble();
		if (Basicsalary >= 21000) {
			PF = (Basicsalary * 12) / 100;
			System.out.println(" provident fund is : " + PF);
		}
	}
	//Calculating for PT amount
	public void pt() {
				 
				if (Basicsalary <= 15000)
				{
					System.out.println(PT = 0);
				}
				else if (Basicsalary > 15000 && Basicsalary <= 20000) {
					PT = 150;
					System.out.println("Professional tax is : " + PT);
					
				} else if (Basicsalary > 20000) {
					PT = 200;
					System.out.println("Professional tax is : " + PT);
				}
			}
	// Calculating income tax based on annual salary
	public void tax() {
		
		Annualsalary = Basicsalary * 12;
		if (Annualsalary <= 250000) {
			Incometax = 0;
			System.out.println("Tax is not applicable to below 250000");
	    }
		else if (Annualsalary > 250000 && Annualsalary <= 500000)
		{
			Incometax = (Annualsalary * 3) / 100 ;
			System.out.println("We pay " + Incometax + " to Incometax Department ");
		}
		else if (Annualsalary > 500000 && Annualsalary <= 1000000)
		{
			
			Incometax = 12500 + Annualsalary * 20 / 100;
			System.out.println("We pay annual " + Incometax + " to Incometax Department ");
		}
		else if (Annualsalary > 1000000)
		{
			Incometax = 12500 + 100000 + (Annualsalary * 30) / 100;
			System.out.println("We pay annual " + Incometax + " to Incometax Department ");
		}
	}
	// Calculating deducted amount and net salary based on monthly 
	public void netsalary() {
		Deductedamount = (Incometax / 12) + PT + PF ;
		System.out.println(Deductedamount + " amount is deducted");
		Netsalary = Basicsalary - Deductedamount;
		System.out.println(Netsalary + " is Netsalary");
	}
}
public class EmployeeSalaryDetails extends TaxCalculationDetails {
 public static void main(String[] args) {
	EmployeeSalaryDetails e2 = new EmployeeSalaryDetails();
	Scanner sc = new Scanner(System.in);
	e2.esi();
	e2.pt();
	e2.tax();
	e2.netsalary();
}
}
