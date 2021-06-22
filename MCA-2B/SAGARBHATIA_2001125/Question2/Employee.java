public class Employee extends Person
{
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo)
	{
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;

		this.nationalInsuranceNo = nationalInsuranceNo;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	public int getYearOfJoining()
	{
		return yearOfJoining;
	}
	public String getNationalInsuranceNo()
	{
		return nationalInsuranceNo;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "EMPLOYEE DETAILS ARE AS FOLLOWS :- \n NAME=" + name + "\n YEAROFJOINING=" + yearOfJoining + "\n ANNUALSALARY=" + annualSalary + "\n NATIONALINSURANCENO="+ nationalInsuranceNo;

	}
}
