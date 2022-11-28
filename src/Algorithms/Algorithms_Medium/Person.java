package Algorithms.Algorithms_Medium;

public class Person {

    public static void main(String[] args) {
        Person person = new Person();
        // firstName is set to empty string person.setLastName("");
        person.setFirstName("");
        // lastName is set to empty string person.setAge(10);
        person.setLastName("");
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        //firstName is set to John
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        // lastName is set to Smith
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
       return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if(lastName.isEmpty()) {
            return firstName;
        } else if(firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
