import java.util.Scanner;
public class tugas1 {
    static void deretDescendingRekursif(int n){
        if ( n < 0){
            return;
        }else {
            System.out.print(n + " ");
            deretDescendingRekursif(n-1);
        }
    }
    static void deretDescendingIteratif(int n){
        for ( int i = n; i >= 0 ; i--){
            System.out.print(i + " ");
        }       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        System.out.print("Deret Descending (reskursif) : ");
        deretDescendingRekursif(n);
        System.out.println();
        System.out.print("Deret Descending (iteratif) : ");
        deretDescendingIteratif(n);
    }
}