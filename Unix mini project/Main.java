import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
import java.util.*;

public class Main{
	
	static void ls(){
		Scanner sc = new Scanner(System.in);
    	// creates a file object
    	System.out.println("\nEnter the path to Directory : \n");
    	String loc_1 = sc.nextLine();
    	File file = new File(loc_1);

    	// returns an array of all files
    	String[] fileList = file.list();

    	for(String str : fileList) {
      		System.out.println(str);
    	}
	}
	
	static void cp(){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("\nEnter the name of File to be read with extension: \n");
			String loc_4 = sc.nextLine();
			System.out.println("\nEnter the name of File in which contents are to be copied: \n");
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
                        System.out.println("file copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void mv(){
		Scanner sc = new Scanner(System.in); 

		System.out.println("\nEnter the path of File to be Read: \n");
    	String loc_2 = sc.nextLine();
    	System.out.println("\nEnter the path to File in which contents are to be copied: \n");
    	String loc_3 = sc.nextLine();
		
		try{

			Path temp = Files.move(Paths.get(loc_2), Paths.get(loc_3));
		} catch (IOException e) {
			System.out.println("Please enter Valid Input!");
		}
		
		if(temp != null) 
		{ 
			System.out.println("File renamed and moved successfully"); 
		} 
		else
		{ 
			System.out.println("Failed to move the file"); 
		} 
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("\n1.ls\n2.cp\n3.mv\n4.Exit\n");
		int ch = 0;
		while (ch != 4){
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			if (ch == 1){
				ls();
			}
			else if (ch == 2){
				cp();
			}
			else if (ch == 3){
				mv();
			}
			else if (ch == 4){
				System.exit(0);
			}
			else{
				System.out.println("Invalid Input!");
			}
		}
	}
}