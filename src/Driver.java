import java.io.IOException;

public class Driver {
    public String[][] fileFormatted;




    public static void main(String[] args) throws IOException {
        TeamFile file = new TeamFile();
             file.writeOutputOneFile();


    }

    public void createFileReader(String imagePath) throws FileNotFoundException {

        FileReader input = new FileReader((imagePath));
    }
    public void stringsToArray1() throws IOException {
        FileWriter myWriter1 = new FileWriter("test.txt");
    }

}
