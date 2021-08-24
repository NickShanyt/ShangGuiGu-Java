package normal_function.course_prictices.P277_AccountThis;

public class MainTest {
    public static void main(String[] args) {
//        AccountFather test = new AccountFather(1122,20000,4.5/100);
//        test.withdraw(30000);
//        test.withdraw(2500);
//        test.deposit(3000);
        CheckAccount chk = new CheckAccount(1122,20000,4.5/12,5000);
        chk.withdraw(5000);
        chk.withdraw(18000);
        chk.withdraw(3000);

    }

}
