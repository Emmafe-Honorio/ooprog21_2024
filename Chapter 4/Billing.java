public class Billing {
      public static void main(String[]args){
         computeBill(23.199);
         computeBill(24.3995, 2);
         computeBill(24.8773, 3, 5);
       }
       
       public static void computeBill(double price){
         double total = price * 1.08;
         System.out.printf("The total price for the bill is: $%.3f" , total);
       }
       
       public static void computeBill(double price, int quantity){
         double total = price * quantity * 1.08;
         System.out.printf("\nThe total price for the bill is: $%.3f",  total);
       }
       
       public static void computeBill(double price, int quantity, int coupon){
         double total = price * quantity;
         total = total - (total * coupon / 100.0);
         total = total *1.08; 
         System.out.printf("\nThe total price for the bill is: $%.3f",  total);
      
    }
}
