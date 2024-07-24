package homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    public static class Testcase {
        String input;
        int output;

        public Testcase(String input, int output) {
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

            return new Testcase(input_json.getString("s"), output_json.getInt("answer"));
        }
    }

    @Test
    void testLengthOfLongestSubstring() {
        for (int i = 1; i <= 10; i++) {
            String jsonFilePath = "assets/testcases/LongestSubstringWithoutRepeatingCharacters/" + i + ".json";
            try {
                Testcase testcase = Testcase.fromJsonFile(jsonFilePath);
                int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testcase.input);
                assertEquals(testcase.output, result, "Test case failed for input #" + i + ": " + testcase.input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
