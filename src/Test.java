
public class Test {

 	public static void main(String[] args) {
 		
		//Generate a class
		MethodCollection mc = new MethodCollection();		
		//Creating a list
		Node first = Helper.generateSinglyLinkedList(new int[] {1,1,1,1,1});
		//Testing
		mc.showAllElements(first);
		System.out.println(mc.returnMaxEvenElement(first));
	}
}
