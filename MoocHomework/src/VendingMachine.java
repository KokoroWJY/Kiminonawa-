public class VendingMachine {
    int price = 80;
    int balance;//平衡
    int total;

    void setPrice(int price) {
        this.price = price;
    }

    void showPrompt() {
        //Prompt提示
        System.out.println("Welcome!");
    }

    void inserMomey(int amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are!");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.inserMomey(100);
        vm.getFood();
        vm.showBalance();
        VendingMachine vm1 = new VendingMachine();
        vm1.inserMomey(200);
        vm.showBalance();
        vm1.showBalance();
    }
}