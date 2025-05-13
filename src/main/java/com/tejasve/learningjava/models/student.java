/**
 * 
 */
package com.tejasve.learningjava.models;

/**
 * 
 */
public class student {
	String Name;
	int Age;

	public student() {
	}

	public student(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {

		String trimmed = Name.trim();

		return trimmed;
	}

	public void setName(String name) {

		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}

		if (name.isEmpty() || " ".equals(name)) {
			throw new IllegalArgumentException("Name cannot be empty or just space");
		}

		if (name.matches("\\d+")) {
			throw new IllegalArgumentException("Name cannot be numeric");
		}

		this.Name = name;

	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {

		if (age < 1 || age > 100) {
			throw new IllegalArgumentException("Age must be between 1 and 100");
		}

		this.Age = age;
	}

	@Override
	public String toString() {
		return Name + ";" + Age;
	}

	public student fromString(String s) {

		String[] data = s.split(";");

		if (data.length != 2) {
			throw new IllegalArgumentException("Input string must have 2 parts");
		}

		String name = data[0];
		int age = Integer.parseInt(data[1]);

		setName(name);
		setAge(age);

		return this;
	}
}
