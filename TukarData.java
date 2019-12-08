public class TukarData{
    public static void main(String[] args){
        String A = "Merah";
        String B = "Biru";
        String C;

        C = A;
        A = B;
        B = C;

        System.out.println("A isinya "+A);
        System.out.println("B Isinya "+C);

    }
}