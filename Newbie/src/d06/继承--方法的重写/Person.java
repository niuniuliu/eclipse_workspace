package studenttest;

public class Person{

	private String name;

	public Person(String name) 
	{
	    this.name=name;
	}

	public boolean equals(Object o)
	{
	    if (this==o) return true;
		if (!(o instanceof Person)) 
			return false;
		final Person other=(Person)o;
		if (this.name.equals(other.name))
			return true;
		else
			return false;
	}
}
