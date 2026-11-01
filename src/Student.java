public abstract class   Student extends Member {
    private String  program;

    public Student(String program,String name,String address,int id){
        super(name,address,id);
        this.program = program;
    }

    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }

    public abstract double calculateGPA();

    @Override
    public String toString(){
        return "program" + program +"," +super.toString();
    }
}
