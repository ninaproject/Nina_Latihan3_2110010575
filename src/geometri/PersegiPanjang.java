
package geometri;

public class PersegiPanjang {
     //membuat variable
    private double panjang, lebar;

    // membuat constructor
    public PersegiPanjang (double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;

    }
    double setLuas (){
    return panjang * lebar;
    }
    double setKeliling (){
    return 2* (panjang+lebar);

    }
    public static void main(String[] args) {
        PersegiPanjang luas = new PersegiPanjang (8,6);
        PersegiPanjang lebar = new PersegiPanjang (8,6);
        System.out.println("Hasil Luas Persegi Panjang = "+ luas.setLuas());
        System.out.println("Hasil Luas Persegi Panjang = "+ luas.setKeliling());

    }
}
