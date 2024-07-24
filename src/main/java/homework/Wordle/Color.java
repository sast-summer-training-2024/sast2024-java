package homework.Wordle;

public enum Color {
    GRAY, RED, YELLOW, GREEN;
    public static Color getColorByChar(char ch) {
        return switch (ch) {
            case 'R' -> RED;
            case 'Y' -> YELLOW;
            case 'G' -> GREEN;
            default -> GRAY;
        };
    }
}
