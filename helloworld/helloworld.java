public class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World !");
        mobil bmw = new mobil();
        bmw.merk = "BMW i3000";
        bmw.maju();

        mobil fordshelby = new mobil();
        fordshelby.merk = "Fordshelby";
        fordshelby.maju();

        if(args.length == 0){
            System.out.println("No Launch Data !!!");
        }
        else{
            System.out.println(args[1]+args[0]);
        }
    }
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" Majuu... !!! brmm....");
    }
}