
public class Test {

 	public static void main(String[] args) {
 		
		//Generate a class
		MethodCollection mc = new MethodCollection();		
		//Creating a list
		Node first = Helper.generateSinglyLinkedList(new int[] {11,12});
		//Testing
		mc.showAllElements(first);
		mc.showAllElements(mc.removeNextAndPreviousNodeFromMax(first));
	}
}
