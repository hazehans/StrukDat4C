public class Kota <E>{
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di JaTim : " + jumlahKota.getElement() + " kota");
        System.out.println("Salah satu kota di JaTim : Kota " + namaKota.getElement());
    }
}

// output yang dikeluarkan :
// Jumlah kota di JaTim : 9 kota
// Salah satu kota di JaTim : Kota Malang

