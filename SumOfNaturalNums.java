// Program to create Sum of Natural Numbers.

// Class name should start with a capital letter.

public class SumOfNaturalNums {

    // This is the main method.
    public static void main(String[] args) {

       int num = 10, count = 1, total = 0;

        // Using while loop
       while(count <= num)
           
       {
           total = total + count;
           count++;
       }

       System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}
