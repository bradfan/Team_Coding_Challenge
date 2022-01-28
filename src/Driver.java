import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Driver {


    public static void main(String[] args) throws IOException {
        TeamFile file = new TeamFile();
        file.firstProblem();
        file.generateTextFile(TeamFile.firstProblem());
        file.secondProblem();
        file.generateSecondTextFile(TeamFile.secondProblem());

    }


    }



