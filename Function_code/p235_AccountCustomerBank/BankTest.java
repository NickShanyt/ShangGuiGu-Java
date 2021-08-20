package normal_function.course_prictices.p235_AccountCustomerBank;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 16:29
 */

/**
 * @ClassName: BankTest
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-20 16:29
 * @Version 1.0
 **/

public class BankTest {
    public static void main(String[] args) {
        Bank newbank =new Bank();//建银行
        newbank.addCustomer("NICK","SHAN");//建银行客户群
        Customer mycustomer = newbank.getCustomers(0);//为客户群添加客户
        mycustomer.setAccount(new Account(0));//设置客户的初始金额
        Account myAccount = mycustomer.getAccount();//获取这个客户的账户
        double mybalance = myAccount.getBalance();//获取账户的余额
        myAccount.deposit(1000);//向账户存钱
        myAccount.withdraw(500);//取钱


    }
}
