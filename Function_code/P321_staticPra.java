package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/28 - 23:26
 */

/**
 * @ClassName: P321_staticPra
 * @Description: static 关键字的联系
 * @Author: NickShan
 * @Create: 2021-08-28 23:26
 * @Version 1.0
 **/

class Bank {
    private int id;
    private static int idIni = 20210001;
    private String key;
    private double balance_bank;
    private static double minBalance = 0.01;
    private static double rate;

    public Bank() {
        id = idIni++;
    }

    public Bank(String key, double balance_bank) {
        this.id = idIni++;
        this.key = key;
        this.balance_bank = balance_bank;
    }

    private Bank(double minBalance, double rate) {
        setMinBalance(minBalance);
        setRate(rate);
    }

    public int getId() {
        return id;
    }


    public String getKey_bank() {
        return key;
    }

    public void setKey_bank(String key_bank) {
        this.key = key_bank;
    }

    public double getBalance_bank() {
        return balance_bank;
    }

    public void setBalance_bank(double balance_bank) {
        this.balance_bank = balance_bank;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Bank.minBalance = minBalance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Bank.rate = rate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", balance_bank=" + balance_bank +
                '}';
    }
}


public class P321_staticPra {
    public static void main(String[] args) {
        Bank ac01 = new Bank();
        Bank ac02 = new Bank("12345", 10);
        System.out.println(ac01.toString());
        System.out.println(ac02.toString());
        ac01.setKey_bank("2123412312");
        System.out.println(ac01.toString());

    }
}
