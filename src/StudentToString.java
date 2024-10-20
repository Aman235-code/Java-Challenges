package src;

class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "StudentToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber='" + rollNumber + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Aman",20,"001","Shivaji");
        System.out.println(stu);
    }
}
