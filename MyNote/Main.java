package MyNote;

public class Main {
    public static void main(String[] args) {
            String note = "notes.txt";
            Model model = new Model(note);
            ConsoleView consoleView = new ConsoleView();
            Presenter presenter = new Presenter(model, consoleView);
            Console console = new Console(presenter);
            console.start();
    }
}
