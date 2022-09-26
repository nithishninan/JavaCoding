package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {
	public static void main(String[] args) throws FileNotFoundException{
		//String filename = "C:\\Users\\NINAN VARGHESE\\Desktop\\test.txt";
		String filename = "test.txt";
		File textfile = new File(filename);
			Scanner in = new Scanner(textfile);
			while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
			}
			in.close();
	}
}
