public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account("18044124", "wei", "2020.02.01");
        a.deposit(3000);
        System.out.println(a.balance);
        a.withdraw(2500);
        System.out.println(a.balance);
        Account b = new Account("1802344", "xv", "2020.02.19");
        a.transfer(200, b);
    }
}
