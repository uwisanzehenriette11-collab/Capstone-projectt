
public class Main {
    public static void main(String[] args) {

        double[] undergraduateGrades = {90, 78, 98};

        double[] graduateGrades = {76, 89, 56};

        double[] capstoneGrades = {95};

        Student student1 = new Undergraduates(
                undergraduateGrades, "Politics", "ineza", "Rwanda", 4
        );

        Student student2 = new Graduates(
                graduateGrades, "Water&Electricity", "keza",
                "Gicumbi", 4, capstoneGrades
        );

        System.out.println("Undergraduate information");
        System.out.println(student1);

        System.out.println("Graduate information");
        System.out.println(student2);

        Instructor instructor = new Instructor(
                "IT", "Henriette", "rwanda", 9
        );

        System.out.println("Instructor information");
        System.out.println(instructor);
    }
}
