package T1.materials_grp1;

public class Student {
    private String id;
    private int[] workGrades;

    public Student(String id) {
        this.id = id;
        this.workGrades = new int[5];
    }

    public void updateWork(int work, int grade) {
        this.workGrades[work - 1] = grade;
    }

    public double computeAvg() {
        double sum = 0;
        for (int i = 0; i < this.workGrades.length; i++)
            sum += this.workGrades[i];
        return sum / this.workGrades.length;
    }

    public void show() {
        System.out.println("T5.Practice2.Student ID:" + this.id);
        System.out.println("Work grades:");
        for (int i = 0; i < this.workGrades.length; i++)
            System.out.println(i + 1 + " : " + this.workGrades[i]);
    }
}


