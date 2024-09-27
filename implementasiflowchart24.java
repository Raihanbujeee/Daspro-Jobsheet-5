import java.util.Scanner;

public class implementasiflowchart24 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String kategori;
        byte usia;

        System.out.print("Masukkan usia anda : ");
        usia = input.nextByte();

        if (usia >=0 && usia <=12) {
            kategori = "Anak";
        }
        else if (usia >=13 && usia <=19){
            kategori = "Remaja";
        }
        else if (usia >=20 && usia <=64){
            kategori = "Dewasa";
        }
        else if (usia >65){
            kategori = "Lansia";
        }
        else {
            kategori = "input tidak valid";
        }
        
        System.out.println("Usia Anda temasuk kategori: " + kategori);

    }
}
