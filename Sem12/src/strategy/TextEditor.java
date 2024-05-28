package strategy;

interface TextFormatter {
    String format(String text);
}

class UpperCaseFormatter implements TextFormatter {
    public String format(String text) {
        return text.toUpperCase();
    }
}
class LowerCaseFormatter implements TextFormatter {
    public String format(String text) {
        return text.toLowerCase();
    }
}
class CamelCaseFormatter implements TextFormatter {
    public String format(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase()).append(" ");
        }
        return result.toString();
    }
}

public class TextEditor {
    private TextFormatter formatter;
    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String formatText(String text) {
        return formatter.format(text);
    }
}

class StrategyPatternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new UpperCaseFormatter());

        String text = "Hello World!";
        System.out.println("Original Text: " + text);
        System.out.println("Uppercase: " + editor.formatText(text));

        editor.setFormatter(new LowerCaseFormatter());
        System.out.println("Lowercase: " + editor.formatText(text));

        editor.setFormatter(new CamelCaseFormatter());
        System.out.println("Camel case: " + editor.formatText(text));
    }
}