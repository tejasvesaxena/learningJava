package com.tejasve.learningjava.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class studentTest {

	@Test
	public void testConstructorWithEmptyName() {
		assertThrows(IllegalArgumentException.class, () -> new student("", 10));
	}

	@Test

	public void testConstructorWithSpaceAsName() {
		assertThrows(IllegalArgumentException.class, () -> new student(" ", 10));
	}

	@Test
	public void testConstructorWithNullName() {
		assertThrows(IllegalArgumentException.class, () -> new student(null, 10));
	}

	@Test
	public void testConstructorWithNegativeAge() {
		assertThrows(IllegalArgumentException.class, () -> new student("vishal", -1));
	}

	@Test
	public void testConstructorWithZeroAge() {
		assertThrows(IllegalArgumentException.class, () -> new student("vishal", 0));
	}

	@Test
	public void testConstructorWithAgeMoreThanMax() {
		assertThrows(IllegalArgumentException.class, () -> new student("vishal", 101));
	}

	@Test
	public void studentNameAndAgeValid() {
		student s = new student("vishal", 40);

		assertEquals("vishal", s.Name);
		assertEquals(40, s.Age);
	}

	@Test
	public void studentAgeInvalid() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.setAge(-200));
		assertThrows(IllegalArgumentException.class, () -> s.setAge(101));
	}

	@Test
	public void studentNameValid2() {
		student s = new student(" vishal", 40);

		assertEquals("vishal", s.getName());
	}

	@Test
	public void studentNameValid3() {
		student s = new student("vishal ", 40);

		assertEquals("vishal", s.getName());
	}

	@Test
	public void studentNameValid4() {
		student s = new student(" vishal ", 40);

		assertEquals("vishal", s.getName());
	}

	@Test
	public void studentNameValid5() {
		student s = new student(" vishal saxena ", 40);

		assertEquals("vishal saxena", s.getName());
	}

	@Test
	public void studentNameInvalid() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.setName(""));
	}

	@Test
	public void studentNameInvalid2() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.setName(" "));

	}

	@Test
	public void studentNameInvalid3() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.setName(null));
	}

	@Test
	public void studentNameInvalid4() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.setName("123"));
	}

	@Test
	public void toStringTest() {
		student s = new student("vishal", 40);

		assertEquals("vishal;40", s.toString());
	}

	@Test
	public void fromStringTest() {
		student s = new student();

		try {
			assertEquals("Tejasve", s.fromString("Tejasve;30").getName());
			assertEquals(30, s.fromString("Tejasve;30").getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void fromStringTest2() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString(""));

	}

	@Test
	public void fromStringTest3() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString(" "));

	}

	@Test
	public void fromStringTest4() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString(" ; "));

	}

	@Test
	public void fromStringTest5() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString(" ;"));

	}

	@Test
	public void fromStringTest6() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString("; "));

	}

	@Test
	public void fromStringTest7() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString("23;33"));

	}

	@Test
	public void fromStringTest8() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString("Tejasve;21;Extra"));

	}

	@Test
	public void fromStringTest9() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString("Tejasve;twenty"));

	}

	@Test
	public void fromStringTest10() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString(" Tejasve ; 30 "));

	}

	@Test
	public void fromStringTest11() {
		student s = new student();

		assertThrows(IllegalArgumentException.class, () -> s.fromString("InvalidString"));

	}

}
