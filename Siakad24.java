import java.util.Scanner;

public class Siakad24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama,nim;
        char kelas,nilaiHuruf;
        byte absen;
        
        double nilaiKuis,nilaiTugas,nilaiUjian,nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas:");
        nilaiTugas =sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian:");
        nilaiUjian =sc.nextDouble();
        nilaiAkhir = ( nilaiKuis+nilaiTugas+nilaiUjian ) / 3;
        System.out.println("Nama : "+ nama +  " Nim:" + nim);
        System.out.println("Kelas: "+kelas   + " Absen:" +absen);
        System.out.println("Nilai Akhir: "+ nilaiAkhir);
        
switch (nilaiHuruf) {
    case 'A':
        
        break;

    default:
        break;
}
    }
}