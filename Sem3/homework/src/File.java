import java.io.FileWriter;
import java.io.IOException;

public class File {

    public static void createNewFile(Name name) {

        try (FileWriter fw = new FileWriter(name.getLastName() + ".txt", true)) {
            String toWrite = name.toFile() + "\n";
            fw.write(toWrite);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
