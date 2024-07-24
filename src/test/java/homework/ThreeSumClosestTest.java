package homework;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {
    public static class Input {
        int[] nums;
        int target;
        public Input(int[] nums, int target) {
            this.nums = nums;
            this.target = target;
        }

        @Override
        public String toString() {
            return Arrays.toString(nums) + " " + target;
        }
    }
    public static class Testcase {
        Input input;
        int output;

        public Testcase(Input input, int output) {
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

            JSONArray nums_json = input_json.getJSONArray("nums");
            int length = nums_json.length();
            int[] intArray = new int[length];
            for (int i = 0; i < length; i++) {
                intArray[i] = nums_json.getInt(i);
            }

            return new Testcase(new Input(intArray, input_json.getInt("target")), output_json.getInt("answer"));
        }
    }

    @Test
    void testThreeSumClosest() {
        for (int i = 1; i <= 10; i++) {
            String jsonFilePath = "assets/testcases/ThreeSumClosest/" + i + ".json";
            try {
                Testcase testcase = Testcase.fromJsonFile(jsonFilePath);
                int result = ThreeSumClosest.threeSumClosest(testcase.input.nums, testcase.input.target);
                assertEquals(testcase.output, result, "Test case failed for input #" + i + ": " + testcase.input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
