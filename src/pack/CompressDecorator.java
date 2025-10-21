package pack;

public class CompressDecorator extends MessageDecorator{
    public CompressDecorator(Message message) {
        super(message);
    }

    @Override
    public String message() {
        String text = super.message();
        return text.trim().replaceAll("\\s+", " ");
    }
}
