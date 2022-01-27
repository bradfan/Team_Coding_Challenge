import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {
    public String[][] fileFormatted;


    public static void main(String[] args) throws IOException {
        TeamFile file = new TeamFile();
        file.writeOutputOneFile();
        file.writeOutputTwoFile();

    }

}
