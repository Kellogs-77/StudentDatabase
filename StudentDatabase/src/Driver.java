import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentNode root = new StudentNode("root", 0, null, null, null);
		
		Scanner data = new Scanner(System.in);  // Create a Scanner object
	    
		System.out.println("Enter the name of the file with the list of students: ");
		
	    String fileName = data.nextLine();
	    
	    Scanner file = new Scanner(fileName);
	    
	    StudentNodeOperations.insert(root, file);
	    
	    
	}

}
