public class Person {

    // 1. Fields (Attributes)
    private String name;
    private int age;

    // 2. Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Getter Methods (Accessors)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 4. Setter Methods (Mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Basic validation example
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    // 5. Custom Method (Optional but helpful)
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}