package homework.Wordle;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;

import static org.junit.jupiter.api.Assertions.*;

class WordleTest {
    public static class Testcase {
        State input, output;

        public Testcase(State input, State output) {
            this.input = input;
            this.output = output;
        }

        public static Testcase fromJsonFile(String filePath) throws IOException {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append(System.lineSeparator());
            }

            JSONObject testcase_json = new JSONObject(sb.toString());
            JSONObject input_json = testcase_json.getJSONObject("input");
            JSONObject output_json = testcase_json.getJSONObject("output");

            return new Testcase(new State(input_json), new State(output_json));
        }
    }
    @Test
    void testWordle() {
        for (int i = 1; i <= 10; i++) {
            String jsonFilePath = "assets/testcases/Wordle/" + i + ".json";
            try {
                Testcase testcase = Testcase.fromJsonFile(jsonFilePath);
                State result = Wordle.guess(testcase.input);
                assertEquals(testcase.output, result, "Test case failed for input #" + i + ": " + testcase.input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
