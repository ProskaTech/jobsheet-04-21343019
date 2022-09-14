package Tugas;

/*
 * Created_By_21343019_Arafil Azmi
 */

public class TUGAS2 {
    public static void main(String[]args) {
        int angka1 = 10;
        int angka2 = 23;
        int angka3 = 5;
        int maks;

        maks =(angka1>angka2)?(angka1>angka3?angka1:angka3):(angka2>angka3?angka2:angka3);
        
        System.out.println("Number 1 = " + angka1);
        System.out.println("Number 2 = " + angka2);
        System.out.println("Number 3 = " + angka3);
        System.out.println("Nilai tertingginya adalah angka = " + maks);
    }
}
