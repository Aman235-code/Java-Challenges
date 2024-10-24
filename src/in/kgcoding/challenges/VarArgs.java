package src.in.kgcoding.challenges;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(concatenate("Aman"));
        System.out.println(concatenate("Ahamed"));
        System.out.println(concatenate("Subscribe","To","Me"));
    }

    public static String concatenate(String... strs){
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str).append(" ");
        }
        return stringBuilder.toString();
    }
}
