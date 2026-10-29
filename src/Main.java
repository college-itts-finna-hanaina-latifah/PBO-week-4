// KELAS : Pemrograman Berorientasi Objek
// NAMA : Finna Hanaina Latifah
// NIM  : 1003260049

class Anggota0049 {
    private String id, nama;
    private double simpananPokok;

    public Anggota0049(String id, String nama, double sp) {
        this.id = id;
        this.nama = nama;
        setSimpananPokok(sp);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getSimpananPokok() { return simpananPokok; }

    public void setSimpananPokok(double sp) {
        if (sp < 0) {
            System.out.println("Error: Simpanan tidak boleh negatif!");
            this.simpananPokok = 0;
        } else {
            this.simpananPokok = sp;
        }
    }

}

class Koperasi0049 {
    public double totalKas(Anggota0049 a1, Anggota0049 a2, Anggota0049 a3) {
        return a1.getSimpananPokok() + a2.getSimpananPokok() + a3.getSimpananPokok();
    }
}
public class Main {
    public static void main(String[] args) {
        Anggota0049 a1 = new Anggota0049("A01", "Budi", 32000); // Nilai NIM
        Anggota0049 a2 = new Anggota0049("A02", "Siti", 50000);
        Anggota0049 a3 = new Anggota0049("A03", "Andi", 20000);
        Koperasi0049 kop = new Koperasi0049();

        System.out.println("Anggota 1: " + a1.getId() + " |" + a1.getNama() + " | Rp" + a1.getSimpananPokok());
        System.out.println("Anggota 2: " + a2.getId() + " |" + a2.getNama() + " | Rp" + a2.getSimpananPokok());
        System.out.println("Anggota 3: " + a3.getId() + " |" + a3.getNama() + " | Rp" + a3.getSimpananPokok());
        System.out.println("Total Kas: Rp" + kop.totalKas(a1, a2, a3));
    }
}

