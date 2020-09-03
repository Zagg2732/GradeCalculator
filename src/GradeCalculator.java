import java.util.ArrayList;

public class GradeCalculator {
    public final String name;
    public final double currentScore;
    public final int currentCredit;

    private final ArrayList<Course> courses = new ArrayList<>();

    public GradeCalculator(String name, double currentScore, int currentCredit) {
        this.name = name;
        this.currentScore = currentScore;
        this.currentCredit = currentCredit;
    }

    public void addCourse(Course course){
        //과목 추가만 addCourse에서 하고 print에서 계산 및 출력 담당

        courses.add(course);
    }

    public void print(){
        System.out.println("직전 학기 성적: " + currentScore + " (총 " + currentCredit + "학점)");

        double scorSum = 0;
        int creditSum = 0;

        for (Course c : courses){
            scorSum += c.getScore() * c.credit; //성적 * 학점
            creditSum += c.credit; // 총 학점
        }
        System.out.println("이번 학기 성적: " + (scorSum / creditSum) + " (총 " + creditSum + "학점)");

        double totalScore = currentScore * currentCredit + scorSum;
        int totalCredit = currentCredit + creditSum;

        System.out.println("이번 학기 성적: " + (totalScore / totalCredit) + " (총 " + totalCredit + "학점)");
    }

}