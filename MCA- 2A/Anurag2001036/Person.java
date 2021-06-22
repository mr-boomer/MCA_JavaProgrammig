class Person
{
	private String name;
	private int id;
	// private int joinyear;

	public Person(String n, int ids)
	{
	  name = n;
	  id = ids;
	  // joinyear=byyear;
	}

	public String toString()
	{
	  return "Person[name=" + name + ",id=" + id + "]";
	}
}

 class Instructor extends Person
{
	private double salary;
	private int joinyear;

	public Instructor(String n, int ids, double s,int j)
    {
      super(n, ids);
      salary = s;
      joinyear=j;
    }

    public String toString()
    {
      return "Employee[super=" + super.toString() + ",salary=" + salary + ",joinyear="+ joinyear +"]";
    }
}

 class PersonTester
{
  public static void main(String[] args)
  {
    Person a = new Person("Anil",1);
    // Student b = new Student("Jimmy",2, "Information Technology");
    Instructor c = new Instructor("Mike", 3, 95000, 2020);
    System.out.println(a);
    // System.out.println(b);
    System.out.println(c);
  }
}