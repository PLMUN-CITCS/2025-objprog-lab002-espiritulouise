public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
        int studentAge = 15;
        double itemPrice = 29.99;
        String studentName = "Alice";
        int counter = 10;
        int Counter = 20; // Valid but not recommended due to case confusion

        System.out.println("Student Age: " + studentAge);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Student Name: " + studentName);
        System.out.println("Counter (lowercase): " + counter);
        System.out.println("Counter (uppercase): " + Counter);
    }
}
