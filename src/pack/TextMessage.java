package pack;

public class TextMessage implements Message{
    private String text;
    public TextMessage(String text) {
        this.text = text;
    }

    @Override
    public String message() {
        return text;
    }
}
