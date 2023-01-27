/**
 * F1
 */
public class F1 {

    static class Person{
        int age;
        String name;

        //method 
        void getPerson(){
            System.out.println("Person name is "+this.name+"ange is :"+this.age);
        }
    }

    public static void main(String []args){
        Person p1;   //reference decaration
        p1 = new Person();  //instance declaration

        p1.getPerson();
        Person p2 = new Person(); // anodher instance which mean diffrent memory allocation
        p2.getPerson();

        Person p3 = p2; // Reference, not different memory allocation same memory refered with variable obj.

    }
}