package week05Project;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");

	}

	@Override
	public void error(String str) {
		String err = "***" + "Error: " + str + "***";
		String ast = "";
		for(int i=0; i<err.length(); i++) ast += "*";
		System.out.println(ast + "\n" + err + "\n" + ast);

	}

}
