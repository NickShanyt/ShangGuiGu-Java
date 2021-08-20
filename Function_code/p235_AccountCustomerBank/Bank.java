package normal_function.course_prictices.p235_AccountCustomerBank;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 16:22
 */

/**
 * @ClassName: Bank
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-20 16:22
 * @Version 1.0
 **/

public class Bank
{
    private Customer[] customers=new Customer[100]; //初始化100个银行客户，或者可以在构造函数中完成
    private int numberofCustomers;
    public Bank()
    {
//        customers=new Customer[100];
        System.out.println("创建银行成功");
    }
    public void addCustomer(String f,String l)
    {
        Customer newone = new Customer(f,l);

        customers[this.numberofCustomers]=newone;
        this.numberofCustomers+=1;

        System.out.println("addCustomer(String f,String l) 执行成功，添加新用户成功");


    }

    public Customer getCustomers(int index) {
        if(index>this.numberofCustomers || index<0)
        {
            System.out.println("当前用户不存在");
            return null;
        }
        System.out.println("getCustomers(int index) 执行成功，已成功返回指定用户");
        return customers[index];
    }

    public int getNumberofCustomers() {
        return numberofCustomers;
    }
}
