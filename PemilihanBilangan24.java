// import java.util.Scanner;

// public class PemilihanBilangan24 {

//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Masukkan angka: ");
//     int angka = sc.nextInt();
//     if (angka % 2 == 0 ) 
//     {
//       System.out.println("angka " + angka + " termasuk genap");  
      
//     } 
//     else
//     {
//         System.out.println("angka " + angka + " termasuk ganjil");
//     }   
//     }
// }
import java.util.Scanner;

public class PemilihanBilangan24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String hasil = (angka % 2 == 0) ? "angka " + angka + " termasuk genap" : "angka " + angka + " termasuk ganjil";

        System.out.println(hasil);
    }
}
