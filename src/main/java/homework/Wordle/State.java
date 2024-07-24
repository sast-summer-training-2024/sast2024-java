package homework.Wordle;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.Objects;

import static homework.Wordle.Wordle.*;

public class State {
    Color[] wordState;                 // The guess state of word
    Color[] alphabetState;             // The guess state of the alphabet
    int chancesLeft;                    // The chances left
    String answer, word;                // The final answer, and the current guess word
    GameStatus status;                  // The current game status

    public State(String answer) {
        wordState = new Color[WORD_LENGTH];
        Arrays.fill(wordState, Color.GRAY);
        alphabetState = new Color[ALPHABET_SIZE];
        Arrays.fill(alphabetState, Color.GRAY);
        chancesLeft = TOTAL_CHANCES;
        this.answer = answer;
        word = "";
        status = GameStatus.RUNNING;
    }
    public State(JSONObject json) {
        this.wordState = new Color[WORD_LENGTH];
        String word_state_string = json.getString("word_state");
        for (int i = 0; i < WORD_LENGTH; i++) {
            this.wordState[i] = Color.getColorByChar(word_state_string.charAt(i));
        }
        this.alphabetState = new Color[ALPHABET_SIZE];
        String alphabet_state_string = json.getString("alphabet_state");
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            this.alphabetState[i] = Color.getColorByChar(alphabet_state_string.charAt(i));
        }
        this.chancesLeft = json.getInt("chance_left");
        this.answer = json.getString("answer").toUpperCase();
        this.word = json.getString("word").toUpperCase();
        this.status = GameStatus.valueOf(json.getString("status"));
    }
    @Override
    public String toString() {
        return Arrays.toString(wordState) + "$" + Arrays.toString(alphabetState) + "$"
                + chancesLeft + "$" + answer + "$" + word + "$" + status;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this.toString(), o.toString());
    }
    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(wordState),
                Arrays.hashCode(alphabetState), chancesLeft, answer, word, status);
    }
    // Use colorful display
    public static void printColored(char text, Color color) {
        switch (color) {
            case GRAY -> System.out.print("\033[37m" + text + "\033[0m");
            case RED -> System.out.print("\033[31m" + text + "\033[0m");
            case YELLOW -> System.out.print("\033[33m" + text + "\033[0m");
            case GREEN -> System.out.print("\033[32m" + text + "\033[0m");
        }
    }
    // Output the current game state
    public void show() {
        for (int i = 0; i < WORD_LENGTH; i++) {
            printColored(word.charAt(i), wordState[i]);
        }
        System.out.print(" ");
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            printColored((char)('A' + i), alphabetState[i]);
        }
        System.out.println();
    }
}
