package e_Enum;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        DiscountClass discountClass = new DiscountClass();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter price: ");
        int price = sc.nextInt();

        System.out.print("enter Grade(BASIC, GOLD, DIAMOND): ");
        String grade = sc.next().trim().toUpperCase();
        Grade enumObj = Grade.valueOf(grade);

        int discountPrice = discountClass.discount(enumObj, price);

        System.out.println("최종 discount price: " + discountPrice);
    }
}
