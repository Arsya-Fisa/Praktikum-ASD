import P2Jobsheet10.Mahasiswa;

public class LayananKRS {
    Maahasiswa01[] data;
    int front;
    int rear;
    int max;
    int size;
    int jumlahdiproses = 0;
    int maxDpa = 30;

    public LayananKRS(int max){
        this.max = max;
        this.data = new Maahasiswa01[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    public void clear(){
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        } else {
            System.out.println("Antrian sudah kosong");
        }
    }
    public void tambahAntrian(Maahasiswa01 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tdiak dapat menambah mahasiwa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasi masuk ke antrian.");
    }
    public void MemanggilMahasiswa(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, proses KRS tidak bisa dilakukan!");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
    for (int i = 0; i < 2; i++) {
        if (data[front] != null) {
            System.out.print("- ");
            data[front].tampilkanData();
        }
        data[front] = null;
        front = (front + 1) % max;
        size--;
            jumlahdiproses++;
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void tampilkan2Terdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa dalam antrian:");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Mahasiswa terdepan dalam antrian:");
            int index = front;
            for (int i = 0; i < 2; i++) {
                if (data[index] != null) {
                    System.out.print("- ");
                    data[index].tampilkanData();
                }
                index = (index + 1) % max;
            }
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa di akhir antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void cetakKRS(){
        System.out.println("Jumlah mahasiswa yang sudah diproses: " + jumlahdiproses);
    }
    public void jumlahBelumDiproses(){
        System.out.println("Jumlah mahasiswa yang belum diproses: " + (maxDpa - jumlahdiproses));
    }
}
