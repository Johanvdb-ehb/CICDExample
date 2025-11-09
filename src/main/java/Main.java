import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		System.out.println("Hello, GitHub Actions with CI/CD and Pages!");

		String message = "Hello, GitHub Actions with CI/CD and Pages!";
		System.out.println(message);

		File dir = new File("target/site");
		if (!dir.exists()) {
			// create directories target/ and target/site if they don't exist
			dir.mkdirs();
		}

		try (FileWriter writer = new FileWriter("target/site/index.html")) {
			writer.write("<html><body><h1>" + message + "</h1></body></html>");
		} catch (IOException e) {
			System.err.println("Error writing HTML file: " + e.getMessage());
		}
	}
}
