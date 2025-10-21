package pack;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Демонстрація         роботи коду. КР1    ІПЗ");

        System.out.println("Початкове повідомлення");
        System.out.println("Результат: \"" + message.message() + "\"");

        message = new CompressDecorator(message);
            System.out.println("Застосовано стиснення (видалення зайвих пробілів)");
            System.out.println("Результат: \"" + message.message() + "\"");

        message = new EncryptDecorator(message);
            System.out.println("Застосовано шифрування");
            System.out.println("Результат: \"" + message.message() + "\"");

            System.out.println("З декоратором часу виникли труднощі");

        message = new NameDecorator(message, "ІО-46 Шкурлатівський Денис Сергійович");
            System.out.println("Додано ПІБ автора");
            System.out.println("Результат: \"" + message.message() + "\"");
    }
}