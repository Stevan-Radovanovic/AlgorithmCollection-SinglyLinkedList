import java.lang.reflect.InvocationTargetException;

public class Test {

 	public static void main(String[] args) {
 		
		try {
			Helper.test("returnProductOfAllElements");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
