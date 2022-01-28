import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamFileTest {

    TeamFile file = new TeamFile();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void firstProblem() throws IOException {
        ArrayList<String> first = new ArrayList<>();
        first.add("One");
        first.add("Five");
        ArrayList<String> second = new ArrayList<>();
        second.add("Two");
        second.add("Six");
        ArrayList<String> third = new ArrayList<>();
        third.add("Three");
        third.add("Seven");
        ArrayList<String> fourth = new ArrayList<>();
        fourth.add("Four");
        fourth.add("");
        ArrayList<ArrayList<String>> testArray = new ArrayList<>();
        testArray.add(first);
        testArray.add(second);
        testArray.add(third);
        testArray.add(fourth);
        assertEquals(testArray, file.firstProblem(),"Doesn't match.");
    }

    @org.junit.jupiter.api.Test
    void secondProblem() throws IOException {
        ArrayList<String> first = new ArrayList<>();
        first.add("One");
        first.add("Ten");
        first.add("Nineteen");
        ArrayList<String> second = new ArrayList<>();
        second.add("Two");
        second.add("Eleven");
        second.add("Twenty");
        ArrayList<String> third = new ArrayList<>();
        third.add("Three");
        third.add("Twelve");
        third.add("Twenty One");
        ArrayList<String> fourth = new ArrayList<>();
        fourth.add("Four");
        fourth.add("Thirteen");
        fourth.add("Twenty Two");
        ArrayList<String> fifth = new ArrayList<>();
        fifth.add("Five");
        fifth.add("Fourteen");
        fifth.add("Twenty Three");
        ArrayList<String> sixth = new ArrayList<>();
        sixth.add("Six");
        sixth.add("Fifteen");
        sixth.add("Twenty Four");
        ArrayList<String> seventh = new ArrayList<>();
        seventh.add("Seven");
        seventh.add("Sixteen");
        seventh.add("Twenty Five");
        ArrayList<String> eighth = new ArrayList<>();
        eighth.add("Eight");
        eighth.add("Seventeen");
        ArrayList<String> ninth = new ArrayList<>();
        ninth.add("Nine");
        ninth.add("Eighteen");
        ArrayList<ArrayList<String>> testArray = new ArrayList<>();
        testArray.add(first);
        testArray.add(second);
        testArray.add(third);
        testArray.add(fourth);
        testArray.add(fifth);
        testArray.add(sixth);
        testArray.add(seventh);
        testArray.add(eighth);
        testArray.add(ninth);
        assertEquals(testArray, file.secondProblem(),"Doesn't match.");

    }


}