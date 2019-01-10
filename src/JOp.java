import javax.swing.JOptionPane;

public class JOp {
    public static void main(String[] args) {
        String mima1 = JOptionPane.showInputDialog("请输入密码");
        String mima2 = JOptionPane.showInputDialog("请再次输入密码");

        if (mima2.equals(mima1)) {
            JOptionPane.showConfirmDialog(null, "密码设置成功");

        } else {
            JOptionPane.showConfirmDialog(null, "两次密码不一致", "警告", JOptionPane.WARNING_MESSAGE);
        }
    }
}



