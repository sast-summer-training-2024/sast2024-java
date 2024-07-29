package examples.oop;

public class EnumExample {
    public enum Color {
        RED, GREEN, YELLOW, BLACK, WHITE
    }
    public enum ColorWithAbbr {
        RED("R"), GREEN("G"), YELLOW("Y"), BLACK("B"), WHITE("W");

        private final String abbr;
        ColorWithAbbr(String abbr) {
            this.abbr = abbr;
        }
        public String getAbbr() {
            return abbr;
        }
    }
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color + " toString() = " + color.toString());
            System.out.println(color + " name() = " + color.name());
            System.out.println(color + " hashCode() = " + color.hashCode());
            System.out.println(color + " ordinal() = " + color.ordinal());
        }

        ColorWithAbbr[] colorsWithAbbr = ColorWithAbbr.values();
        for (ColorWithAbbr color : colorsWithAbbr) {
            System.out.println(color + " getAbbr() = " + color.getAbbr());
            System.out.println(color + " toString() = " + color);
            System.out.println(color + " name() = " + color.name());
            System.out.println(color + " hashCode() = " + color.hashCode());
            System.out.println(color + " ordinal() = " + color.ordinal());
        }
    }
}
