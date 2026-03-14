package Module9;

public class GenerateSubsets {

    static void subsets(String str, String curr, int i){

        if(i == str.length()){
            System.out.println(curr);
            return;
        }

        subsets(str, curr + str.charAt(i), i+1);
        subsets(str, curr, i+1);
    }

    public static void main(String[] args) {

        String str = "abc";
        subsets(str,"",0);
    }
}