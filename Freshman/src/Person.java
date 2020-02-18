public class Person {
    int age;
    String name;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name){
        this.name = name;
        this.age = 18;
    }


    void speak(){
        System.out.println("大家好, 我叫" + name + ", 今年" + age + "岁");
    }

    public static void main(String[] args){
        Person ju = new Person("居敬然", 18);
        ju.speak();
    }
}
