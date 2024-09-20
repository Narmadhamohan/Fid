import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            // Open the file in read/write mode ("rw")
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Move the file pointer to the beginning of the file
            file.seek(0);
            file.writeBytes("Hello, World!\n");

            // Move to a specific position in the file (e.g., position 7)
            file.seek(7);
            file.writeBytes("Random");

            // Move back to the start and read the content
            file.seek(0);
            String line = file.readLine();
            System.out.println("File Content: " + line);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
