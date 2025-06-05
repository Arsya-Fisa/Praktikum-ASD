public class BinaryTreeArayMain01 {
    public static void main(String[] args) {
        BinaryTreeAray01 bta = new BinaryTreeAray01();
        bta.add(new Mahasiswa01("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa01("244160185", "Chandra", "C", 3.41));
        bta.add(new Mahasiswa01("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa01("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa01("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa01("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa01("244160170", "Fizi", "B", 3.86));;
        
        // Mahasiswa01[] dataMhs = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7,null, null, null,}; 
        // int idxLast = 6; 
        // bta.popularData(dataMhs, idxLast);
        System.out.println("\nInorder Traversal mahasiswa: ");
        bta.traversalInOrder(0);

        System.out.println("\ntraversal preorder mahasiswa: ");
        bta.traversalPreOrder(0);
    }

}
