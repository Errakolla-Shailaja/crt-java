class Employee {
    int empno;
    String name;
    double salary;
    void get(int x,String y,double z){
        empno=x;
        name=y;
        salary=z;
    }
    void show(){
        System.out.println(empno+" "+name+" "+salary);
    }
}
    class EmployeeTest{
    public static void main(String[] args) {
        Employee E1=new Employee();
        E1.get(501,"vicky",50000.00);
         Employee E2=new Employee();
        E2.get(502,"chinnu",35000.00);
       E1.show();
       E2.show();
    }
}