package project02;

/**
 * @Author NickShan
 * @Date 2021/8/21 - 12:06
 */

/**
 * @ClassName: CustomerView
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-21 12:06
 * @Version 1.0
 **/

public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    
    /** 
    * @Description: 显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
    * @Param: [] 
    * @Author: NickShan
    * @Date: 2021/8/21 
    * @return:        
    */ 
    public void enterMainMenu() {
        System.out.println("-----------------客户信息管理软件-----------------");

        System.out.println("                 1 添 加 客 户");
        System.out.println("                 2 修 改 客 户");
        System.out.println("                 3 删 除 客 户");
        System.out.println("                 4 客 户 列 表");
        System.out.println("                 5 退      出");
        System.out.print("                  请选择(1-5)：");

        char choose = CMUtility.readMenuSelection();
        switch(choose) {
            case '1':
                addNewCustomer();
        }


    }
    private  void addNewCustomer()
    {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(6);
        System.out.print("性别：");
        char gender = CMUtility.readChar('N');
        System.out.print("年龄：");
        int age = CMUtility.readInt(0);
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        if(customerList.addCustomer(new Customer(name,gender,age,phone,email)))
        {   System.out.println("---------------------已添加信息如下：---------------------");
            System.out.println("姓名："+customerList.getCustomer(customerList.getTotal() - 1).getName());
            System.out.println("性别："+customerList.getCustomer(customerList.getTotal() - 1).getGender());
            System.out.println("年龄："+customerList.getCustomer(customerList.getTotal() - 1).getAge());
            System.out.println("电话："+customerList.getCustomer(customerList.getTotal() - 1).getPhone());
            System.out.println("邮箱："+customerList.getCustomer(customerList.getTotal() - 1).getEmail());
            System.out.println("---------------------添加完成---------------------");
        }
        else
        {
            System.out.println("用户数已满，无法添加");
        }




//        customerList.addCustomer()

    }
    private void modifyCustomer()
    {

    }
    private void deleteCustomer()
    {

    }

    public static void main(String[] args) {
        CustomerView CV = new CustomerView();
//        System.out.println(CV.customerList.getAllCustomers().length);
        CV.enterMainMenu();

    }
}
