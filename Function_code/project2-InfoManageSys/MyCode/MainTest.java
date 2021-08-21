package project02;

/**
 * @Author NickShan
 * @Date 2021/8/21 - 17:59
 */

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-21 17:59
 * @Version 1.0
 **/

public class MainTest {
    public static void main(String[] args) {
        CustomerList cl= new CustomerList(1);
        //public Customer(String name, char gender, int age, String phone, String email) {
//        cl.addCustomer(new Customer("nick",'男',20,"1111102222","1222@123.com"));
//        cl.addCustomer(new Customer("sick",'女',22,"1353121222","63212@123.com"));
//        cl.replaceCustomer(0,new Customer("Replacenick",'男',20,"1111102222","1222@123.com"));
        cl.deleteCustomer(1);
//        cl.getAllCustomers();
//        cl.getTotal();
//        System.out.println(cl.getCustomer(0).getName());
//        System.out.println(cl.getCustomer(0).getAge());
//        System.out.println(cl.getCustomer(0).getPhone());

    }

}
