package No_OOP.homework.lesson_6;

public class AppendText {
    private String text;

    public AppendText() {
        this.text = "Hello";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String appendText(String text) {
        return getText().concat(text);
    }

}
