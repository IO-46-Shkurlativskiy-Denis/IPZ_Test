package pack;

public class NameDecorator extends MessageDecorator{
    private final  String name;

    public NameDecorator(Message message, String name) {
        super(message);
        this.name = name;
    }

    @Override
    public String message() {
        return super.message()+"["+name+"]";
    }
}
