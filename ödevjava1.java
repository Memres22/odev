import java.util.Arrays;
import java.util.Random;

public class ödevjava1 {
    public static void main(String[] args) {
        int[][] matris = randomMatrisOlustur(5, 5); 
        System.out.println("Önceki Matris:");
        matrisiYazdir(matris);

        matrisiSirala(matris);
        
        System.out.println("Sıralanmış Matris:");
        matrisiYazdir(matris);
    }

   
    public static int[][] randomMatrisOlustur(int satirSayisi, int sutunSayisi) {
        int[][] matris = new int[satirSayisi][sutunSayisi];
        Random r = new Random();
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                matris[i][j] = r.nextInt(100); 
            }
        }
        return matris;
    }

    
    public static void matrisiYazdir(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }

    
    public static void matrisiSirala(int[][] matris) {
        int satirSayisi = matris.length;
        for (int i = 0; i < satirSayisi; i++) {
            Arrays.sort(matris[i]);
        }
    }
}
