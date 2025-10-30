public class Main {
    public static void main(String[] args) {
        // 1. Create an instance (object) of the Person class
        System.out.println("--- Creating Person Object ---");
        Person person1 = new Person("Alice Smith", 30);
        person1.introduce(); // Call the custom method

        // 2. Accessing data using Getter Methods
        System.out.println("\n--- Accessing Data (Getters) ---");
        System.out.println("Person's Name: " + person1.getName());
        System.out.println("Person's Age: " + person1.getAge());

        // 3. Modifying data using Setter Methods
        System.out.println("\n--- Modifying Data (Setters) ---");
        person1.setAge(31); // Change age
        person1.setName("Alice Johnson"); // Change name
        System.out.println("New Age: " + person1.getAge());
        System.out.println("New Name: " + person1.getName());

        // 4. Final Introduction after changes
        System.out.println("\n--- Final Introduction ---");
        person1.introduce();

        // 5. Testing the basic validation in the setter
        System.out.println("\n--- Testing Setter Validation ---");
        person1.setAge(-5); // This should print the error message
        System.out.println("Age is still: " + person1.getAge()); // Age should not have changed
    }
}