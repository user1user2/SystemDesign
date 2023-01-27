import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class F6 {
    public static void main(String[] args){

        //Employee emp = new Employee() ;
        List<Integer> out = Arrays.asList(1,2,3,4);
        Hr obj = new Hr();
        Employee o = new Hr(null, "rakesh", 0);
        o.doWork();
        obj.doWork();
    }
    

static abstract class Employee{
    String name;
    int empId;

    Employee(){};

    Employee(String a,int e){
        this.empId=e;
        this.name=a;

    }

    void markAttend(){
        System.out.println(name+" presnt");
    }
    abstract void doWork();  //no-body for abstract method
}

static class Hr extends Employee{

    List<Employee> salries;
    
    Hr(){}
    Hr(List<Employee> salries,String name,int empId){
        super(name,empId);
        // this.name=name;
        // this.empId=empId;
        this.salries=salries;
    }
    void doWork(){
    System.out.println(name+"create payrolls");
}
}
}

