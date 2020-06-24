import java.lang.reflect.AnnotatedType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Random;

public class Helper {

	
	/**
	 * 
	 * @param array
	 * Array of numbers, used to initialize a singly linked list
	 * @return first
	 * First element of a singly linked list
	 */
	public static Node generateSinglyLinkedList(int[] array) {
		
		if(array==null) throw new RuntimeException("Array is null");
		
		Node help = null;
		
		for(int i=array.length-1;i>=0;i--) {
			help = new Node(array[i],help);
		}
		
		return help;
	}
	
	/**
	 * Note: Currently not working with methods that take multiple parameters!
	 * @param methodName
	 * The name of the method that is supposed to be invoked
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static void test(String methodName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		MethodCollection mc = new MethodCollection();
		Method[] methods = mc.getClass().getMethods();
		
		ArrayList<Node> testLists = new ArrayList<Node>();
		Helper.generateTestLists(testLists);

		for(int i=0;i<methods.length;i++) {
			if(methods[i].getName().toString().equals(methodName)) {
				Method currentMethod = methods[i];
				Parameter[] params = currentMethod.getParameters();	
				
				System.out.println("You are testing the following method: " + currentMethod.getName());
				
				for(int j=0;j<testLists.size();j++) {
					testInstance(mc, currentMethod, j+1, testLists.get(j), params.length);
				}
				
				return;
			}
		}
	}
	
	private static void generateTestLists(ArrayList<Node> testLists) {
		testLists.add(Helper.generateSinglyLinkedList(new int[] {}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {1,2}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {5,4,3,2,1}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {1,2,2,2,3,3,3,4,4,4,5,5,5,6}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {-7,-7,-7,-7,-7}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {99,8,-11,-14,1}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {1,2,3,4,5}));
		testLists.add(Helper.generateSinglyLinkedList(new int[] {2,4,-2,4,2,4,2,4,2,4}));	
	}

	private static void testInstance (MethodCollection mc, Method currentMethod, int testNumber, Node list, int parameterLength) {
		
		try {
			System.out.println("Test :" + testNumber);
			mc.showAllElements(list);
			if(!currentMethod.getReturnType().toString().equals("class Node")) 
				System.out.println("Value returned: " + currentMethod.invoke(mc, list));
			else 
				
				mc.showAllElements((Node)currentMethod.invoke(mc,list));
		} catch (Exception e) {
			System.out.println("Exception survived, moving on...");
		}
		
	}
	
}
