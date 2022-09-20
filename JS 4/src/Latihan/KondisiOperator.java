//Percobaan 8 Penggunaan Operator Kondisi (?:)

/*
 * Created_By_21343019_Arafil Azmi
 */

package Latihan;

public class KondisiOperator {
    public static void main(String[]args) {
        String status = "";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";

        //print status
        System.out.println(status);
    }
}
