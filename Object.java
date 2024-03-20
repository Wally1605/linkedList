public class Object {
    private String name;
    private int age;
    private String position;
    private int hours;

    public Object(String name, int age, String position, int hours){
        this.name = name;
        this.age = age;
        this.position = position;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }
    public int getHours(){return hours;}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", scheduled hours =" + hours +
                '}';
    }
}
