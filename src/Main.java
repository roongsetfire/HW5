
public class Main {
	public static void main(String[] args) {
		String myWord = "Hello World";
		System.out.println(greeting("Return Type"));
		sayHello("Not Return Type");
	}

	public static String greeting(String word) {
		return word;
	}

	public static void sayHello(String word) {
		System.out.println(word);
	}
}
