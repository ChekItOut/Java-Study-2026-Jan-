package e_Enum;

public class DiscountClass {
    public int discount (Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
