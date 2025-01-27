package com.mmendoza;

import com.mmendoza.entities.Person;
import com.mmendoza.entities.Student;
import com.mmendoza.entities.Teacher;
import com.mmendoza.entities.TeamSport;
import com.mmendoza.utilities.Utilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person[] arrayPersons = {new Person("Juan"), new Person("Matias"), new Person("Rodolfo")};

        Integer[] arrayToInt = {1, 2, 3, 4, 5, 6};

        Float[] arrayToFloat = {1.5f, 2.5f};

        List<Person> listPerson = Utilities.arrayToList(arrayPersons);

        Utilities.arrayToList(arrayToInt);

        Utilities.arrayToList(arrayToFloat);

        listPerson.stream().forEach(p -> System.out.println(p.getName()));


        Student student = new Student();

        Student student2 = new Student();

        Teacher teacher = new Teacher();

        int resultStudent = compare(student, student2);

        //int resultTeacher = compare(student, teacher); --> not applicable

        System.out.println(resultStudent);
    }

    /*
     * passing data that implements the comparable interface
     * We limit the generic method
     */
    public static <T extends Comparable<T>> int compare(T object1, T object2) {
        return object1.compareTo(object2);
    }
}