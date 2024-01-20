package entities;

public class AverageCalculator {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public String result;

    public double FinalGrade(){
        double finalGrade = grade1 + grade2 + grade3;
        return finalGrade;
    }

    public String Result(){
        if (FinalGrade() < 60){
              result = "failed";
        }else {
              result = "Pass";
        }
        return result;
    }

    public double MissingPoints(){
        return 60 - FinalGrade();
    }
}
