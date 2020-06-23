import java.lang.reflect.AnnotatedType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Helper {

	public static Node generateSinglyLinkedList(int[] array) {
		
		if(array==null) throw new RuntimeException("Array is null");
		
		Node help = null;
		
		for(int i=array.length-1;i>=0;i--) {
			help = new Node(array[i],help);
		}
		
		return help;
	}
	
	public static void test(String methodName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		MethodCollection mc = new MethodCollection();
		Method[] methods = mc.getClass().getMethods();
		
		for(int i=0;i<methods.length;i++) {
			if(methods[i].getName().toString().equals(methodName)) {
				Method currentMethod = methods[i];
				System.out.println("You are testing the following method: " + currentMethod.getName());
				
				Node list1 = Helper.generateSinglyLinkedList(new int[] {1});
				System.out.println("Test 1:");
				mc.showAllElements(list1);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list1));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list1));
				
				Node list2 = Helper.generateSinglyLinkedList(new int[] {1,2});
				System.out.println("Test 2:");
				mc.showAllElements(list2);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list2));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list2));
				
				Node list3 = Helper.generateSinglyLinkedList(new int[] {5,4,3,2,1});
				System.out.println("Test 3:");
				mc.showAllElements(list3);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list3));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list3));
				
				Node list4 = Helper.generateSinglyLinkedList(new int[] {1,2,2,2,3,3,3,4,4,4,5,5,5,6});
				System.out.println("Test 4:");
				mc.showAllElements(list4);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list4));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list4));
				
				Node list5 = Helper.generateSinglyLinkedList(new int[] {-7,-7,-7,-7,-7});
				System.out.println("Test 5:");
				mc.showAllElements(list5);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list5));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list5));
				
				Node list6 = Helper.generateSinglyLinkedList(new int[] {99,8,-11,-14,1});
				System.out.println("Test 6:");
				mc.showAllElements(list6);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list6));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list6));
				
				Node list7 = Helper.generateSinglyLinkedList(new int[] {1,2,3,4,5});
				System.out.println("Test 7:");
				mc.showAllElements(list7);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list7));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list7));
				
				Node list8 = Helper.generateSinglyLinkedList(new int[] {2,4,2,4,2,4,2,4,2,4});
				System.out.println("Test 8:");
				mc.showAllElements(list1);
				if(!currentMethod.getReturnType().toString().equals("class Node")) 
					System.out.println("Value returned: " + currentMethod.invoke(mc, list8));
				else 
					mc.showAllElements((Node)methods[i].invoke(mc,list8));
			}
		}
		
	}
	
}
