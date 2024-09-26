import java.util.Scanner;

public class kafe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
         System.out.print("Masukkan Menu :  ");
         menu = sc.nextLine();
         System.out.print("Masukkan ukuran cup : ");
         ukuranCup =sc.next().charAt(0);
         System.out.print("masukkan jumlah :");
         jumlah = sc.nextInt();
         System.out.print("masukkan keanggotaan (true/false ): ");
         keanggotaan = sc.nextBoolean();
          double hargamenu = 0;

          switch (menu.toLowerCase()) {
            case "kopi":
            hargamenu = 12000;
                
                break;
            case "Teh":
            hargamenu = 7000;
                
                break;
            case "coklat":
            hargamenu = 20000;
                
                break;
          
            
          }
          double totalHarga = hargamenu *jumlah;

          switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 *totalHarga;
                break;
            case 'L':
            totalHarga += 0.4 *totalHarga;
                
                break;
          
            default:
                break;
          }
          double diskon = keanggotaan ? 0.1 : 0;
          double nominalbayar = totalHarga - (diskon *totalHarga);
          

          System.out.println("item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
          System.out.println("Nominal bayar: " + nominalbayar);
    }
}
