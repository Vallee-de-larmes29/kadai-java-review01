
public class Review01 {
    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 0.08;
    int taxAmount = tax(price, taxRate);
    int totalPrice = price + taxAmount;
 System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    public static int tax(int price, double taxRate) {
        int result = (int)(price * taxRate);
        return result;
    }
}
