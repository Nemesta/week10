import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
public class FileLogger {
    public static void writeLog(String filename, String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(filename, true)); // append mode
            writer.println(new Date() + " - " + message);
            throw new RuntimeException("Simulated write error");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());

        } finally {
                writer.close();
            System.out.println("Logger closed.");
        }
    }
    public static void main() {
        try {
            writeLog("log.txt", "This is a test log message");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// Finally is needed because it always runs as we should close the writer it would be perfect use for it