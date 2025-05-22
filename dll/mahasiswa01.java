package dll;

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
    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
    
}
