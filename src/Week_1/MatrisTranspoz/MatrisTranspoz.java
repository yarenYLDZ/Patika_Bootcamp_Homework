package Week_1.MatrisTranspoz;

public class MatrisTranspoz {

    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int satir = matris.length;
        int sutun = matris[0].length;


        int[][] transpoz = new int[sutun][satir]; // Transpoz matris (3x2)

        // Transpoz alma işlemi
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisin yazdırılması
        System.out.println("Matris : ");
        yazdir(matris);

        // Transpoz matrisin yazdırılması
        System.out.println("Transpoze : ");
        yazdir(transpoz);
    }

    // Matris yazdırma fonksiyonu
    public static void yazdir(int[][] dizi) {
        for (int[] satir : dizi) {
            for (int eleman : satir) {
                System.out.print(eleman + "\t");
            }
            System.out.println();
        }
    }

}

