import java.util.*;

public class Main {
    public static void main(String[] args) {

        CustomArrayList arr = new CustomArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(5, 6);
        System.out.println(arr);
        arr.remove();
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.add(7);
        System.out.println(arr);
        arr.add(3, 30);
        arr.add(0, 30);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        arr.add(14);
        System.out.println(arr);
        System.out.println(arr.Size());
    }
}
