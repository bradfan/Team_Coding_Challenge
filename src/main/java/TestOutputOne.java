import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestOutputOne {

    public TestOutputOne() {


    }


    public List<List<Object>> createFileReader(String filePath) throws IOException {

        // FileReader input = new FileReader((imagePath));
        InputStream is = getClass().getResourceAsStream(filePath);
        List<String> getInputOne = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<List<Object>> listOfList = new ArrayList<>();

        final int MAX_ROW_LENGTH = 2;
        int startIndex =0;
        while(startIndex <= getInputOne.size() )
        {
            int endIndex = ( ( startIndex+MAX_ROW_LENGTH ) <  getInputOne.size() ) ? startIndex+MAX_ROW_LENGTH : getInputOne.size();
            listOfList.add(new ArrayList<>(getInputOne.subList(startIndex, endIndex)));
            startIndex = startIndex+MAX_ROW_LENGTH;
        }
        return listOfList;
    }

    public void stringsToArray1() throws IOException {
        FileWriter myWriter1 = new FileWriter("test.txt");
    }
}
