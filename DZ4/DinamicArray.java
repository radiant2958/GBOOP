package DZ4;


import java.util.Arrays;
import java.util.Comparator;


public class DinamicArray<T> {
    private T[] array;
    private int size;
    private int capa;
    
    
    
    DinamicArray(){
        size=0;
        capa=1;
        array=(T[]) new Object[capa];

    }
    DinamicArray(T[] list){
        this.array=Arrays.copyOf(list, size);
        this.size=list.length;
        
    }
    public void add(T volue) {
        if (size==capa) {
            resize(2*capa);
            
        }
        array[size++]=volue;
        
    }

    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capa = newCapacity;
    }


    public int getSize() {
        return size;
    }
    // Длинна массива
    public int lengthArray() {
        return size;
    }
    // Получение элемента массива по индексу
    public T get(int index) throws Exception{
        if (index<0||index>size){
            throw new Exception("Индекс выходит за границы массива");
        }
        return array[index];
    }
    // Задание значения элементу массива с заданным индексом
    public void set(int index, T volue) throws Exception{
        if (index<0||index>size){
            throw new Exception("Индекс выходит за границы массива");
        }
        array[index]=volue;
    }
    
    
   
    //Вставка в массив;
    public void inset(int index, T value) throws Exception { 
        if (index<0||index>size){
            throw new Exception("Индекс выходит за границы массива");
        }
        T[] newArray = (T[]) new Object[size+1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index]=value;
        System.arraycopy(array, index, newArray, index+1, size+1);
        array=newArray;
        
    }
    //Удаление элемента по индексу

    public void remove(int index) throws Exception {
        if (index<0||index>size){
            throw new Exception("Индекс выходит за границы массива");
        }
        T[] newArray = (T[]) new Object[size-1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index+1, newArray, index, newArray.length);
        array=newArray;
        
    }
    //Удаление всех элементов с заданным значением;
    public void allRemove(T value) {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if(!array[i].equals(value)){
                array[newSize]=array[i];
                newSize++;
            }
            
        }
        
    }

    // Поиск минимума;
 
    public T min() {
        Arrays.sort(array);
        return array[0];
    }
    // Поиск максимума
    public T max() {
        Arrays.sort(array);
        return array[-1];
    }
    // Поиск суммы элементов массива
   
    public double sumElement() {
        if (size==0) {
            return 0;
            
        }
        double sum=0;
        for (T t : array) {
            if (t instanceof Number) {
                sum+=(Double)t;
                
            }
        }
        return sum;
    }
    // Поиск произведения элементов массива
    public double productElement() {
        if (size==0) {
            return 0;
            
        }
        double product=1.0;
        for (T t : array) {
            if (t instanceof Number) {
                product=(Double)t*product;
                
            }
        }
        return product;
    }
    // Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public int searchIndex(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                index=i;
                
            }
            
        }
        return index;
    }
    // Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
    public boolean checkElement(T value) {
        for (int i =0; i<size; i++) {
            if (array[i].equals(value)) {
                return true;
                
            }
          
        }
        return false;
        
    }
    // Пузырьковая сортировка
    /**
     * 
     */
    public void bubbleSort(Comparator<T> comparator) {
        boolean swapped = true;
        int j = 0;
        T tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < size - j; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
   
    // Сортировка простыми вставками
    public void insertionSort(Comparator<T> comparator) {
        for (int i = 1; i < size; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    // Сортировка простым выбором
    public void selectionSort(Comparator<T> comparator) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (comparator.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }
    // Печать массива на экран
    public void printArray() throws Exception{
        if (size<=0) {
            throw new Exception("Массив пустой");
            
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
            
        }
      

    }
    
    


 
   

    
}

