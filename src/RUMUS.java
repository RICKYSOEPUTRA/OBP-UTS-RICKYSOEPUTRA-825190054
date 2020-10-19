import java.util.Scanner;

public class RUMUS {
    public static void main(String[] args) {
        float nilai_a = 0;
        float nilai_b = 0;
        int perhitungan, luas, keliling;
        float hasil = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Perhitungan yang di inginkan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Luas");
        System.out.println("6. Keliling");


        perhitungan = input.nextInt();

        switch (perhitungan) {
            case 1:
                System.out.println("Masukkan Angka Pertama yang ingin dijumlahkan: ");
                nilai_a = input.nextInt();
                System.out.println("Masukkan Angka Kedua yang ingin di jumlahkan");
                nilai_b = input.nextInt();

                hasil = nilai_a + nilai_b;
                System.out.println("Maka hasil adalah: " + hasil);
                break;

            case 2:
                System.out.println("Masukkan Angka Pertama: ");
                nilai_a = input.nextInt();
                System.out.println("Masukkan Angka Kedua yang ingin dikurangi: ");
                nilai_b = input.nextInt();

                hasil = nilai_a - nilai_b;
                System.out.println("Maka hasil adalah: " + hasil);
                break;

            case 3:
                System.out.println("Masukkan Angka Pertama: ");
                nilai_a = input.nextInt();
                System.out.println("Masukkan Angka Kedua yang ingin dibagi: ");
                nilai_b = input.nextInt();

                hasil = nilai_a / nilai_b;
                System.out.println("Maka hasil adalah: " + hasil);
                break;

            case 4:
                System.out.println("Masukkan Angka Pertama: ");
                nilai_a = input.nextInt();
                System.out.println("Masukkan Angka Kedua yang ingin dikali: ");
                nilai_b = input.nextInt();

                hasil = nilai_a * nilai_b;
                System.out.println("Maka hasil adalah: " + hasil);
                break;

            case 5:
                System.out.println("Bentuk yang Di inginkan: ");
                System.out.println("1. Persegi");
                System.out.println("2. Segitiga");
                System.out.println("3. Persegi Panjang");
                luas = input.nextInt();

                switch (luas) {
                    case 1:
                        System.out.println("Masukkan Panjang Persegi: ");
                        nilai_a = input.nextInt();
                        System.out.println("Masukkan Lebar Persegi : ");
                        nilai_b = input.nextInt();

                        hasil = nilai_a * nilai_b;
                        System.out.println("Maka luas persegi adalah: " + hasil);
                        break;

                    case 2:
                        System.out.println("Masukkan Tinggi: ");
                        nilai_a = input.nextInt();
                        System.out.println("Masukkan Alas : ");
                        nilai_b = input.nextInt();

                        hasil = nilai_a * nilai_b / 2;
                        System.out.println("Maka luas Segitiga adalah: " + hasil);
                        break;

                    case 3:
                        System.out.println("Masukkan Panjang Persegi : ");
                        nilai_a = input.nextInt();
                        System.out.println("Masukkan Luas Persegi : ");
                        nilai_b = input.nextInt();

                        hasil = nilai_a * nilai_b;
                        System.out.println("Maka luas Persegi Panjang adalah: " + hasil);
                        break;
                }

            case 6:
                System.out.println("Bentuk yang Di inginkan: ");
                System.out.println("1. Persegi");
                System.out.println("2. Segitiga");
                System.out.println("3. Persegi Panjang");
                keliling = input.nextInt();

                switch (keliling) {
                    case 1:
                        System.out.println("Masukkan Sisi Persegi: ");
                        nilai_a = input.nextInt();

                        hasil = nilai_a * 4;
                        System.out.println("Maka Keliling persegi adalah: " + hasil);
                        break;

                    case 2:
                        System.out.println("Masukkan Sisi Segitiga: ");
                        nilai_a = input.nextInt();

                        hasil = nilai_a * 3;
                        System.out.println("Maka Kelilinf Segitiga adalah: " + hasil);
                        break;

                    case 3:
                        System.out.println("Masukkan Panjang: ");
                        nilai_a = input.nextInt();
                        System.out.println("Masukkan Lebar : ");
                        nilai_b = input.nextInt();

                        hasil = (nilai_a * 2) * nilai_b;
                        System.out.println("Maka luas Persegi adalah: " + hasil);
                        break;
                }
        }
    }
}
