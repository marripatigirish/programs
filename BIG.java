package giri;

public static void main (string[]args)
{
	HashSet<Employee> set =new Hashset();
	set.add(new Employee (100,"Tom"));
	set.add(new Employee(101,"Jerrry"));
	set.add(new Employee(102,"Mickey Mouse"));
	set.add(new Employee(103,"Rat"));
	set.add (new Employee(104"cat"));
	System.out.println(set);
	Iterator i=set.iterator();
	while(i.hasNext())
		//converting object to Employee
		Employee e=(Employee)i.next();//java.lang.object
System.out.println(e.empNo)	+""+e.empName);
	

}
