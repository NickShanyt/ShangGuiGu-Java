package project02;

/**
 * @Author NickShan
 * @Date 2021/8/21 - 12:50
 */

/**
 * @ClassName: CustomerList
 * @Description: TODO CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 * @Author: NickShan
 * @Create: 2021-08-21 12:50
 * @Version 1.0
 **/

public class CustomerList {
    private Customer[] customers;
    private int total = 0;
    private int capacity;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
        this.capacity = totalCustomer;
//        System.out.println("CustomerList初始化成功");
    }

    //    public  CustomerList(int totalCustomer){
//        for (int i = total; i < total+totalCustomer; i++) {
//            customers[i]=new Customer();
//        }
//    }
    public boolean addCustomer(Customer customer) {
        if (total >= capacity) //这里新增了一个属性来记录可存容量
        {
            return false;
        }
        customers[total++] = customer;

//        System.out.println("addCustomer 执行成功");
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index > total) {
            System.out.println("错误的位置，请重新输入");
            return false;
        }

        customers[index] = cust;

//        System.out.println("replaceCustomer 执行成功");
        return true;


//        try {
//            if (index < 0 || index > total)
//        }
//        catch (new IndexOutOfBoundsException())
//        {
//            System.out.println("错误的位置，请重新输入");
//        }
    }

    public boolean deleteCustomer(int index) {

        if (total == 0) {
            System.out.println("无可操作客户");
            return false;
        }
        if (index < 0 || index > total) {
            System.out.println("错误的位置，请重新输入");
            return false;
        }
        customers[index] = null;
//        System.out.println("deleteCustomer 执行成功");
        return true;
    }

    public Customer[] getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index > total) {
            System.out.println("错误的位置，请重新输入");
            return null;
        }
//        System.out.println("getCustomer 执行成功");
        return customers[index];

    }

    public int getTotal() {
//        System.out.println("getCustomer 执行成功");
        return total;
    }


/*    public static void main(String[] args) {
        CustomerList cl= new CustomerList(100);
        //public Customer(String name, char gender, int age, String phone, String email) {
        cl.addCustomer(new Customer("nick",'男',20,"1111102222","1222@123.com"));
        cl.addCustomer(new Customer("sick",'女',22,"1353121222","63212@123.com"));
        cl.replaceCustomer(0,new Customer("Replacenick",'男',20,"1111102222","1222@123.com"));
        cl.deleteCustomer(1);
        cl.getAllCustomers();
        cl.getTotal();
        System.out.println(cl.customers[0].getName());
        System.out.println(cl.customers[0].getAge());
        System.out.println(cl.customers[0].getPhone());
    }*/
}
