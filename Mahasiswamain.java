import java.util.Scanner;
public class Mahasiswamain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LayananKRS layanan = new LayananKRS(10);
        int pilihan;
        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil Antrean");
            System.out.println("3. Tampilkan semua Antrian");
            System.out.println("4. Tampilkan 2 terdepan");  
            System.out.println("5. lihat mahasiswa paling akhir");
            System.out.println("6. jumlah mahasiswa belum diproses");
            System.out.println("7. jumlah antrean");
            System.out.println("8. Cetak KRS");
            System.out.println("9. hapus semua Antrean");
            System.out.println("10. cek antrian kosong");
            System.out.println("11. cek antrian penuh");
            System.out.println("0. keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Maahasiswa01 mhs = new Maahasiswa01(nim, nama, prodi, kelas);
                    layanan.tambahAntrian(mhs);
                    break;
                case 2:
                    layanan.MemanggilMahasiswa();
                    break;
                case 3:
                    layanan.tampilkanSemua();
                    break;
                case 4:
                    layanan.tampilkan2Terdepan();
                    break;
                case 5:
                    layanan.lihatAkhir();
                    break;
                case 6:
                    layanan.jumlahBelumDiproses();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + layanan.getJumlahAntrian());
                    break;
                case 8:
                    layanan.cetakKRS();
                    break;
                case 9:
                    layanan.clear();
                    break;
                case 10:
                    if (layanan.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                        
                    }
                    break;
                case 11:
                    if (layanan.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                        
                    }
                    break;
                case 0:
                    System.out.println("Terima kasil");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");;            
                    break;
            }
        } while (pilihan != 10); {
            
        }
    }
}
