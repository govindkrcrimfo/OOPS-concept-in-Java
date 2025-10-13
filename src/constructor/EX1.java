package constructor;

/* Copy constructor 
   1. shallow copy 
   2. deep copy 
*/

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class School {
    String location;
    int pincode;

    public School(String location, int pincode) {
        this.location = location;
        this.pincode = pincode;
    }

    public School(School s) {
        this.location = s.location;
        this.pincode = s.pincode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}

public class EX1 {
    public static void main(String[] args) {
        // shallow copy
        Student originalStudent = new Student("Govind", 25);
        Student copyStudent = originalStudent;
        System.out.println(originalStudent.getName() + " " + originalStudent.getAge());
        copyStudent.name = "Rahul";
        copyStudent.age = 30;
        System.out.println(originalStudent.getName() + " " + originalStudent.getAge());
        /*
         * any change in copyStudent is also changing to originalStudent ,
         * because both have same reference shallow copy
         */

        // deep copy
        School originalSchool = new School("Bengaluru", 560035);
        School copySchool = new School(originalSchool);
        System.out.println(originalSchool.getLocation() + " " + originalSchool.getPincode());
        copySchool.location = "kolkata";
        copySchool.pincode = 711101;
        System.out.println(originalSchool.getLocation() + " " + originalSchool.getPincode());
        /*
         * any change in copySchool is not affecting the originalSchool ,
         * becoz both have different reference in deep copy
         */

    }
}
