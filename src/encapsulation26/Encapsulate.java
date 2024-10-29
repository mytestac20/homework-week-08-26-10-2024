package encapsulation26;

public class Encapsulate {

    //private variables declared these can ony be accesses by public menthod of class
    private String name;
    private int rollNo;
    private int age;

    //get method for name to acces private variable name

    public String getName() {
        return name;
    }

    //set method for name to access private variables

    public void setName(String name) {
        this.name = name;
    }
    //get method for roll to access private variable rollno


    public int getRollNo() {
        return rollNo;
    }

    // set method for roll to access private variable rollno

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

}
