package myArrays;

public class Main {
    public static void main(String[] args) {

        MyArray arr = new MyArray(5);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(453);

        System.out.println(arr.indexOf(20));

    }
}
