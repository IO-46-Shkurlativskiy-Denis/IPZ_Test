package pack;

abstract class MessageDecorator implements Message{
    protected Message decoratedMessage;

    public MessageDecorator(Message message) {
        this.decoratedMessage = message;
    }

    @Override
    public String message() {
        return decoratedMessage.message();
    }
}
