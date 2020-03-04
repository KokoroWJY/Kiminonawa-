class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this.name = name;
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
        if (age > 0 && age < 125) {
            this.age = age;
        }
    }

    void speak() {
        System.out.println("大家好, 我叫" + name + ", 今年" + age + "岁");
    }
}

public class Person01 {
    public static void main(String[] args) {
        Person ju = new Person("居敬然");
        ju.setName("wjy");
        ju.setAge(50);
        System.out.println(ju.getAge());
        ju.speak();
    }
}

