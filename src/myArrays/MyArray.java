package myArrays;

public class MyArray {
    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize){
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public int indexOf(int value){
        for(int i=0; i< this.currentIndex; i++){
           if(this.items[i] == value) return i;
        }
        return -1;
    }

    public void  insert(int value){
        this.items[currentIndex] = value;
        currentIndex++;
    }
}
