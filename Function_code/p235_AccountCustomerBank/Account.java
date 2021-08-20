package normal_function.course_prictices.p235_AccountCustomerBank;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 16:10
 */

/**
 * @ClassName: Account
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-20 16:10
 * @Version 1.0
 **/

public class Account {
    private double balance;

    public double getBalance() {
        System.out.println("getBalance() 执行成功，返回余额: " +this.balance);
        return this.balance;
    }

    public Account(double init_balance)
    {
        this.balance = init_balance;
        System.out.println("Account(double init_balance) 执行成功。初始化账户成功，初始金额为： " + init_balance);
    }
    public void deposit(double amt)
    {
        System.out.println("——————————————————————");
        System.out.println("deposit(double amt)执行成功");
        System.out.println("当前余额为："+this.balance);
        this.balance +=amt;
        System.out.println("存款后当前余额为："+this.balance);
        System.out.println("——————————————————————");

    }
    public void withdraw(double amt)

    {
        System.out.println("——————————————————————");

        System.out.println("当前余额为："+this.balance);
        if(amt>this.balance)
        {
            System.out.println("当前余额不足");
        }
        else if(amt<0)
        {
            System.out.println("请输入正确的金额");
        }
        else{
            this.balance-=amt;
            System.out.println("取款后余额为： "+this.balance);
        }
        System.out.println("withdraw(double amt) 执行成功");
        System.out.println("——————————————————————");

    }

}
