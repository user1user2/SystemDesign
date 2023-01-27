public class F4 {


    static class P{
        int a=1;
        int b= 10;
        void fun(){
            System.out.println("This is P func()");
        }
        void func1(){
            System.out.println("This is a Parent fun1()");
        }
    }
    static class C extends P{
        int a = 2;
        int c = 20;

        void fun(){
            System.out.println("THis si C fun()");

        }
        void fun2(){
            System.out.println("This is C fun2()");
        }
    }
    public static void main(String []args){
         
        P p1 = new P();   //all the parent members are get access
       System.out.println( p1.a);
        System.out.println(p1.b);
        p1.fun();
        p1.func1();
        
        //we are get accesed all the members both P and Child
        C c1 = new C();
        //diff usoing casting of child to parient
        System.out.println(((P)c1).a);
        System.out.println(c1.a);  //conflit resolved by reference
        System.out.println(c1.b);
        
        c1.fun();  
        c1.fun2();
        c1.func1();

        System.out.println(c1.c);


        //parent reference and child instance
        P obj = new C();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c); Execution error , even object is initalized but its not allowed at refrence side

        obj.fun();
        obj.func1();
        //obj.fun2() // not allowed at compiler side if we typecase then it accesed;
        ((C)obj).fun2(); //now it allowed at compiled time.


        //C cc = new P(); its self not allowed by compiler ? why? no data member precente by refrence , No refrence allocation so it wont allow.
        







        
        




    }
}
