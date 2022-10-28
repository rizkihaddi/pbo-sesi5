import java.util.Scanner;

import java.util.ArrayList;

class Identitas {
    private int nim;
    private String nama;
    private String alamat;

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Sesi5 {
    private static boolean add2;

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("========================================");
        Identitas nim1 = new Identitas();
        nim1.setNim(2021004042);
        System.out.println("NIM     : " + nim1.getNim());
        Identitas nama1 = new Identitas();
        nama1.setNama("Rizki Haddi Prayoga");
        System.out.println("NAMA    : " + nama1.getNama());
        Identitas alamat1 = new Identitas();
        alamat1.setAlamat("KABUPATEN SUKABUMI");
        System.out.println("ALAMAT  : " + alamat1.getAlamat());

        Scanner mapel = new Scanner(System.in);
        Scanner dosen = new Scanner(System.in);
        Scanner inputNilai = new Scanner(System.in);
        Scanner jmlmapel = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Inputkan Jumlah Mapel: ");
        int jumlahmapel = jmlmapel.nextInt();
        if (jumlahmapel == 0) {
            System.out.println("Terimakasih");
            System.exit(1);
        }

        int nil = 0;
        int i = 1;
        final ArrayList mapelList = new ArrayList<>();
        final ArrayList dosed2 = new ArrayList<>();
        final ArrayList nilai2 = new ArrayList<>();
        final ArrayList grade2 = new ArrayList<>();

        while (i > 0 && i <= jumlahmapel) {
            System.out.println("Mapel Ke-" + i);
            System.out.println("----------------------------");
            System.out.print("Inputkan Mapel : ");
            String matapelajaran = mapel.nextLine();
            mapelList.add(matapelajaran);
            System.out.print("Inputkan Nama Dosen    : ");
            String namadosen = dosen.nextLine();
            add2 = dosed2.add(namadosen);
            System.out.print("Masukan Nilai          : ");
            int nilaiMhs = inputNilai.nextInt();
            System.out.println("----------------------------\n");
            nil += nilaiMhs;
            i++;
        }

        mapel.close();
        dosen.close();
        inputNilai.close();
        jmlmapel.close();
        int rata = nil / jumlahmapel;
        String grade;
        if (rata <= 100 && rata >= 80) {
            grade = "Yeay! Anda Lulus";
            grade2.add(grade);
        } else if (rata <= 79 && rata >= 70) {
            grade = "Yeay! Anda Lulus";
            grade2.add(grade);
        } else if (rata <= 69 && rata >= 60) {
            grade = "Yeay! Anda Lulus";
            grade2.add(grade);
        } else if (rata <= 59 && rata >= 50) {
            grade = "Mohon Maaf! Anda belum Lulus";
            grade2.add(grade);
        } else if (rata < 50 && rata >= 0) {
            grade = "Mohon Maaf! Anda belum Lulus";
            boolean add3 = grade2.add(grade);
        } else {
            System.out.println("Input nilai anda salah!");
        }
        System.out.println("========================================");
        System.out.println("NIM             : " + nim1.getNim());
        System.out.println("Nama            : " + nama1.getNama());
        System.out.println("Alamat          : " + alamat1.getAlamat());
        System.out.println("Jumlah Mapel    : " + jumlahmapel);
        System.out.println("-----------------------------------------");
        System.out.println("NO" + "MATA PELAJARAN" + "DOSEN" + "NILAI");
        System.out.println("-----------------------------------------");
        int a;
        for (a = 0; i < mapelList.size(); a++) {
            System.out.println(mapelList.get(a));
        }
        for (a = 0; i < mapelList.size(); a++) {
            System.out.println(mapelList.get(a));
        }
        System.out.println("Nilai           : " + nilai2);
        System.out.println("-----------------------------------------");
        System.out.println("Rata-Rata       : " + rata);
        System.out.println("Keterangan      : " + grade2);
        System.out.println("-----------------------------------------");

    }
}
