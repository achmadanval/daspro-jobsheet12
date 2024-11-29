import java.util.Scanner;
public class percobaan3{
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0) {
            return (saldo);
        }else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal ;
        int tahun;
        System.out.printf("Jumlah saldo awal : ");
        saldoAwal = sc.nextDouble();
        System.out.printf("Lama investasi (tahun) : ");
        tahun = sc.nextInt();
        System.out.print(String.format("Jumlah saldo setelah %d tahun: %.2f\n", tahun,hitungLaba(saldoAwal, tahun)));
    }
}