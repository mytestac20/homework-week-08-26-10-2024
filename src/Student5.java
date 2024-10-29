class Student5 {
    int id;
    String name;
    int age;

    // Two-argument constructor
    Student5(int i, String n) {
        id = i;
        name = n;
        age = 0; // Default age
    }

    // Three-argument constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display student details
    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan"); // Using the two-arg constructor
        Student5 s2 = new Student5(222, "Aryan", 25); // Using the three-arg constructor
        s1.display(); // Output: 111 Karan 0
        s2.display(); // Output: 222 Aryan 25
    }
}