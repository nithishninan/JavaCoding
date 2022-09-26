package Test;

public class RuntimeExceptions {

	public static void main(String[] args) {
		String text = null;
		//String[] names = {"anu","sanu","tony"};
		try {
			System.out.println(text.length());
		} catch (Exception e) {
			System.out.println("Please check for " +e.toString());
		}
		/*try {
			System.out.println(names[3]);
		} catch (Exception e) {
			System.out.println("Please check for " +e.toString());
		}*/
	}

}
