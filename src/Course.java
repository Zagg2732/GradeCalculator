public class Course {

    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    public final String name; //과목명
    public final int credit; // 학점
    public final String grade; // 성적

    public Course(String name, int credit, String grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public double getScore(){
        switch (grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "c":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
                return 0;

        }
        return -1; // 이상한 값이 들어왔을 경우 문제가 있다는 뜻으로 -1 return
    }

}