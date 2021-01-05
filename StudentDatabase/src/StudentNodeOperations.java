import java.util.Scanner;

public class StudentNodeOperations {
	public static void insert(StudentNode root, Scanner sc) {
		if(root.left == null && root.right == null) {
			String temp =  sc.nextLine();
			root = new StudentNode(temp.substring(0, returnStringIndex(temp, ',')), Double.parseDouble(temp.substring(returnStringIndex(temp, ',')+2)), null, null, null);
			System.out.println(root.name + " " + root.gpa);
		}
	}
	
	public static StudentNode search(StudentNode target) {
		return null;
	}
	
	public StudentNode delete(StudentNode target) {
		return null;
	}
	
	private static int returnStringIndex(String string, char character) {
		int index = -1;
		char c;
		for(int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if(c == character) {
				index = i;
				break;
			}
		}
		return index;
	}
	
}
