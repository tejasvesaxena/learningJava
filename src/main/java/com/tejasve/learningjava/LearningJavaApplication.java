package com.tejasve.learningjava;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.tejasve.learningjava.models.student;

public class LearningJavaApplication {

	public static void main(String[] args) {
		
//		System.out.println("Hello World!");
		
//		ArrayList<student> students = readStudentFromFile("input.txt");
//		writeStudentFromFile("output.txt", students);

	}

	public static ArrayList<student> readStudentFromFile(String filename) {
		
		try {
			ArrayList<student> students = new ArrayList<student>();
			Scanner scnr = new Scanner(new FileInputStream(filename));
			
			while(scnr.hasNextLine()) {
				String s = scnr.nextLine();
//				System.out.println(s);
				
				students.add(new student().fromString(s));
				
			}
			scnr.close();
			return students;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void writeStudentFromFile(String filename, ArrayList<student> students) {
		try {

			PrintWriter writer = new PrintWriter(filename);

			for (student student : students) {
				writer.println(student.toString());
			}
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

}
