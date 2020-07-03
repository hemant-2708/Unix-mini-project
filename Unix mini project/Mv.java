// Java program to illustrate renaming and 
// moving a file permanently to a new loaction 
import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
import java.util.*;

public class Mv
{ 
	public static void main(String[] args) throws IOException 
	{ 
		Scanner sc= new Scanner(System.in); 

		System.out.println("\nEnter the path of File to be Read: ");
    	String loc_2 = sc.nextLine();
    	System.out.println("\nEnter the path to File in which contents are to be copied: ");
    	String loc_3 = sc.nextLine();
		Path temp = Files.move 
		(Paths.get(loc_2), 
		Paths.get(loc_3)); 

		if(temp != null) 
		{ 
			System.out.println("\nFile renamed and moved successfully"); 
		} 
		else
		{ 
			System.out.println("\nFailed to move the file"); 
		} 
	} 
} 
