public class Account {
    String id;
    String name;
    float balance = 0;
    String dataCreated;

    Account(String id, String name, String dataCreated){
        this.id = id;
        this.name = name;
        this.dataCreated = dataCreated;
    }

    void withdraw(float extract){
        // 取款
        balance = balance - extract;
    }

    void deposit(float Deposit_in){
        // 存入
        balance = balance + Deposit_in;
    }

    void transfer(float transfer, Account account){
        // 转账
        balance = balance - transfer;
        account.balance = account.balance + transfer;
    }

    public String toString(){
        return "账号: " + id + "实名: " + name + "账户余额: " + dataCreated + "开户时间: " + dataCreated;
    }
}
