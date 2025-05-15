package Pertemuan12.Tugas;

public class mahasiswa01 {
    
    String nama;
    String nim;
    String kelas; 

    mahasiswa01(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

   public String toString() {
        return nim + " - " + nama + " - " + kelas;
    }
}


