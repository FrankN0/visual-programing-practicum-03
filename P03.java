//12S23016 - Frank Niroy Siahaan
import java.util.*;
import java.lang.Math;

class P03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] deskripsi = new String[10], matkul = new String[10], tanggal = new String[10], judul = new String[10], dosen = new String[10], status = new String[10], nim = new String[10], hasil1 = new String[10];
        int i, a;
        double[] prioritas = new double[10];
        int[] tingkat = new int[10], hari = new int[10];

        i = 0;
        for (i = 0; i <= 9; i++) {
            deskripsi[i] = input.nextLine();
            if (deskripsi[i].equals("---")) {
                i = 10;
            } else {
                nim[i] = input.nextLine();
                matkul[i] = input.nextLine();
                dosen[i] = input.nextLine();
                tanggal[i] = input.nextLine();
                judul[i] = input.nextLine();
                tingkat[i] = input.nextInt();
                hari[i] = input.nextInt();
                status[i] = input.nextLine();
                prioritas[i] = tingkat[i] * (1.0 / hari[i]);
                if (prioritas[i] > 3.0) {
                    hasil1[i] = "Penting! Anda harus mengerjakan tugas ini segera.";
                } else {
                    if (prioritas[i] >= 1.5 && prioritas[i] <= 3.0) {
                        hasil1[i] = "Tugas ini memiliki prioritas menengah.";
                    } else {
                        if (prioritas[i] < 1.5) {
                            hasil1[i] = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                        }
                    }
                }
                a = i;
            }
        }
        for (i = 0; i <= a; i++) {
            System.out.println("Prioritas : " + prioritas[i]);
            System.out.println(deskripsi[i] + "|" + nim[i] + "|" + matkul[i] + "|" + dosen[i] + "|" + tanggal[i] + "|" + judul[i] + "|" + status[i] + "|" + hasil1[i]);
        }
    }
}
