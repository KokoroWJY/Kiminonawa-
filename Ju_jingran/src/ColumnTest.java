import java.util.Arrays;

public class ColumnTest {
    public static void main(String[] args) {
        Column[] ColumnArray = new Column[5];
        int[][] a = new int[][]{{5, 3}, {2, 4}, {4, 3}, {2, 3}, {4, 6}};
        for (int i = 0; i < ColumnArray.length; i++) {
            ColumnArray[i] = new Column(a[i][0], a[i][1]);
        }
        Arrays.sort(ColumnArray);
        for (int i = 0; i < ColumnArray.length; i++) {
            System.out.print(ColumnArray[i].toString() + "\t");
        }
    }
}
