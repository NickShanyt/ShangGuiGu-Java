package normal_function.course_prictices.p235_AccountCustomerBank;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 16:19
 */

/**
 * @ClassName: Customer
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-20 16:19
 * @Version 1.0
 **/

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        System.out.println("getAccount()执行成功，已成功返回该账户信息");
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
        System.out.println("setAccount(Account account) 执行成功，设置用户账户成功");
    }
}
