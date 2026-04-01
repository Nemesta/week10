import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class StudentFileWriter {
    public static void main(String[] args) {
        File file = new File("students.txt");
        if (file.exists()) {
            System.out.println("Warning");
        }
        try (FileWriter w = new FileWriter(file)) {
            w.write("Nik Jam        3.85 CP\n");
            w.write("Declan Rice    3.50 First Principles\n");
            w.write("Piero Hincapie 3.90 ACS\n");
            w.write("David Raya     2.80 Calculus\n");
            w.write("Kai Havertz    3.70 CP2\n");
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}