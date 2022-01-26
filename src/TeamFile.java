import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TeamFile {

    public void writeOutputOneFile() throws IOException {
        var getInputOne = Files.lines(Paths.get("input/one_to_seven.txt")).collect(Collectors.toList());
        System.out.println(getInputOne);
        int halfwayIndex = (getInputOne.size() / 2);
        int lastIndex = getInputOne.size() - 1;
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        for (int i = 0; i < halfwayIndex; i++) {
            a.add(getInputOne.get(i));
        }
        for (int i = halfwayIndex; i <= lastIndex; i++) {
            b.add(getInputOne.get(i));
        }
        System.out.println("A: " + a);
        System.out.println(a.get(1));
        System.out.println("B: " + b);
        List<String> together = new ArrayList<>();
        for(int i = 0; i <= a.size() - 1; i++) {
            together.add(a.get(i) + " " + b.get(i));
        }
        System.out.println(together);
    }

}


//    public void writeOutputOneFile() throws IOException {
////        var getInputOne = Files.lines(Paths.get("input_1.txt")).collect(Collectors.toList());
////        System.out.println(getInputOne);
////        int halfwayIndex = (getInputOne.size() / 2);
////        List<String> a = new ArrayList<>();
////        List<String> b = new ArrayList<>();
////       for(int i = 0; i <= halfwayIndex; i++) {
////           a.add(getInputOne.get(i));
////       }
////       for(int i = halfwayIndex + 1; i <= getInputOne.size()-1; i++) {
////           b.add(getInputOne.get(i));
////       }
////        System.out.println("A: " + a);
////        System.out.println("B: " + b);
////
//////        var oneData = getInputOne.stream().map(i -> i.concat()).collect(Collectors.toList());
//////       var outputOne = Files.write(Paths.get("output_one.txt"), oneData, StandardCharsets.UTF_8,
//////              StandardOpenOption.APPEND);