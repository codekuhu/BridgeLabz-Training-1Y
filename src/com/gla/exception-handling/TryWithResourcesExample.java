import java.io.BufferedReader; // reads text
import java.io.FileReader;     // opens file
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        // try-with-resources (auto closes file)
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // read first line
            String line = br.readLine();

            System.out.println(line);

        } catch (IOException e) {
            // if file not found or error
            System.out.println("Error reading file.");
        }
    }
}