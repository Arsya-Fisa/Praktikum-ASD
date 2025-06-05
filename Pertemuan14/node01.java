public class node01 {
    Mahasiswa01 mahasiswa;
    node01 left, right;

    public node01() {

    }

    public node01(Mahasiswa01 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}
