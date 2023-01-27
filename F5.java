public class F5 {
    String name;
    int age;


    F5(String a,int b){
        this.age = b;
        this.name=a;
        System.out.println(a+" "+b);
    }
    F5(){
        this(1);
        
        System.out.println("THis is a constercter F5");

    }

    F5(int a){
        System.out.println("THis si parameter constructer : "+a);
    }
    public static void main(String []args){
        F5 obj = new F5(); //Error,if we write paramaterised const then we must add default constructor,with out it we get error
                          
        obj = new F5(1);

    }
    
}