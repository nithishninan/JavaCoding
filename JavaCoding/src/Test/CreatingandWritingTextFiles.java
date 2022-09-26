
package Test;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingandWritingTextFiles {

	public static void main(String[] args) {
		File filename = new File("test1.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			bw.write("Line one"); 
			bw.newLine();
			bw.write("Line two");
			bw.newLine();
			bw.write("Line three");
		}catch (IOException e) {
			System.out.println("Unable to write file");
		}}}