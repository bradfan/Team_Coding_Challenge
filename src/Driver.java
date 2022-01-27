import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Driver {


    public TestOutputOne test = new TestOutputOne();

    public static void main(String[] args) throws IOException {
        TestOutputOne test = new TestOutputOne();

        firstProblem("C:\\Team_Coding_Challenge\\input\\one_to_seven.txt");
        secondProblem("C:\\Team_Coding_Challenge\\input\\one_to_twenty_five.txt");
        generateTextFile(firstProblem("C:\\Team_Coding_Challenge\\input\\one_to_seven.txt"));
        generateTextFile(secondProblem("C:\\Team_Coding_Challenge\\input\\one_to_twenty_five.txt"));


    }
    public static ArrayList<ArrayList<String>> firstProblem(String filePath) throws IOException {
        double MAX_ROW_LENGTH = 2.0;
        AtomicInteger index = new AtomicInteger(0);
        List<String> lines = Files.readAllLines(Path.of(filePath));
        int numberOfArray = (int) Math.ceil(lines.size() / MAX_ROW_LENGTH);
        ArrayList<ArrayList<String>> reduce = lines.stream().reduce(new ArrayList<>(), (s, s2) -> {
                    if (s.size() < index.get() % numberOfArray + 1) {
                        s.add(new ArrayList<>());
                    }
                    s.get((index.get() % numberOfArray)).add(lines.get(index.get()));
                    index.incrementAndGet();
                    return s;
                }, (s1, s2) -> {
                    s1.addAll(s2);
                    return s1;
                }
        );
        System.out.println(reduce);
        return reduce;
    }
    public static void generateTextFile(ArrayList<ArrayList<String>> solution) throws IOException {
        FileWriter myWriter1 = new FileWriter("solution.txt" );
        myWriter1.write(String.valueOf(solution));
        myWriter1.close();
    }

    public static ArrayList<ArrayList<String>> secondProblem(String filePath) throws IOException {
        double MAX_ROW_LENGTH = 3.0;
        AtomicInteger index = new AtomicInteger(0);
        List<String> lines = Files.readAllLines(Path.of(filePath));
        int numberOfArray = (int) Math.ceil(lines.size() / MAX_ROW_LENGTH);
        ArrayList<ArrayList<String>> reduce = lines.stream().reduce(new ArrayList<>(), (s, s2) -> {
                    if (s.size() < index.get() % numberOfArray + 9) {
                        s.add(new ArrayList<>());
                    }
                    s.get((index.get() % numberOfArray)).add(lines.get(index.get()));
                    index.incrementAndGet();
                    return s;
                }, (s1, s2) -> {
                    s1.addAll(s2);
                    return s1;
                }
        );
        System.out.println(reduce);
        return reduce;
    }

    }




