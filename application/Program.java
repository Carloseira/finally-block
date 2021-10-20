package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\fileTest\\Readme.txt");
		
		Scanner input = new Scanner(System.in);
		
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (input != null) {
				input.close();
			}
			System.out.println("finally executed");
		}

	}
}
