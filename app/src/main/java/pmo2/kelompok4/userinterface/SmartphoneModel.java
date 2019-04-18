package pmo2.kelompok4.userinterface;

public class SmartphoneModel {
    private String nama;
    private String harga;
    private int gambar;

    public static final SmartphoneModel[] daftarSmartphone = {
            new SmartphoneModel("Nokia", "Rp. 1.000.000", R.drawable.nokia),
            new SmartphoneModel("Oppo", "Rp. 2.000.000", R.drawable.oppo),
            new SmartphoneModel("Samsung", "Rp. 3.000.000", R.drawable.samsung),
            new SmartphoneModel("Vivo", "Rp. 4.000.000", R.drawable.vivo),
            new SmartphoneModel("Xiaomi", "Rp. 5.000.000", R.drawable.xiaomi)
    };

    public SmartphoneModel(String nama, String harga, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public static SmartphoneModel[] getDaftarSmartphone() {
        return daftarSmartphone;
    }
}
