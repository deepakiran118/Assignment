package Module3;

    class Calculator{
        void add(int a,int b){
            System.out.println("Sum:"+(a+b));
        }
        void Subract(int a,int b){
            System.out.println("Diff:"+(a-b));
        }
    }

    public class Question4 {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            calc.add(10,5);
            calc.Subract(10,5);
        }
}
