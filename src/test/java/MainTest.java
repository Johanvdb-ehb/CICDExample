import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testHtmlOutput() throws Exception {
        // Eerst de Main-applicatie uitvoeren zodat het bestand wordt gegenereerd
        Main.main(null);

        // Controleer of het HTML-bestand bestaat
        File file = new File("target/site/index.html");
        assertTrue("HTML file should be generated", file.exists());

        // Lees en controleer de inhoud
        String content = new String(Files.readAllBytes(Paths.get("target/site/index.html")));
        // assertTrue("Content should contain the expected message",
           //      content.contains("<h1>Hello, GitHub Actions with CI/CD and Pages!</h1>"));
    }
}