import javax.swing.undo.StateEdit;

public class F3 {
    static class Person{
        int age;
        String name;
        void sayHi(){
            System.out.println(this.name+" ---" + this.age);
        }
    }
    public static void main(String []args){

        Person p1 = new Person();
        p1.name="rakesh";
        p1.age=20;

        Person p2 = new Person();
        p2.name="reddy";
        p2.age=22;

        //not swap
        swap(p1,p2);
        p1.sayHi();;
        p2.sayHi();


        //swap
        Person tmp;
        tmp=p1;
        p1=p2;
        p2=tmp;

        p1.sayHi();
        p2.sayHi();

        //call by value swap values
        swap1(p1, p2);
        p1.sayHi();
        p2.sayHi();

    }
    static void swap1(Person a, Person b){
        int tage = a.age;
        a.age=b.age;
        b.age=tage;

        String tname = a.name;
        a.name=b.name;
        b.name=tname;
    }
    static void swap(Person a, Person b){
        Person tmp = a;
        a=b;
        b=tmp;
    }
    
}
