package dll;
import java.util.Scanner;
public class main {


   public static mahasiswa01 inputMahasiswa(Scanner scan) {
    System.out.print("Masukkan NIM: ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama: ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas: ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK: ");
    double ipk = scan.nextDouble();
    scan.nextLine(); 

    return new mahasiswa01(nim, nama, kelas, ipk);
}
    public static void main(String[] args) {
       doublelinkedlist01 list = new doublelinkedlist01();
       Scanner scan = new Scanner(System.in);
       int pilihan;
       
       do {
        System.out.println("\nMenu Double Linked List Mahasiswa");
        System.out.println("1. Tambah di awal");
        System.out.println("2. Tambah di akhir");
        System.out.println("3. Hapus dari awal");
        System.out.println("4. Hapus dari akhir");
        System.out.println("5. Tampilkan data");
        System.out.println("6. Cari mahasiswa berdasarkan NIM");
        System.out.println("7. Insert after");
        System.out.println("8. Add");
        System.out.println("9. RemoveFirst");
        System.out.println("10. Remove index");
        System.out.println("11. Getfirst, Getlast");
        System.out.println("12. Get index");
        System.out.println("13. Get Size");
        System.out.println("0. Keluar");
        System.out.print("pilih menu: ");
        pilihan = scan.nextInt();
        scan.nextLine();

         switch (pilihan) {
                case 1 -> {
                    mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addfirst(mhs);
                }
                case 2 -> {
                    mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addlast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast(); 
                case 5 -> list.print();
                case 6 -> {
                     System.out.print("Masukkan NIM yang dicari: ");
                     String nim = scan.nextLine();
                    node01 found = list.search(nim);
                    if (found != null) {
                         System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                         System.out.println("Data tidak ditemukan.");
                    }
                 }
                 case 7 -> {
                     System.out.print("Masukkan NIM yang dicari: ");
                     String nim = scan.nextLine();
                     System.out.print("Masukkan data mahasiswa baru: ");
                     mahasiswa01 mhs = inputMahasiswa(scan);
                     list.insertAfter(nim, mhs);
                 }
                 case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = Integer.parseInt(scan.nextLine());
                    mahasiswa01 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                 }
                 case 9 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                 }
                 case 10 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int index = Integer.parseInt(scan.nextLine());
                    list.remove(index);
                 }
                 case 11 -> {
                    System.out.println("Data mahasiswa pertama: ");
                    list.getFirst();
                    System.out.println("Data mahasiswa terakhir: ");
                    list.getLast();
                 }
                 case 12 -> {
                    System.out.print("Masukkan indeks yang ingin diambil: ");
                    int index = Integer.parseInt(scan.nextLine());
                    mahasiswa01 mhs = list.getIndex(index);
                    if (mhs != null) {
                        mhs.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                 }
                    case 13 -> {
                        System.out.println("Jumlah data dalam list: " + list.size());
                    }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
       }
    } while (pilihan != 0); 
        scan.close();
}
    
}

