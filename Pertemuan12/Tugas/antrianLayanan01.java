package Pertemuan12.Tugas;

public class antrianLayanan01 {
    public node01 front, rear;
    public int size = 0;
    public int maxSize = 5;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == maxSize;
    }
     public void clear() {
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        } else {
            System.out.println("Antrian sudah kosong");
        }
    }
    public void tambahAntrian(mahasiswa01 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        node01 newNode = new node01(mhs, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs );
        System.out.println( "berhasil masuk ke antrian.");
    }
    public void hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dihapus.");
            return;
        }
       System.out.println(front.data + " ->> di panggil dari antrian.");
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }
    public void lihatterdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa di depan antrian: " + front.data);
        } else {
            System.out.println("Antrian kosong.");
            
        }
    }
    public void lihatterbelakang() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa di belakang antrian: " + rear.data);
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void jumlahantrean() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
    
    public void tampilkanantrean() {
        if (isEmpty()) {
            System.out.println("Antrean Kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrean:");
        node01 temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
