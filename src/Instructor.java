public class Instructor extends Member {
    private String department;

    public Instructor(String department,String name,String address,int id){
        super(name,address,id);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    @Override
    public String toString(){
        return department + ","+super.toString();
    }

}
