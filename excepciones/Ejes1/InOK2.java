import java.util.Scanner;

public class InOK2 {
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven",
                                                 "Brahms", "Mahler", "Bartok"           };

    private static Scanner sc = new Scanner(System.in);

    public static void LeeInt (){
       
        try {
            int num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("No es un entero");
        }

    }

    public static void LeeIntPos() {
        
        try {
            int num = sc.nextInt();
            if(num< 0) throw new Exception("positivo");
        } catch (Exception e) {
            System.out.println("No es un entero " + (e.getMessage()==null?  "" : e.getMessage()));
            sc.nextLine();
        }
    }

    public static void LeeIntRango() {
        try {
            int num = sc.nextInt();
            if (num < 0 || num > 100) throw new Exception("Esta fuera del rango");
        } catch (Exception e) {
            System.out.println(e.getMessage()==null? "No es un número" : e.getMessage());
            sc.nextLine();
        }

    }

    public static void LeeDou() {
        try {
            double num = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("No es un número real");
        }

    }

    public static void LeeDouRango() {
        try {
            Double num = sc.nextDouble();
            if (num < 0 || num > 100) throw new Exception("Esta fuera del rango");
        } catch (Exception e) {
            System.out.println(e.getMessage()==null? "No es un número real" : e.getMessage());
            sc.nextLine();
        }
        
    }


    public static void LeeString() {
        String texto = "";
        int i = 0;
        try {
            String a = sc.next();
            for (String c : COMPOSITORES) {
                if (a.equals(c)) texto = "Posición: " + i;
                i++;
            }
            if (texto.equals("")) throw new Exception("ElementoNoExistente");
            else System.out.println(texto); 
        } catch (Exception e)  {
            System.out.println(e.getMessage());
            sc.nextLine();
        }

    }
    public static void main(String[] args) {
              
        LeeString();

    }
}