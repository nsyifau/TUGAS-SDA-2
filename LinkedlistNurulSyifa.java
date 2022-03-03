import java.util.LinkedList;

public class LinkedlistNurulSyifa {
    public static void main(String[] args) {
        System.out.println("------Tugas 2 SDA LinkedList------");
        System.out.println("Nama :Nurul Syifa Utami");
        System.out.println("NIM : 2111523014");
        System.out.println("----------------\n");

        System.out.println("Tugas Linkedlist");

        LinkedList<String> saya = new LinkedList<String>();
        saya.add("N");
        saya.add("U");
        saya.add("R");
        saya.add("U");
        saya.add("L");
        saya.add(" ");
        saya.add("S");
        saya.add("Y");
        saya.add("I");
        saya.add("F");
        saya.add("A");
        saya.add(" ");
        saya.add("U");
        saya.add("T");
        saya.add("A");
        saya.add("M");
        saya.add("I");


        System.out.println(saya);
        System.out.println("size = "+saya.size());

        //No 1. Add LinkedList
        saya.addFirst("A");
        saya.addLast("Y");
        System.out.println("\nHASIL SETELAH DITAMBAH (DEPAN & BELAKANG) = "+saya);
        System.out.println("Size = "+saya.size());

        saya.add("O");
        saya.add("P");
        System.out.println("HASIL SETELAH DITAMBAH = "+saya);
        System.out.println("Size = "+saya.size());

        //No 2. set linkedlist 
        saya.set(2,"Y" );
        saya.set(6,"P" );
        saya.set(9,"R" );
        saya.set(11,"Z" );

        System.out.println("\nHASIL SETELAH DISISIPKAN = "+saya);
        System.out.println("size = "+saya.size());

        //No 3. remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("\nHASIL SETELAH DIHAPUS (DEPAN & BELAKANG) = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(0);
        saya.remove(3);
        saya.remove(5);
        saya.remove(8);
        saya.remove(10);
        System.out.println("HASIL SETELAH DIHAPUS = "+saya);
        System.out.println("Size = "+saya.size());

        //No 4. pop and push
        saya.pop();
        System.out.println("\nHASIL SETELAH di-POP = "+saya);
        System.out.println("Size = "+saya.size());

        saya.push("W");
        saya.push("Z");
        System.out.println("\nHASIL SETELAH di-PUSH = "+saya);
        System.out.println("Size = "+saya.size());
        

    }
    
}