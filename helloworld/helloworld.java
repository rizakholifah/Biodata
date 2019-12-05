public class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World !");
        mobil bmw = new mobil();
        bmw.merk = "BMW i3000";
        bmw.maju();

        mobil fordshelby = new mobil();
        fordshelby.merk = "Fordshelby";
        fordshelby.maju();
    }
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" Majuu... !!! brmm....");
    }
}