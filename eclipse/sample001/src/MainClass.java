
public class MainClass {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		boolean b = false;
		b = true;
		boolean toBe = true;
		b = toBe || !toBe;
		if (b) {
			System.out.println(toBe);
		}
		
		int children = 0;
		b = children;
		if (children) {
			System.out.println("AAA")
		}
	}

}
