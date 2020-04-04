public class Student implements Comparable {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Student a = (Student) o;
        return this.name.compareTo(a.name);
    }
}
