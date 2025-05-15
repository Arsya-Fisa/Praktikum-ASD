package Pertemuan12;

public class mahasiswa01 {
   String nim;
    String nama;
    String kelas;
    double ipk;
    
    public mahasiswa01(){

    }
    public mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilkaninformasi() {
        System.out.println(nama + " - " + nim + " - " + kelas + " - " + ipk);
    }
}
