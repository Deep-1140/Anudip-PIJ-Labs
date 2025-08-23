class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        // This line would cause a compile-time error:
        // emp.age = 35.5; // Error: incompatible types: possible lossy conversion from double to int

        // Corrected using casting:
        emp.age = (int) 35.5; // This will assign 35 to age

        System.out.println("Successfully started");
    }
}
