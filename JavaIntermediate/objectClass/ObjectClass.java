package objectClass;

public class ObjectClass {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 2);
        Car car = new Car("Tesla");
        System.out.println(printInfo(dog));
        System.out.println(printInfo(car));
    }

    public static String printInfo(Object obj) { //인수 전달
        return "객체 정보 출력: " + obj.toString();
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}

