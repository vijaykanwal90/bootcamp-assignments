package org.example;
class Student{
    String name;
    int subject1;
    int subject2;
    int subject3;
    int total;
    public Student(String name, int subject1, int subject2, int subject3){
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    public int totalMarks (){
        this.total =  subject1 + subject2 + subject3;
        return total;
    }
    public int average (){
        return total/3;
    }


}


public class Question5 {
    public static void main(String[] args) {
        String name = "vijay";
        int subject1 = 67;
        int subject2 = 89;
        int subject3 = 87;
        Student s1 = new Student(name,subject1,subject2,subject3);
       int total =  s1.totalMarks();
       int average = s1.average();
        System.out.println(total);
        System.out.println(average);

    }
}
