package chapter12.chapter12exercise;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {

        Map<String, Integer> firstTest = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpTest = TestResults.getMakeUpGrades();
        System.out.println("Final Grades: ");
        System.out.println("++++++++++++++++++++++++++++");
        for (var student : makeUpTest.entrySet()) {
            Integer firstGrade = firstTest.get(student.getKey());
            Integer secondGrade = makeUpTest.get(student.getKey());

            if(secondGrade > firstGrade) {
                firstTest.put(student.getKey(), secondGrade);
            }
            System.out.println("Student: " + student.getKey() + ", Grade: " + firstTest.get(student.getKey()));
        }

//        System.out.println("Final Grades: ");
//        firstTest.forEach((k, v) -> System.out.println("Student: " + k + ", Grade: " + v));
    }
}
