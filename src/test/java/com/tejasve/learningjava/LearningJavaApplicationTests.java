package com.tejasve.learningjava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import com.tejasve.learningjava.models.student;

public class LearningJavaApplicationTests {

	
	@Test
	public void testReadStudent() throws FileNotFoundException {
		ArrayList<student> students;
		students = LearningJavaApplication.readStudentFromFile("input.txt");
		assertEquals(2, students.size());
		
	}
	
	@Test
	public void testWriteStudent() throws IOException {
		ArrayList<student> students = new ArrayList<student>();
		students.add(new student("Vishal", 48));
		students.add(new student("Tejasve", 21));
		
		LearningJavaApplication.writeStudentFromFile("output.txt", students);
		
		checkFiles("input.txt", "output.txt");
	}
	
	private void checkFiles(String expFile, String actFile) {
		try (Scanner expScanner = new Scanner(new File(expFile));
			 Scanner actScanner = new Scanner(new File(actFile));) {
			
			while (expScanner.hasNextLine()) {
				assertEquals(expScanner.nextLine(), actScanner.nextLine());
			}
			
			expScanner.close();
			actScanner.close();
		} catch (IOException e) {
			fail("Error reading files.");
		}
	}

}
