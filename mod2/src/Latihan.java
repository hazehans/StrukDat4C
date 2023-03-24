import java.util.ArrayList;
import java.util.Arrays;

public class Latihan {
    public static void main(String[] args) {
        // Buat objek Hewan dan DeleteHewan
        ArrayList<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Hewan("Kucing", "Hitam"));
        hewanList.add(new Hewan("Anjing", "Coklat"));
        hewanList.add(new Hewan("Burung", "Merah"));
        hewanList.add(new Hewan("Kuda", "Hitam"));
        hewanList.add(new Hewan("Ikan", "Kuning"));

        ArrayList<DeleteHewan> deleteHewanList = new ArrayList<>();
        deleteHewanList.add(new DeleteHewan("Kucing", "Hitam"));
        deleteHewanList.add(new DeleteHewan("Burung", "Merah"));
        deleteHewanList.add(new DeleteHewan("Ikan", "Biru"));

        // Cek data sebelum dihapus
        System.out.println("Data sebelum dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }

        // Lakukan penghapusan data
        for (DeleteHewan deleteHewan : deleteHewanList) {
            String warna = deleteHewan.getWarna();
            hewanList.removeIf(hewan -> hewan.getWarna().equals(warna));
        }

        // Cek data setelah dihapus
        System.out.println("\nData setelah dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }
    }
}

class Hewan {
    private String jenis;
    private String warna;

    public Hewan(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Hewan{" +
                "jenis='" + jenis + '\'' +
                ", warna='" + warna + '\'' +
                '}';
    }
}

class DeleteHewan {
    private String jenis;
    private String warna;

    public DeleteHewan(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

}

/*
Output :

Data sebelum dihapus:
Hewan{jenis='Kucing', warna='Hitam'}
Hewan{jenis='Anjing', warna='Coklat'}
Hewan{jenis='Burung', warna='Merah'}
Hewan{jenis='Kuda', warna='Hitam'}
Hewan{jenis='Ikan', warna='Kuning'}

Data setelah dihapus:
Hewan{jenis='Anjing', warna='Coklat'}
Hewan{jenis='Ikan', warna='Kuning'}

Process finished with exit code 0
 */
