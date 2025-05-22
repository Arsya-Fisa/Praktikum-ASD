package dll;

public class doublelinkedlist01 {
    node01 head;
    node01 tail;

    public doublelinkedlist01() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addfirst(mahasiswa01 data) {
        node01 newnode = new node01(data);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    public void addlast(mahasiswa01 data) {
        node01 newnode = new node01(data);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }
    }
    public void insertAfter(String keyNim, mahasiswa01 data) {
        node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        node01 newnode = new node01(data);
        if (current == tail) {
            current.next = newnode;
            newnode.prev = current;
            tail = newnode;
        } else {
            newnode.next = current.next;
            newnode.prev = current;
            current.next.prev = newnode;
            current.next = newnode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM: " + keyNim);
    } 
    public void print() {
        node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public node01 search(String nim) {
    node01 current = head;
    while (current != null) {
        if (current.data.nim.equals(nim)) {
            return current; 
        }
        current = current.next;
    }
    return null; 
}
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
            return;
        }
        mahasiswa01 dataterhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus. Data yang dihapus: ");
        dataterhapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
            return;
        }
         mahasiswa01 dataterhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
         System.out.println("Data berhasil dihapus. Data yang dihapus: ");
        dataterhapus.tampil();
    }
    public void add(int index,mahasiswa01 data) {
        if (index < 0) {
            System.out.println("Indexk tidak valid.");
            return;
        }
        if (index == 0) {
            addfirst(data);
            return;
        }
        node01 current = head;
    int currentIndex = 0;

    while (current != null && currentIndex < index) {
        current = current.next;
        currentIndex++;
    }
     if (current == null) {
        addlast(data);
        return;
    }
         node01 newnode = new node01(data);
         newnode.prev = current.prev;
         newnode.next = current;

         current.prev.next = newnode;
         current.prev = newnode;

    System.out.println("Node berhasil ditambahkan pada indeks ke-" + index);
    }
    public void removeAfter(String keyNIM) {
        node01 current = head;

         while (current != null && !current.data.nim.equals(keyNIM)) {
        current = current.next;
    }

        if (current == null || current.next == null) {
        System.out.println("Tidak bisa menghapus: NIM tidak ditemukan atau tidak ada node setelahnya.");
        return;
    }
         node01 hapus = current.next;
         current.next = hapus.next;

        if (hapus.next != null) {
        hapus.next.prev = current;
    } else {
        tail = current;
    }
    System.out.println("Data setelah NIM " + keyNIM + " berhasil dihapus:");
    hapus.data.tampil();
}
    public void remove(int indek) {
        if (isEmpty()) {
            return;
        }
        if (indek < 0) {
            return;
        }
         node01 current = head;
    for (int i = 0; i < indek && current != null; i++) {
        current = current.next;
    }
    if (current == null) {
        System.out.println("Indeks tidak valid.");
        return;
    }
    System.out.println("Data di indeks ke-" + indek + " berhasil dihapus:");
    current.data.tampil();
        if (current == head) {
        head = head.next;
    if (head != null) head.prev = null;
        else tail = null;
    } else if (current == tail) {
        tail = tail.prev;
        tail.next = null;
    } else {
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
    }
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data terdepan: ");
        head.data.tampil();
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data terbelakang: ");
        tail.data.tampil();
    }
    public mahasiswa01 getIndex(int index) {
    if (isEmpty()) {
        System.out.println("List kosong.");
        return null;
    }
    if (index < 0) {
        System.out.println("Index tidak valid.");
        return null;
    }
    node01 current = head;
    for (int i = 0; i < index && current != null; i++) {
        current = current.next;
    }
    if (current == null) {
        System.out.println("Index tidak valid.");
        return null;
    }
    return current.data;
}
     public int size() {
        int count = 0;
        node01 current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
    }
    }


