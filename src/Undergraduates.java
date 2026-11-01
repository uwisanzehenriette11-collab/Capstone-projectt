public class Undergraduates extends Student{
    private double[]GraduateGrade;

    public Undergraduates(double[] GraduateGrade,String program,String name,String address,int id){
        super(program,name,address,id);
        this.GraduateGrade=GraduateGrade;

    }
    @Override
    public double calculateGPA(){
        double total = 0;
        for(double grade:GraduateGrade) {
            total +=grade;

        }

        double average =total/ GraduateGrade.length;
        return average/100 *5;
    }


}
