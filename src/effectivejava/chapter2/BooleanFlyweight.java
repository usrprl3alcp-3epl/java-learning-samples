package effectivejava.chapter2;

public class BooleanFlyweight {
    public static void main(String[] args) {
        System.out.println(new Boolean(true) == new Boolean(true));
        System.out.println(Boolean.valueOf(true) == Boolean.valueOf(true));
    }
}
