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
        first.add("One, Five");
        ArrayList<String> second = new ArrayList<>();
        second.add("Two, Six");
        ArrayList<String> third = new ArrayList<>();
        third.add("Three, Seven");
        ArrayList<String> fourth = new ArrayList<>();
        fourth.add("Four, ");
        ArrayList<ArrayList<String>> testArray = new ArrayList<>();
        testArray.add(first);
        testArray.add(second);
        testArray.add(third);
        testArray.add(fourth);
        assertEquals(testArray, file.firstProblem(), "Doesn't match.");
    }

    @org.junit.jupiter.api.Test
    void secondProblem() {
    }


}