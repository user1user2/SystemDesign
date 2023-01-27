public class Bank {
    static class Bankdetails{
            int anumber;
            float balence;
            static float roi;

    void message(){
        System.out.println(this.anumber+" --" + this.balence+" "+this.roi);
    }
}
    public static void main(String []args){

        Bankdetails obj1 = new Bankdetails();
        obj1.anumber=11;
        obj1.balence=12;
        Bankdetails.roi=22;

        obj1.message();

        Bankdetails obj2 = new Bankdetails();
        obj2.anumber=23;
        obj2.balence=34;
        obj2.roi=34;
        //changing the static content from instance will affect the class static variable
        obj2.message();
        obj1.message();
        
    }
}
