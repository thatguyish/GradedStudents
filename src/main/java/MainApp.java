public class MainApp {
    public static void main(String[] args) {
        Double[] testScores1 = {89d,97d,23d};
        Double[] testScores2 = {25d,90d,77d};
        Double[] testScores3 = {50d,60d,82d};

        Student student1 = new Student("Joe","Randerson",testScores1);
        Student student2 = new Student("Bob","Randolphy",testScores2);
        Student student3 = new Student("Able","Linconl",testScores3);
        Classroom classroom = new Classroom();

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        for (Student student : classroom.getStudents()){
            System.out.println(student);

        }

    }
}
