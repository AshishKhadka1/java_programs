public class StringConcatenationExample {
    public static void main(String[] args) {
        // Using the + operator
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println("Using + operator: " + fullName);

        // Using the concat() method
        String greeting = "Hello, ";
        String name = "Alice";
        String message = greeting.concat(name);

        System.out.println("Using concat() method: " + message);
    }
}
