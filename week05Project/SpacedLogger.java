package week05Project;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		System.out.println(str.replace("", " ").trim());		
	}

	@Override
	public void error(String str) {
		System.out.println("Error: " + str.replace("", " ").trim());
	}
}
