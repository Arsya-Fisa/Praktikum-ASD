package Pertemuan12.Tugas;
import java.util.Scanner;
public class main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianLayanan01 layanan = new antrianLayanan01();
        int pilihan;

        do {
            System.out.println("\n=== Menu Layanan Akademik ===");
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terbelakang");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Lihat Semua Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (layanan.isFull()) {
                        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
                        break;
                    } 
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    mahasiswa01 mhs = new mahasiswa01(nama,nim, kelas);
                    layanan.tambahAntrian(mhs);
                    break;
                case 2:
                layanan.hapusAntrian();
                    break;
                case 3:
                    layanan.lihatterdepan();
                    break;
                case 4:
                    layanan.lihatterbelakang();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + layanan.size);
                    break;
                case 6:
                    layanan.tampilkanantrean();
                    break;
                case 7:
                    if (layanan.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 8:
                    if (layanan.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                    break;
                case 9:
                    layanan.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

        } while (pilihan != 0);
        sc.close();{
            
        }
    }
}
