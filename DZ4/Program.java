package DZ4;

public class Program {
    public static void main(String[] args) throws Exception {
        DinamicArray<Integer> dinamicArray=new DinamicArray<Integer>();
        dinamicArray.add(3);
        dinamicArray.add(4);
        dinamicArray.add(2);
        dinamicArray.add(9);
        dinamicArray.add(4);
        dinamicArray.add(6);
        dinamicArray.printArray();
        dinamicArray.min();
        dinamicArray.max();
        dinamicArray.allRemove(4);
        dinamicArray.printArray();
    }
}
