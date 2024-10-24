package src.in.kgcoding.challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriority {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.printf("%s %s",o1.getGrade(),o2.getGrade());
                System.out.println();
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Prashant",'B'));
        queue.offer(new Student("Shyam",'C'));
        queue.offer(new Student("Ram",'A'));
        queue.offer(new Student("Mohan",'D'));
        queue.offer(new Student("Sanchit",'A'));

        System.out.printf("Queue is %s ",queue);
        System.out.println(queue.poll());

    }




    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
