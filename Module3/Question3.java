package Module3;

    class Student {
        String name;
        int marks;

        Student(String n, int m) {
            name = n;
            marks = m;
        }

        void display() {
            System.out.println("Name:" + name + ",Marks:" + marks);
        }
    }

    public class Question3 {
        public static void main(String[] args) {
            Student s1 = new Student("Deepa", 95);
            s1.display();

        }
    }
