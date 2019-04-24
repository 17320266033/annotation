package bean;

public class Person {
    private String name;
    private String age;
    private String school;

    public Person(String name, String age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
