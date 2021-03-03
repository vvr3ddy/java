import java.util.*;
import java.util.stream.Collectors;
class Person {
	private String name;
	private int age;

	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class StreamImplementation {
	public int summationOfAge(List<Person> list) {
		Integer sumOfAge = list.stream().map(Person::getAge).filter(age -> age > 50).reduce(0, Integer::sum);
		return sumOfAge;
	}

	public List<String> getPersonName(List<Person> list) {
		List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());

		return names;
	}

	public List<Integer> getPersonAge(List<Person> list) {
		List<Integer> ages = list.stream().map(Person::getAge).collect(Collectors.toList());

		return ages;
	}

}
