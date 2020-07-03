import java.io.File;
import java.util.*;

class Ls {
  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    // creates a file object
    System.out.println("\nEnter the path to Directory : ");
    String loc_1 = sc.nextLine();
    File file = new File(loc_1);

    // returns an array of all files
    String[] fileList = file.list();
    System.out.println("\n");

    for(String str : fileList) {
    	System.out.println(str);
    }
  }
}