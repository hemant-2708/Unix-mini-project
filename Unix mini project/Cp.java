import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 import java.util.*;
public class Cp {
 
	public static void main(String[] args) {
 
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("\nEnter the name of File to be read with extension: ");
			String loc_4 = sc.nextLine();
			System.out.println("\nEnter the name of File in which contents are to be copied: ");
			String loc_5 = sc.nextLine();
			FileReader fr = new FileReader(loc_4);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(loc_5, true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("\nfile copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}