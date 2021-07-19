package edu.cnm.deepdive;

public class TheObjectEquality {

  public static void main(String[] args) {
    //comparing objects.
    Integer myInteger = 127;
    Integer anotherInteger = 127;

    System.out.println(myInteger == anotherInteger);// prints true because we assign an int value
    //which is then autoboxed to an Integer object
    System.out.println("128 == 128: " + (128 == 128));//prints true.

    myInteger = 128;
    anotherInteger = 128;

    System.out.println("myInteger = " + myInteger);
    System.out.println("anotherInteger = " + anotherInteger);
    System.out.println(myInteger == anotherInteger);//will print false because two different objects
    //have been created with two different object references that are checked by the == operator.

    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);
    Integer int3 = 1;

    System.out.println("\nint1 == int2: " + (int1 == int2));
    System.out.println("int1 == int3: " + (int1 == int3));
    System.out.println("int2 == int3: " + (int2 == int3));//all three print false because the ==
    //compares the object references and all three Integers are different objects.

    System.out.println("\nint1.equals(int2) is " + int1.equals(int2));
    System.out.println("int1.equals(int3) is " + int1.equals(int3));
    System.out.println("int2.equals(int3) is " + int2.equals(int3));//all three print true because
    //they have all three the same value. With the equals method we are checking the value in the container.

    System.out.println("\nint1 hash = " + System.identityHashCode(int1));
    System.out.println("int2 hash = " + System.identityHashCode(int2));
    System.out.println("int3 hash = " + System.identityHashCode(int3));//shows three different
    //memory addresses.
  }

}
