public abstract class Benefit {
    private String jenis;
    protected int tingkatan;

    public Benefit(String jenis) {
        this.jenis = jenis;
        this.tingkatan = 1;
    }

    public void display() {
        System.out.println("Tingkatan Cust : " +this.tingkatan);
        System.out.println("Jenis Benefit Cust " +this.jenis);
    }

    // Abstract method
    public abstract void tingkatan();

    // Setter
    public void setTingkatan() {
        this.tingkatan = tingkatan;
    }

    public abstract void mData(String jenis, int Tingkatan);
}