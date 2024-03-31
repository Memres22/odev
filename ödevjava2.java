import java.util.Arrays;

public class ödevjava2 {
    public static void main(String[] args) {
        int[][] dizi1 = {{5, 7, 3}, {6, 2}, {1, 4, 7, 2}};
        int[][] dizi2 = {{1, 9}, {3, 6, 5}, {1, 7, 9}};
        
        System.out.println("İlk dizi:");
        diziYazdir(dizi1);
        System.out.println("İkinci dizi:");
        diziYazdir(dizi2);
        
        // Her iki diziyi de sırala
        siraliDiziCarpTopla(dizi1, dizi2);
    }
    
    // Dizi elemanlarını yazdıran metot
    public static void diziYazdir(int[][] dizi) {
        for (int[] satir : dizi) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
    
    // Her iki diziyi de sıralayıp, karşılıklı elemanları çarparak toplayan metot
    public static void siraliDiziCarpTopla(int[][] dizi1, int[][] dizi2) {
        // Her iki diziyi de sırala
        siraliDiziSiralama(dizi1);
        siraliDiziSiralama(dizi2);
        
        // Dizilerin boyutlarını al
        int satirSayisi = Math.min(dizi1.length, dizi2.length);
        
        // Toplamı saklamak için bir değişken oluştur
        int toplam = 0;
        
        // Karşılıklı elemanları çarpıp topla
        for (int i = 0; i < satirSayisi; i++) {
            int[] satir1 = dizi1[i];
            int[] satir2 = dizi2[i];
            for (int j = 0; j < Math.min(satir1.length, satir2.length); j++) {
                toplam += satir1[j] * satir2[j];
            }
        }
        
        System.out.println("Toplam: " + toplam);
    }
    
    // Diziyi sıralayan metot
    public static void siraliDiziSiralama(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            Arrays.sort(dizi[i]);
        }
    }
}
