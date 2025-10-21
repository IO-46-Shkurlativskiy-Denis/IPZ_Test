package pack;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDecorator extends MessageDecorator{
    public TimeDecorator(Message message) {
        super(message);
    }

    @Override
    public String message() {
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return "["+time+"]"+super.message();
    }
}
