package Module3;

public class Question2 {
    static void check(int n){
        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        check(0);
    }
}
