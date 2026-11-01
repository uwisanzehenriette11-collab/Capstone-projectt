
public class Graduates extends Student {

    private double[] graduateGrade;
    private double[] capstoneGrade;

    public Graduates(double[] graduateGrade, String program,
                    String name, String address, int id,
                    double[] capstoneGrade) {

        super(program, name, address, id);

        this.graduateGrade = graduateGrade;
        this.capstoneGrade = capstoneGrade;
    }

    @Override
    public double calculateGPA() {

        double total = 0;

        for (double grade : graduateGrade) {
            total += grade;
        }

        for (double grade : capstoneGrade) {
            total += grade;
        }

        double totalGrades = graduateGrade.length + capstoneGrade.length;

        double average = total / totalGrades;

        return average / 100 * 5;
    }
}
