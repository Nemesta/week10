import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentFileReader {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);
            int count = 0;
            System.out.printf("Name           "+ "GPA   "+ "Major" + "\n");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.printf(line + "\n");
                count++;
            }
            System.out.println("Total students: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}