package P2Jobsheet10;

public class AntianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int max;
    int size;

    public AntianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
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
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tdiak dapat menambah mahasiwa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasi masuk ke antrian.");
    }
    public Mahasiswa layaaniMahasiswa(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosng");
        } else {
            System.out.println("Mahasiswa terdepn: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
}
