public class ShoppingBill {

    // 1. Calculate Electronics GST: Add a + b, then add 18% GST
    public static double calculateElectronicsGST(double a, double b) {
        double subtotal = a + b;
        return subtotal + (subtotal * 0.18);
    }

    // 2. Calculate Fashion GST: Add c + d, then add 13% GST
    public static double calculateFashionGST(double c, double d) {
        double subtotal = c + d;
        return subtotal + (subtotal * 0.13);
    }

    // 3. Calculate Food GST: Add 7% GST to e
    public static double calculateFoodGST(double e) {
        return e + (e * 0.07);
    }

    // 4. Total Bill: Call the three GST methods and add their returned amounts
    public static double totalBill(double a, double b, double c, double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        return electronics + fashion + food;
    }

    // 5. Calculate Discounted Bill: Call totalBill(), calculate a 20% discount on that total, subtract the discount, and return final payable amount
    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        return total - discount;
    }

    // Main method to test with sample values (a = 100, b = 100, c = 100, d = 100, e = 100)
    public static void main(String[] args) {
        double a = 100, b = 100, c = 100, d = 100, e = 100;
        
        double totalAfterGST = totalBill(a, b, c, d, e);
        double finalPayable = calculateDiscountedBill(a, b, c, d, e);
        double discountAmount = totalAfterGST * 0.20;

        System.out.println("Total after GST = " + totalAfterGST);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final payable amount = " + finalPayable);
    }
}