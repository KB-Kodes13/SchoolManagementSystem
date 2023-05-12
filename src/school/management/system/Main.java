package school.management.system;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher Kelan = new Teacher(1,"Kelan",500);
        Teacher John = new Teacher(2,"John",700);
        Teacher Javier = new Teacher(3,"Javier",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Kelan);
        teacherList.add(John);
        teacherList.add(Javier);


        Student Drake = new Student(1,"Drake",4);
        Student Jimmy = new Student(2,"Jimmy",12);
        Student Graham = new Student(3,"Graham",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Drake);
        studentList.add(Graham);
        studentList.add(Jimmy);

        School wchs = new School(teacherList,studentList);

        Teacher Taty = new Teacher(6,"Taty", 900);

        wchs.addTeacher(Taty);


        Drake.payFees(5000);
        Graham.payFees(6000);
        System.out.println("WCHS has earned $"+ wchs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Kelan.receiveSalary(Kelan.getSalary());
        System.out.println("WCHS has spent $" + wchs.getTotalMoneySpent() +  " for salary to " + Kelan.getName() +" and now has $" + wchs.getTotalMoneyEarned());

        Javier.receiveSalary(Javier.getSalary());
        System.out.println("WCHS has spent $" + wchs.getTotalMoneySpent() + " for salary to " + Javier.getName() + " and now has $" + wchs.getTotalMoneyEarned());


        System.out.println(Graham);
        John.receiveSalary(John.getSalary());
        System.out.println(John);


    }

}
