/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warung;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author choiryaya
 */
public class Warung {

    static File simpandata = new File("D:/Praktikum/struk.txt");

    public static void main(String[] args) {
        String jawaban;
        Warung.pilihmenu();

    }

    private static String pilihmenu() {
        int total = 0;
        double ppn = 0;
        double total2 = 0;
        Scanner input = new Scanner(System.in);
        int pilihan_menu[] = new int[100];
        String menu[][] = new String[10][3];
        menu[0][0] = "      No.";
        menu[0][1] = "     Nama Makanan      ";
        menu[0][2] = "      Harga     ";
        menu[1][0] = "      1. ";
        menu[1][1] = "    Ayam Serundeng     ";
        menu[1][2] = "    Rp. 16.000  ";
        menu[2][0] = "      2. ";
        menu[2][1] = "    Ayam Rica-Rica     ";
        menu[2][2] = "    Rp. 19.000  ";
        menu[3][0] = "      3. ";
        menu[3][1] = "    Nasi Goreng        ";
        menu[3][2] = "    Rp. 15.000  ";
        menu[4][0] = "      4. ";
        menu[4][1] = "    Nasi Pecel         ";
        menu[4][2] = "    Rp. 10.000  ";
        menu[5][0] = "      5. ";
        menu[5][1] = "    Nasi Orak-Arik     ";
        menu[5][2] = "    Rp. 10.000  ";
        menu[6][0] = "      6. ";
        menu[6][1] = "    Penyet Tempe       ";
        menu[6][2] = "    Rp. 7.000   ";
        menu[7][0] = "      7. ";
        menu[7][1] = "    Penyet Lele        ";
        menu[7][2] = "    Rp. 12.000  ";
        menu[8][0] = "      8. ";
        menu[8][1] = "    Nasi+Soto          ";
        menu[8][2] = "    Rp. 25.000  ";
        menu[9][0] = "      9. ";
        menu[9][1] = "    Nasi+Rawon         ";
        menu[9][2] = "    Rp. 30.000  ";

        try {
            simpandata.createNewFile();
            PrintWriter pewe = new PrintWriter(simpandata);
            pewe.write("                     -STRUK PEMBELANJAAN-");
            pewe.write("\r\n");

            //menampilkan menu
            System.out.println("                 -MENU WARUNG MAKAN MURAH-");
            pewe.write("                      WARUNG MAKAN MURAH");
            pewe.write("\r\n");
            System.out.println("          Jl. Telekomunikasi, Bojongsoang, Bandung");
            pewe.write("           Jl. Telekomunikasi, Bojongsoang, Bandung");
            pewe.write("\r\n");
            System.out.println("                No. Telp. (085) 333 999 789");
            pewe.write("                 No. Telp. (085) 333 999 789");
            pewe.write("\r\n");
            pewe.write(" ");
            pewe.write("\r\n");
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(menu[i][j] + "|");
                }

                System.out.println("");
            }

            System.out.println("");
            System.out.println("                   +++PROSES PEMESANAN+++");
            System.out.println("           ======================================");
            System.out.print("Masukkan banyak pesanan: ");
            int banyak_pesanan = input.nextInt();
            int[] harga = {16000, 19000, 15000, 10000, 10000, 7000, 12000, 25000, 30000};

            System.out.println("Masukkan Pilihan menu ");
            for (int i = 0; i < banyak_pesanan; i++) {
                pilihan_menu[i] = input.nextInt();
                switch (pilihan_menu[i]) {
                    case 1:
                        System.out.println(menu[1][1] + harga[0]);
                        pewe.write("        " + menu[1][1] + harga[0]);
                        pewe.write("\r\n");
                        total += harga[0];
                        break;
                    case 2:
                        System.out.println(menu[2][1] + harga[1]);
                        pewe.write("        " + menu[2][1] + harga[1]);
                        pewe.write("\r\n");
                        total += harga[1];
                        break;
                    case 3:
                        System.out.println(menu[3][1] + harga[2]);
                        pewe.write("        " + menu[3][1] + harga[2]);
                        pewe.write("\r\n");
                        total += harga[2];
                        break;
                    case 4:
                        System.out.println(menu[4][1] + harga[3]);
                        pewe.write("        " + menu[4][1] + harga[3]);
                        pewe.write("\r\n");
                        total += harga[3];
                        break;
                    case 5:
                        System.out.println(menu[5][1] + harga[4]);
                        pewe.write("        " + menu[5][1] + harga[4]);
                        pewe.write("\r\n");
                        total += harga[4];
                        break;
                    case 6:
                        System.out.println(menu[6][1] + harga[5]);
                        pewe.write("        " + menu[6][1] + " " + harga[5]);
                        pewe.write("\r\n");
                        total += harga[5];
                        break;
                    case 7:
                        System.out.println(menu[7][1] + harga[6]);
                        pewe.write("        " + menu[7][1] + harga[6]);
                        pewe.write("\r\n");
                        total += harga[6];
                        break;
                    case 8:
                        System.out.println(menu[8][1] + harga[7]);
                        pewe.write("        " + menu[8][1] + harga[7]);
                        pewe.write("\r\n");
                        total += harga[7];
                        break;
                    case 9:
                        System.out.println(menu[9][1] + harga[8]);
                        pewe.write("        " + menu[9][1] + harga[8]);
                        pewe.write("\r\n");
                        total += harga[8];
                        break;
                    default:
                        System.out.print("menu tidak terdaftar");
                        break;
                }
                total = total;
                ppn = total * 10 / 100;
                total2 = total + ppn;
            }
            int model;
            System.out.println("================================================");
            pewe.write("        ================================================");
            pewe.write("\r\n");
            System.out.println("Total Harga Pesanan:   " + total);
            pewe.write("        Total Harga Pesanan:   " + total);
            pewe.write("\r\n");
            System.out.println("PPN                     " + ppn);
            pewe.write("        PPN                     " + ppn);
            pewe.write("\r\n");
            System.out.println("-----                  -------");
            pewe.write("        -----                  -------");
            pewe.write("\r\n");
            System.out.println("Total                  " + total2);
            pewe.write("        Total                  " + total2);
            pewe.write("\r\n");
            System.out.println("================================================");
            pewe.write("        ================================================");
            pewe.write("\r\n");
            System.out.println("         PILIH MODEL PEMBAYARAN");
            System.out.println("1. Tunai\n2. Debit");
            System.out.print("-->");
            model = input.nextInt();

