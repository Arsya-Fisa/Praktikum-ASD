public class BinaryTreeAray01 {
    Mahasiswa01 [] dataMahasiswa;
    int idxLast;

    public BinaryTreeAray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
        this.idxLast = -1; // Indeks terakhir yang berisi data
    }

    // void popularData(Mahasiswa01 dataMhs[], int idxLast) {
    //     this.dataMahasiswa = dataMhs;
    //     this.idxLast = idxLast;
    // } 

    void traversalInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traversalInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traversalInOrder(2*idxStart+2);
            }
        }
    }
    public void add(Mahasiswa01 mahasiswa) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = mahasiswa;
        } else {
            System.out.println("Array sudah penuh, tidak bisa menambah data");
        }
}
    public void traversalPreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversalPreOrder(2*idxStart+1);
                traversalPreOrder(2*idxStart+2);
            }
        }
    }
}
