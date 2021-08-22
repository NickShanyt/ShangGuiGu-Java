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
    CustomerList customerList;

    private CustomerView() {
//        System.out.println("不输入数量参数则默认初始化10个，否则按输入数量初始化");
    }

    private CustomerView(int num) {
        customerList = new CustomerList(num);
    }

    /**
     * @Description: 显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
     * @Param: []
     * @Author: NickShan
     * @Date: 2021/8/22
     * @return:
     */

    public void enterMainMenu() {

        System.out.println("-----------------客户信息管理软件-----------------");

        System.out.println("                 1 添 加 客 户");
        System.out.println("                 2 修 改 客 户");
        System.out.println("                 3 删 除 客 户");
        System.out.println("                 4 客 户 列 表");
        System.out.println("                 5 退      出");

        FOR:
        for (; ; ) {
            System.out.print("—————————————————请选择(1-5)：");
            char choose = CMUtility.readMenuSelection();
            switch (choose) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    showCustomer();
                    break;
                case '5':
                    break FOR;
            }
        }


    }

    /**
     * @Description: 添加客户
     * @Param: []
     * @Author: NickShan
     * @Date: 2021/8/22
     * @return:
     */
    private void addNewCustomer() {
        if (customerList.getTotal()  < customerList.getCapacity()) {
            System.out.println("---------------------添加客户---------------------");
            System.out.print("姓名：");
            String name = CMUtility.readString(10);
            System.out.print("性别：");
            char gender = CMUtility.readChar('N');
            System.out.print("年龄：");
            int age = CMUtility.readInt(0);
            System.out.print("电话：");
            String phone = CMUtility.readString(11);
            System.out.print("邮箱：");
            String email = CMUtility.readString(20);


            if (customerList.addCustomer(new Customer(name, gender, age, phone, email))) {
                System.out.println("---------------------已添加信息如下：---------------");
                System.out.println("姓名：" + customerList.getCustomer(customerList.getTotal() - 1).getName());
                System.out.println("性别：" + customerList.getCustomer(customerList.getTotal() - 1).getGender());
                System.out.println("年龄：" + customerList.getCustomer(customerList.getTotal() - 1).getAge());
                System.out.println("电话：" + customerList.getCustomer(customerList.getTotal() - 1).getPhone());
                System.out.println("邮箱：" + customerList.getCustomer(customerList.getTotal() - 1).getEmail());
                System.out.println("---------------------添加完成---------------------");
            } else {
                System.out.println("用户数已满，无法添加"); //输完信息以后才告知已满是不合理的
            }
        } else {
            System.out.println("用户数已满，无法继续添加，请尝试执行其他操作");
            enterMainMenu();
        }
    }

    /**
     * @Description: 修改已有客户的客户信息
     * @Param: []
     * @Author: NickShan
     * @Date: 2021/8/22
     * @return:
     */
    private void modifyCustomer() {
        System.out.println("-------------------修改客户----------------------");
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出):");
            int index = CMUtility.readInt();
            if (index == -1) {
                break;
            }
            if (index < 1 || index > customerList.getTotal()) {
                System.out.println("请输入正确的客户编号");
                continue;
            }
            Customer oldCustomer = customerList.getCustomer(index - 1);
            System.out.println("——————请直接输入需要修改的信息，不修改请按Enter进入下一信息");
            System.out.print("姓名(" + oldCustomer.getName() + "): ");
            String name = CMUtility.readString(10, oldCustomer.getName());
            System.out.print("性别(" + oldCustomer.getGender() + "): ");
            char gender = CMUtility.readChar(oldCustomer.getGender());
            System.out.print("年龄(" + oldCustomer.getAge() + "): ");
            int age = CMUtility.readInt(oldCustomer.getAge());
            System.out.print("电话(" + oldCustomer.getPhone() + "): ");
            String phone = CMUtility.readString(11, oldCustomer.getPhone());
            System.out.print("邮箱(" + oldCustomer.getEmail() + "): ");
            String email = CMUtility.readString(20, oldCustomer.getEmail());

            customerList.replaceCustomer(index - 1, new Customer(name, gender, age, phone, email));
            System.out.println("---------------------修改完成---------------------");

        }
        enterMainMenu();

    }


    /**
     * @Description: 删除客户
     * @Param: []
     * @Author: NickShan
     * @Date: 2021/8/22
     * @return:
     */
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出):");
            int index = CMUtility.readInt();
            if (index == -1) {
                break;
            }
            if (index < 1 || index > customerList.getTotal()) {
                System.out.println("请输入正确的客户编号");
                continue;
            }

            System.out.print("确认是否删除(Y/N)：");
            char key = CMUtility.readConfirmSelection();
            if (key == 'Y') {
                customerList.deleteCustomer(index - 1);
                System.out.println("---------------------删除完成---------------------");
            }

        }
        enterMainMenu();

    }

    /**
     * @Description: 显示已有的所有客户的信息
     * @Param: []
     * @Author: NickShan
     * @Date: 2021/8/22
     * @return:
     */
    private void showCustomer() {
        if (customerList.getTotal() == 0) {
            System.out.println("—————————————————无用户可显示—————————————————");
        } else {
            System.out.println("---------------------------客户列表---------------------------");
            System.out.println("编号  姓名  性别  年龄  电话          邮箱");
            for (int i = 0; i < this.customerList.getTotal(); i++) {

                System.out.print(i + 1);
                System.out.print("     ");
                System.out.print(this.customerList.getCustomer(i).getName());
                System.out.print("  ");
                System.out.print(this.customerList.getCustomer(i).getGender());
                System.out.print("     ");
                System.out.print(this.customerList.getCustomer(i).getAge());
                System.out.print("     ");
                System.out.print(this.customerList.getCustomer(i).getPhone());
                System.out.print("     ");
                System.out.println(this.customerList.getCustomer(i).getEmail());
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("请输入初始化数量，不输入则初始化10个位置");
        int num =CMUtility.readInt(10);
        CustomerView CV = new CustomerView(num);
        CV.enterMainMenu();

    }
}
