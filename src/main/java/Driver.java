import java.io.*;


public class Driver {


    public static void main(String[] args) throws IOException {
        TeamFile file = new TeamFile();
        file.firstProblem();
        file.generateTextFile(file.firstProblem());
        file.secondProblem();
        file.generateSecondTextFile(file.secondProblem());

    }

}



