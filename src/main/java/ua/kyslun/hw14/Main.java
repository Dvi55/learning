package ua.kyslun.hw14;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>(3);
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        System.out.println(mySet.contains(1));
        System.out.println(mySet.contains(5));
        System.out.println(mySet);
        System.out.println("Size is " + mySet.getSize());
        try {
            System.out.println(mySet.get(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
        System.out.println(mySet.get(2));
        mySet.add(4);
        System.out.println(mySet);
        System.out.println("Size is " + mySet.getSize());
    }
}
