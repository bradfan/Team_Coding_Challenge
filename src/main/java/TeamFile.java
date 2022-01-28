import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class TeamFile {

    public ArrayList<ArrayList<String>> firstProblem() throws IOException {
        double MAX_ROW_LENGTH = 2.0;
        AtomicInteger index = new AtomicInteger(0);
        List<String> lines = Files.readAllLines(Paths.get("input/one_to_seven.txt"));
        int numberOfArray = (int) Math.ceil(lines.size() / MAX_ROW_LENGTH);
        ArrayList<ArrayList<String>> reduce = lines.stream()
                .reduce(new ArrayList<>(), (s, s2) -> {
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
        return reduce;
    }

    public void generateTextFile(ArrayList<ArrayList<String>> solution) throws IOException {
        FileWriter myWriter1 = new FileWriter("solution.txt" );
        for (int i = 0; i < solution.size(); i++) {
            for (int j = 0; j < solution.get(i).size(); j++) {
                myWriter1.write(solution.get(i).get(j) + " ");
            }
            myWriter1.write("\n");
        }
        myWriter1.close();
    }

    public ArrayList<ArrayList<String>> secondProblem() throws IOException {
        double MAX_ROW_LENGTH = 3.0;
        AtomicInteger index = new AtomicInteger(0);
        List<String> lines = Files.readAllLines(Paths.get("input/one_to_twenty_five.txt"));
        int numberOfArray = (int) Math.ceil(lines.size() / MAX_ROW_LENGTH);
        ArrayList<ArrayList<String>> reduce = lines.stream()
                .reduce(new ArrayList<>(), (s, s2) -> {
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

    public void generateSecondTextFile(ArrayList<ArrayList<String>> solution) throws IOException {
        FileWriter myWriter1 = new FileWriter("solution2.txt" );
        for (int i = 0; i < solution.size(); i++) {
            for (int j = 0; j < solution.get(i).size(); j++) {
                myWriter1.write(solution.get(i).get(j) + " ");
            }
            myWriter1.write("\n");
        }
        myWriter1.close();
    }



}


