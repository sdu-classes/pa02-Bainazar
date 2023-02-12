public class Staff extends Person{
    String school;
    double pay;
    public Staff(String name, String address, String school , double pay){
        super(name , address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public String toString(){
        return "Staff[Person[name="+name+",address="+address+",school="+school+",pay="+pay+"]";
    }
}
