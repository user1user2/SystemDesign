public class F2 {

    static class Point{
        int x;
        int y;

    }
    static class Rectangle{
        Point tl;
        void getSum(){
            int sum = tl.x+tl.y;
            System.out.println(sum);
        }
        Point br;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.tl = new Point();  //instantiating and refering to it
        r1.tl.x=2;
        r1.tl.y=4;
        r1.getSum();
        

        
    }
    
}
