package src.in.kgcoding.enums;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.WEDNESDAY);
//        System.out.println(Day.THURSDAY);
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.SATURDAY);
//        System.out.println(Day.SUNDAY);

        for (Day value : Day.values()) {
            System.out.println(value);
            System.out.println(value.getType());
        }
    }
}
