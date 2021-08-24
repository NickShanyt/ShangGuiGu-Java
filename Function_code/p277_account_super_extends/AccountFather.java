package normal_function.course_prictices.P277_AccountThis;

/**
 * @Author NickShan
 * @Date 2021/8/24 - 16:51
 */

/**
 * @ClassName: P277_Account_Extendssuper 类的继承、super关键字的使用
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-24 16:32
 * @Version 1.0
 **/
class AccountFather {
    private int id;
    private double balance;
    private double annualInterestRate;
//    public AccountFather()
//    {
//
//    }
    public AccountFather(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
    * @Description: 取钱
    * @Param: [amount]
    * @Author: NickShan
    * @Date: 2021/8/24
    * @return:
    */
    public void withdraw(double amount) {
        if (amount < 0)
            System.out.println("请输入正确的取款金额");
        if (amount > balance) {
            System.out.println("余额不足！");
            System.out.println("您的账户余额为： " + balance);
        } else
            balance -= amount;

    }

    /**
    * @Description: 存钱
    * @Param: [amount]
    * @Author: NickShan
    * @Date: 2021/8/24
    * @return:
    */
    public void deposit(double amount) {
        if (amount < 0)
            System.out.println("请输入正确的取款金额"); //思考：该类应该尽可能只操纵数据，而不进行各类输出才好
        balance += amount;
        System.out.println("您的账户余额为： " + balance);
        System.out.println("月利率为： " + getMonthlyInterest());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


}
