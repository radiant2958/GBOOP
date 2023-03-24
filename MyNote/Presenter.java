package MyNote;

import java.util.List;



public class Presenter {
    private Model model;
    private ConsoleView view = new ConsoleView();

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = (ConsoleView) view;
    }

    public void addRecord(String text){
        model.getRecords().add(new Record(text));
        model.save();
        view.showRecordAdded();
    }
    
    public List<Record> getAll(){
        return model.getAll();
    }
    public void save(){
        model.save();
    }
    public void load() {
        model.load();
        
    }

}
