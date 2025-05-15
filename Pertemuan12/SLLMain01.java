package Pertemuan12;

public class SLLMain01 {
    public static void main(String[] args) {
        SingleLinkedList01 sll = new SingleLinkedList01();


        
        mahasiswa01 mhs1 = new mahasiswa01("24212200","Alvaro" ,"1A", 4.0);
        mahasiswa01 mhs2 = new mahasiswa01("22212202","Cintia" ,"3C", 3.5);
        mahasiswa01 mhs3 = new mahasiswa01("23212201","Bimon" ,"2B", 3.8);
        mahasiswa01 mhs4 = new mahasiswa01("21212203","Dirga" ,"4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa Bimon berada di index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
