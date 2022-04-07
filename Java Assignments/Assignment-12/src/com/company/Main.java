/*Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

Add following student in list ;

1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

Use stream api on above list of employees find

1. Print the name of all departments in the college?
2.Get the names of all students who have enrolled after 2018?
3. Get the details of all male student in the computer sci department?
4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
5.What is the average age of male and female students?
6.Get the details of highest student having highest percentage ?
7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
8. What is the average percentage achieved in each department?
9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
10.How many male and female students are there in the computer science department?

*/






package com.company;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


    //1.
       list.stream().map(s->s.getDept()).distinct().forEach(System.out::println);

    //2.
        list.stream().filter(s->s.getEnrol()>2018).map(s->s.getName()).forEach(System.out::println);

    //3.
        list.stream().filter(s->s.getGender()=="Male" && s.getDept()=="Computer Science").map(s->s.getName()).forEach(System.out::println);

    //4.
        Map <Object,Long> map= list.stream().collect(Collectors.groupingBy(s->s.gender,Collectors.counting()));
        System.out.println(map);

    //5.
        Map <Object,Double> map1= list.stream().collect(Collectors.groupingBy(s->s.gender,Collectors.averagingDouble(Student::getAge)));
        System.out.println(map1);

    //6.
        Optional<Student> t = list.stream().max(Comparator.comparingDouble(s->s.perTillDate));
        Student t1=t.get();
        System.out.println(t1.name);
        //list.stream().map(s->s.getPer()).collect(Collectors.maxBy(Comparator.naturalOrder())));


    //7.
        Map<Object,Long> map2=list.stream().collect(Collectors.groupingBy(s->s.engDepartment,Collectors.counting()));
        System.out.println(map2);


    //8.
        Map<Object,Double> map3=list.stream().collect(Collectors.groupingBy(s->s.engDepartment,Collectors.averagingDouble(Student::getPer)));
        System.out.println(map3);


    //9.
        Optional<Student> tt=  list.stream().filter(s -> s.engDepartment == "Electronic")
                .filter(s -> s.gender == "Male").min(Comparator.comparingInt(s->s.age));

        Student tt1=tt.get();
        System.out.println(tt1.getName());


    //10.

    Map<Object, Long> map4=list.stream().filter(s->s.engDepartment=="Computer Science").collect(Collectors.groupingBy(s->s.gender,Collectors.counting()));
        System.out.println(map4);


    }

}

