import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students){
        this.students = students;
    }
    public Classroom(){
        this(new Student[30]);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double totalAverageScore = 0d;
        for(Student student : students){
            totalAverageScore+=student.getAverageExamScore();
        }
        return totalAverageScore/students.length;
    }

    public void addStudent(Student student){
        ArrayList<Student> studentsAsList = new ArrayList<>();
        for (Student curStudent : students){
            if(!Objects.isNull(curStudent)){
                studentsAsList.add(curStudent);
            }
        }
        if (studentsAsList.size()<30){
            studentsAsList.add(student);
        }
        Student[] studentsAsArray = new Student[studentsAsList.size()];
        studentsAsArray = studentsAsList.toArray(studentsAsArray);
        this.students = studentsAsArray;
    }

    public void removeStudent(String firstName, String lastName){
        ArrayList<Student> studentsAsList = new ArrayList<Student>(List.of(students));
        for (Student student : students){
            if (student.getLastName().equals(lastName) && student.getFirstName().equals(firstName)){
                studentsAsList.remove(student);
            }
        }
        students = (Student[])studentsAsList.toArray();
    }
    public Student[] getStudentsByScore(){
        return (Student[])Arrays.stream(students).sorted().toArray();
    }

    public void getGradeBook(){
        ArrayList<Student> studentsAsList = new ArrayList<Student>(List.of(students));
        Double maxNumber = studentsAsList.stream().max((x,y)->{return x.getAverageExamScore().compareTo(y.getAverageExamScore());}).get().getAverageExamScore();
        Double gradingCurve = 100-maxNumber;
        System.out.println(gradingCurve);
    }


}
