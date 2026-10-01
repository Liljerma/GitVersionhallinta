public class TulostinGIT {
    public static void main(String[] args) throws Exception {
        
        double luku1 = 8;
        double luku2 = 12;
        double tulo = luku1 * luku2;
        double summa = luku1 + luku2;
        double erotus = luku1 - luku2;
        double jako = luku1 / luku2;
        
        
        System.out.println("***************************");
        System.out.println("Hei olen Tulostin-ohjelma!");
        System.out.println("***************************");
        System.out.println("   ");

        String tekija = "Ohjelman tekijä: Matias";

        System.out.println(tekija);
        System.out.println("     ");

        System.out.println("Luku yksi on " + luku1);
        System.out.println("Luku yksi on " + luku2);

        System.out.println("    ");
        
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);


    }
}
