public class tugas2 {

    static int penjumlahanRekursif(int n){
        if (n == 0) {
            return 0;
        }else{
            System.out.print(n + " + ");
            return (n + penjumlahanRekursif(n-1));
        }
    }
    public static void main(String[] args) {
        System.out.print(" = " + penjumlahanRekursif(8));
    }
}