package Pertemuan12;
import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList01 sll = new SingleLinkedList01();
        System.out.println("Masukkan data 4 mahasiswa:");
        mahasiswa01[] mhs = new mahasiswa01[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            mhs[i] = new mahasiswa01(nim, nama, kelas, ipk);
        }

        sll.print();
        sll.addFirst(mhs[3]);
        sll.print();
        sll.addLast(mhs[0]);
        sll.print();
        sll.insertAfter(mhs[3].nama, mhs[2]);
        sll.insertAt(2, mhs[1]);
        sll.print();

    }
}
