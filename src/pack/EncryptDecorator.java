package pack;

public class EncryptDecorator extends MessageDecorator{
    public EncryptDecorator(Message message){
        super(message);
    }

    @Override
    public String message() {
        String message = super.message();
        return encrypt(message);
    }

    private String encrypt(String text){
        StringBuilder encrypted = new StringBuilder();
        for(char c : text.toCharArray()){
            encrypted.append((char) (c+2));
        }
        return encrypted.toString();
    }
}
