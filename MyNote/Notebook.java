package MyNote;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List <Record> notes;
    public Notebook(){
        notes=new ArrayList<Record>();
    }
    
    public void add(Record record) {
    }

        
    public List<Record> getNotes() {
        return notes;
    }
    

}
