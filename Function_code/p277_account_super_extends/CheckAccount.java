package normal_function.course_prictices.P277_AccountThis;

/**
 * @Author NickShan
 * @Date 2021/8/24 - 16:51
 */

/**
 * @ClassName: CheckAccount 可透支账户
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-24 16:51
 * @Version 1.0
 **/

public class CheckAccount extends AccountFather{
    double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRatedouble,double overdraft)
    {
        super(id,balance,annualInterestRatedouble);
        this.overdraft=overdraft;

    }
    @Override
    public void withdraw(double amount)
    {
        if (amount < 0)
            System.out.println("请输入正确的取款金额");
        if(amount<=this.getBalance())
        {
            //方式一:
            this.setBalance(this.getBalance()-amount);
            //方式二：
//            super.withdraw(amount);
            System.out.println("您的账户余额： " + this.getBalance());
            System.out.println("您的可透支余额： " + this.overdraft);
            System.out.println();
        }
        else if(amount>this.getBalance()) //这个判断可以直接不要，直接进入下面的判断
        {
            if(amount-this.getBalance()<=this.overdraft)
            {
                this.overdraft-=amount-this.getBalance();
                //方式一:
                this.setBalance(0);
                //方式二:
//                super.withdraw(getBalance());
                System.out.println("您的账户余额： " + this.getBalance());
                System.out.println("您的可透支余额： " + this.overdraft);
                System.out.println();
            }
            else
                System.out.println("可透支金额不足！您的账户余额为："+this.getBalance()+"   " +
                        "可透支："+ this.overdraft);

        }
    }



}
