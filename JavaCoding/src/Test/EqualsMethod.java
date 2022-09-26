package Test;
class Temp {
	private int id;
	private String name;
public Temp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Temp [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Temp other = (Temp) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
}

public class EqualsMethod {

	public static void main(String[] args) {
		//for hashcode:- 106d69c is the unique id or hashcode
		System.out.println(new Object());
		//for equals method:-
		Temp temp1 = new Temp(3,"Bob");
		Temp temp2 = new Temp(3,"Bob");
		System.out.println(temp1.equals(temp2));
		Double value1=8.2;
		Double value2=8.2;
		System.out.println(value1.equals(value2));
		int num1=7;
		int num2=7;
		System.out.println(num1==num2);
		String text1 ="Happy";
		String text2 ="Happy";
		System.out.println(text1==text2);
		String text3 ="Happyfor".substring(0, 5);
		System.out.println(text3);
		System.out.println(text1.equals(text3));
	}
}


