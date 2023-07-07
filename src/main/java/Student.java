import java.util.ArrayList;

public class Student {
    long id ;
    String name;
    ArrayList<Integer> grades;
    Student(long id, String name, ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int sum =0;
        for(int grade: grades){
            sum+=grade;
        }
        return (double) sum/grades.size();
    }
}
