package demo;

public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Hello!");
		} catch (ClassNotFoundException e) {
			System.out.println("Bye Baby!");
			e.printStackTrace();
		}

	}

}
