package MyNote;

import java.util.List;
import java.util.Scanner;

public class Console {
    
    private Scanner scanner;
    View view = new ConsoleView();
    Presenter presenter;

    public Console(Presenter presenter) {
        this.presenter = presenter;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("1 - добавить запись");
            System.out.println("2 - вывести список записей");

            int command = scanner.nextInt();
            scanner.nextLine(); // очищаем буфер после считывания числа

            switch (command) {
                case 1:
                    System.out.print("Введите текст записи: ");
                    String text = scanner.nextLine();
                    presenter.addRecord(text);
                    break;
                case 2:
                    List<Record> records = presenter.getAll();
                    if (records.isEmpty()) {
                        System.out.println("Нет записей");
                    } else {
                        System.out.println("Список записей:");
                        for (Record record : records) {
                            System.out.println(record.getText());
                        }
                    }
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }

    public void showRecordAdded() {
        System.out.println("Запись добавлена");
    }
}
