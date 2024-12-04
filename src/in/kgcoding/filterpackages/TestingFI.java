package src.in.kgcoding.filterpackages;

public class TestingFI {
    public static void main(String[] args) {
        Truth truth = num -> {
            for (int i = 2; i < num; i++) {
                if(num % i ==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(truth.isCandidate(5));
    }
}
