package MyNote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Model {
    ArrayList<Record> records;
    String note;

    public Model(String note) {
        this.note = note;
        records= new ArrayList<Record>();
        load();
    }
    
    public void addRecord(String text) {
        records.add(new Record(text));
        save();
    }


    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(note))) {
            for (Record r : records) {
                writer.write(r.getText()+"\n");
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving notes to file: " + e.getMessage());
        }
        
    }
    public void load(){
       
            try (BufferedReader reader = new BufferedReader(new FileReader(note))) {
                String record;
                while ((record = reader.readLine()) != null) {
                    records.add(new Record(record));
                }
            } catch (IOException e) {
                System.err.println("Error loading notes from file: " + e.getMessage());
            }
        }
    
    public String getNote() {
        return note;
    }
    public ArrayList<Record> getRecords() {
        return records;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public List<Record> getAll(){
        return records;
    }
}
