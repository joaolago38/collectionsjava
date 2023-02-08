package colecoes.java;

import java.util.*;

public class ArrayList5 {

    public static void main(String args[]){

            //Creating user-defined class objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack",34));
        students.add(new Student(2, "James",45));
        students.add(new Student(3, "Kelly",67));
        students.add(new Student(4, "joao horacio",67));
        boolean ans = students.contains(2);

        if(ans){
                System.out.println("contem joao horacio do lago");
             }
       if(students.indexOf("james") != -1) {
               System.out.println("contem james");
        }

            //Getting Iterator
            Iterator itr=students.iterator();
            //traversing elements of ArrayList object
            while(itr.hasNext()) {
                Student st = (Student) itr.next();
                System.out.println(st.rollno + " " + st.name + " " + st.age);
            }
        }
    public Student findUsingEnhancedForLoop(String name, List<Student> students) {

        for (Student student : students) {
            if (student.getName().equals("Joao horacio do lago")) {
                return student;
            }
        }
        return null;
    }

}
