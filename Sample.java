import java.util.Calendar;

public class Sample {

    //Pattren Matching --  16.Pattren Matching InstanceOf : allows us to cast our variable inline and use it inside the desired if-else block with-out explicitly casting it
    
    static class Vehical {
        String code;
        String eng;
        
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getEng() {
            return eng;
        }
        public void setEng(String eng) {
            this.eng = eng;
        }
    }
    static class Car extends Vehical{
        Long kilometers;
        Long year;

        public Car(String code, String engineType, Long kilomenters, Long year) {
            //super(code, engineType);
            this.kilometers = kilomenters;
            this.year = year;
        }
    }
    static class Bicycle extends Vehical{
        String type;
        Long wheelSize;
    
        public Bicycle(String code, String engineType, String type, Long wheelSize) {
           // super(code, engineType);
            this.type = type;
            this.wheelSize = wheelSize;
    }
}

    public static double price(Vehical v) {
        if (v instanceof Car c) {
            return 10000 - c.kilometers * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

    public static double priceOld(Vehical v) {
        if (v instanceof Car) {
            Car c = (Car) v;
            return 10000 - c.kilometers * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle) {
            Bicycle b = (Bicycle) v;
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();

    }




    public static void main(String []args){


        //Patren Maching instanceof:
        Car car = new Car("Kia", "Gas", 10000l, 2021l);
        Bicycle bicycle =
                new Bicycle("Greyp", "Electricity", "Mountain", 21l);

        System.out.println("Car:" + price(car));
        System.out.println("Bycicle: " + price(bicycle));
    

    

    int num = 5;
    num = 0 ;
    String p = "";

    //beforre
    switch(num){
        case  0:
            
             System.out.println("ok");
            
             break;   //the break statemenr is compalsery
        case 1:
             System.out.println("Not ok");
        default : System.out.println("Check");
    }  

    //yield keyword in switch case
    int val = switch(num){
        case 1 -> {
            System.out.println("blocj message of 1");
            yield 1;
        }
        case 0 -> { System.out.println("THis is case 2 block") ; yield 0;  }
        default -> {
            System.out.println("Nothing to pring ");
            yield 0;
        }
        };
        System.out.println(val);

        //text Blocks  -- to format the string syntack

        System.out.println("""
                <!DOCTYPE html>
                <html>
                    <head>
                       <meta></meta>
                       <titile></title>
                    </head>
                </html>
                """);
    
    
    

    
    //apdated switch case:
    String num1 = switch(num){
        case 0 ->  "ok";
        case 1 -> "not ok";
        default -> "check";

    };
    System.out.println(num1);
}
    
    

}

