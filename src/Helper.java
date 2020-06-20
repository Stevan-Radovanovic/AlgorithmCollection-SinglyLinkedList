
public class Helper {

	public static Node generateSinglyLinkedList(int[] array) {
		
		if(array==null) throw new RuntimeException("Array is null");
		
		Node help = null;
		
		for(int i=array.length-1;i>=0;i--) {
			help = new Node(array[i],help);
		}
		
		return help;
	}
	
}
