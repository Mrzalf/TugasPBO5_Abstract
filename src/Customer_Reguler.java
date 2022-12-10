public class Customer_Reguler extends Benefit{

    public Customer_Reguler(String jenis){
        super(jenis);
    }

    @Override
    public void tingkatan() {// Implementasi abstract method
        this.setTingkatan();
    }

    @Override
    public void mData(String jenis, int Tingkatan){
        System.out.println("Tingkatan Cust : "+tingkatan);
        System.out.println("Jenis Benefit Cust : "+jenis);

    }


}