            double tunai, uang1, uang2;
            int pin = 12345;
            int coba = 1;
            switch (model) {
                case 1:
                    System.out.print("Masukkan Jumlah Uang   ");
                    uang1 = input.nextInt();
                    pewe.write("        Jumlah Uang            " + uang1);
                    pewe.write("\r\n");
                    tunai = uang1 - total - ppn;
                    System.out.println("Kembalian              " + tunai);
                    pewe.write("        Kembalian              " + tunai);
                    pewe.write("\r\n");
                    System.out.println("");
                    pewe.write("");
                    pewe.write("\r\n");
                    System.out.println("");
                    pewe.write("");
                    pewe.write("\r\n");
                    System.out.println("               APPROVED-THANK YOU");
                    pewe.write("                     APPROVED-THANK YOU");
                    pewe.write("\r\n");
                    System.out.println("              NO SIGNATURE REQUIRED");
                    pewe.write("                    NO SIGNATURE REQUIRED");
                    pewe.write("\r\n");
                    System.out.println("        TERIMAKASIH ATAS KUNJUNGAN ANDA ");
                    pewe.write("               TERIMAKASIH ATAS KUNJUNGAN ANDA");
                    pewe.write("\r\n");
                    break;
                case 2:
                    do {
                        System.out.println("*Masukkan PIN");
                        pin = input.nextInt();
                        if (pin == 12345) {
                            String x = Warung.pinbenar(pin);
                            coba = 3;
                            System.out.println("  TOTAL               Rp. " + total2);
                            pewe.write("        TOTAL              Rp. " + total2);
                            pewe.write("\r\n");
                            System.out.println("");
                            pewe.write("");
                            pewe.write("\r\n");
                            System.out.println("");
                            pewe.write("");
                            pewe.write("\r\n");
                            System.out.println("               APPROVED-THANK YOU");
                            pewe.write("                     APPROVED-THANK YOU");
                            pewe.write("\r\n");
                            System.out.println("              NO SIGNATURE REQUIRED");
                            pewe.write("                    NO SIGNATURE REQUIRED");
                            pewe.write("\r\n");
                            System.out.println("          **PIN Verification Success**");
                            pewe.write("                **PIN Verification Success**");
                            pewe.write("\r\n");
                            System.out.println("           I AGREE TO PAY ABOVE TOTAL ");
                            pewe.write("                 I AGREE TO PAY ABOVE TOTAL");
                            pewe.write("\r\n");
                            System.out.println("         ACCORDING TO CARD ISSUER AGREEMENT");
                            pewe.write("             ACCORDING TO CARD ISSUER AGREEMENT");
                            pewe.write("\r\n");

                        } else {
                            System.out.println("MAAF PIN SALAH");
                        }
                        coba++;
                    } while (coba <= 3);
                    break;
                default:
                    System.out.println("pilihan tidak terdaftar");
                    break;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Struk berhasil dicetak....");

            pewe.close();
        } catch (Exception e) {
            System.out.println("Gagal membuat File");
            System.out.println("Error di " + e);
        }
        if (Warung.keputusan()) {
            return pilihmenu();
        }

        return null;
    }

    private static String pinbenar(int pin) {
        String pinbenar = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("           =======================================");
        System.out.println("                    TRANSAKSI BERHASIL");
        System.out.println("           =======================================");
        return pinbenar;
    }

    private static boolean keputusan() {
        Scanner input = new Scanner(System.in);
        String jawaban;
        System.out.print("apakah anda ingin memesan lagi lagi(y/n)");
        jawaban = input.next();
        if (jawaban.equals("y")) {
            return true;
        }
        return false;
    }

}
