package class1;

import ex.ProductOrder;

public class classStart5 {
    public static void main(String[] args) {

        Student students[] = new Student[2];

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;
        students[0] = student1;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 80;
        students[1] = student1;



        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

    }
}