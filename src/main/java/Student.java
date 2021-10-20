import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName,String lastName,Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;

        this.examScores = new ArrayList<>(Arrays.asList(testScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        int examCounter = 0;
        String scoresAsString = "";
        for (Double exam : examScores) {
            examCounter++;
            scoresAsString+= "Exam"+examCounter+" -> "+exam+"\n";
        }
        return scoresAsString;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber,double newScore){
        examScores.set(examNumber,newScore);
    }

    public Double getAverageExamScore(){
        double totalExamScores = 0;
        for(Double examScore : examScores){
            totalExamScores+=examScore;
        }
        return totalExamScores/getNumberOfExamsTaken();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}
