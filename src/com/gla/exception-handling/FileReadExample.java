import java.io.BufferedReader; // used to read text
import java.io.FileReader;     // used to open file
import java.io.IOException;    // checked exception

public class FileReadExample {
    public static void main(String[] args) {

        try {
            // Trying to read file "data.txt"
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // close file

        } catch (IOException e) {
            // If file not found or error occurs
            System.out.println("File not found");
        }
    }
}