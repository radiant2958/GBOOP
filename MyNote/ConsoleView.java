package MyNote;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View{
    
    // private Presenter presenter=new Presenter(null, null);
    // private Scanner scanner;
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }


    // public void start() {
    //     while (true) {
    //         System.out.println("Выберите команду:");
    //         System.out.println("1 - добавить запись");
    //         System.out.println("2 - вывести список записей");

    //         int command = scanner.nextInt();
    //         scanner.nextLine(); // очищаем буфер после считывания числа

    //         switch (command) {
    //             case 1:
    //                 System.out.print("Введите текст записи: ");
    //                 String text = scanner.nextLine();
    //                 presenter.addRecord(text);
    //                 break;
    //             case 2:
    //                 List<Record> records = presenter.getAll();
    //                 if (records.isEmpty()) {
    //                     System.out.println("Нет записей");
    //                 } else {
    //                     System.out.println("Список записей:");
    //                     for (Record record : records) {
    //                         System.out.println(record.getText());
    //                     }
    //                 }
    //                 break;
    //             default:
    //                 System.out.println("Неверная команда");
    //         }
    //     }
    // }

    // public void showRecordAdded() {
    //     System.out.println("Запись добавлена");
    // }
    public void showRecordAdded() {
            System.out.println("Запись добавлена");}
    @Override
    public String getText() {
        System.out.printf("text: ");
        return in.nextLine();
    }

    @Override
    public void setText(String volue) {
        System.out.printf("text: %s\n", volue);

    }
}