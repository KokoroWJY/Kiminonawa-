import java.util.Arrays; // Arrays数组

public class StudentTest {
    public static void main(String[] args) {
        Student[] StudentArray = new Student[5];
        String[] a = new String[]{"tom", "jerry", "daniel", "liang", "liu", "lin"};
        for (int i = 0; i < StudentArray.length; i++) {
            StudentArray[i] = new Student(a[i]);
            System.out.print(StudentArray[i].getName() + "\t");
        }
        Arrays.sort(StudentArray); // 排序
        for (int i = 0; i < StudentArray.length; i++) {
            System.out.print(StudentArray[i].getName() + "\t");
        }
    }
}
