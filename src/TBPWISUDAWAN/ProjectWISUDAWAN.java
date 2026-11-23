/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TBPWISUDAWAN;

/**
 *
 * @author ALDELAN FIRZABIAN
 */
import java.io.*;

public class ProjectWISUDAWAN {
    public static void main(String[]args){
        try {
            BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            int i;
            int pilihan =0;
            String lagi = "y";
            String ulang = "y";
            String konfirmasi = "y";
            String namaakun = "Wisudawan";
            
            MENU_UTAMA:
            do {
                System.out.println("|============================|");
                System.out.println("|       WISUDAWAN CELL       |");
                System.out.println("|============================|");
                System.out.println("|                            |");
                System.out.println("| 1) Transfer Bank           |");
                System.out.println("| 2) Top Up E-Wallet         |");
                System.out.println("| 3) Top UP Diamond Game     |");
                System.out.println("| 4) Keluar                  |");
                System.out.println("|                            |");
                System.out.println("|============================|");

                System.out.print("Silahkan pilih yang mau di beli [1 s/d 4] : ");
                pilihan = Integer.parseInt(input.readLine());
                System.out.println();
                
                String jenis = "";
                if (pilihan ==1){
                    jenis = "Transfer Bank";
                }
                else if (pilihan ==2) {
                    jenis = "Top Up E-Wallet";
                }
                else if (pilihan ==3){
                    jenis = "Top Up Game";
                }
                else if (pilihan ==4){
                    System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                }
                else {
                    System.out.println("Jenis transaksi tidak tersedia!!!");
                }
            
                switch (pilihan){
                        case 1 : 
                            while (lagi.equalsIgnoreCase("y")){
                                System.out.println("|=====PILIH BANK=====|");
                                System.out.println("| 1. CHECK ADMIN     |");
                                System.out.println("| 2. BRI             |");
                                System.out.println("| 3. BCA             |");
                                System.out.println("| 4. MANDIRI         |");
                                System.out.println("|====================|");
                                System.out.print("Pilih Bank [1 s/d 4] : ");
                                int pilihbank = Integer.parseInt(input.readLine());
                                System.out.println();
                                
                                String norek,namapenerima,nama;
                                double nominaltransfer=0;
                                String namabank= "";
                                double total = 0;
                                double admin = 0;
                                if (pilihbank == 1){
                                    namabank = "CHECK BIAYA ADMIN";
                                }
                                else if (pilihbank == 2 ){
                                    namabank = "BRI";
                                    admin = 3000;
                                }
                                else if (pilihbank ==3){
                                    namabank = "BCA";
                                    admin = 5000;
                                }
                                else if (pilihbank ==4){
                                    namabank = "MANDIRI";
                                    admin = 4000;
                                }
                                else {
                                    System.out.println("MAAF PILIHAN BANK TIDAK ADA!!!!!");
                                }
                                
                            switch (pilihbank){
                                case 1 : 
                                    System.out.println("|=========BIAYA ADMIN=========|");
                                    System.out.println("| -> To BRI       Rp.3000     |");
                                    System.out.println("| -> To BCA       Rp.5000     |");
                                    System.out.println("| -> To MANDIRI   Rp.4000     |");
                                    System.out.println("|=============================|");
                                    System.out.println();
                                    System.out.print("Ingin Melanjutkan Transaksi ? [y/n] : ");
                                    lagi = input.readLine();
                                    if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                    }
                                    else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                    }
                                    break;
                                    
                                case 2 :
                                    System.out.print("Masukan Nomor Rekening Tujuan  : ");
                                    norek = input.readLine();
                                    System.out.print("Masukan Nama Penerima          : ");
                                    namapenerima = input.readLine();
                                    System.out.print("Masukan Jumlah Transfer        : Rp. ");
                                    nominaltransfer = Double.parseDouble(input.readLine());
                                    
                                    if (nominaltransfer > 2000000){
                                        System.out.println("MAAF NOMINAL TRANSFER ANDA MELEWATI LIMIT!!!!");
                                        System.out.println("BATAS SATU KALI TRANSFER HANYA Rp.2000000");
                                        System.out.print("Ingin Melakukan Transaksi Ulang ? [y/n] : ");
                                        lagi = input.readLine();
                                        if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                        }
                                        else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                        }
                                    }
                                    
                                    total = nominaltransfer + admin;
                                    System.out.println();
                                    System.out.print("Konfirmasi Pembayaran ? [y/n] : ");
                                    konfirmasi = input.readLine();
                                    
                                    if (konfirmasi.equalsIgnoreCase("y")){
                                        System.out.println("|======================================");
                                        System.out.println("|    SELAMAT TRANSFER ANDA BERHASIL    ");
                                        System.out.println("|======================================");
                                        System.out.println("|Jenis Transaksi     : "+jenis);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nama Pengirim       : "+namaakun);
                                        System.out.println("|No. Rekening Tujuan : "+norek);
                                        System.out.println("|Bank Tujuan         : "+namabank);
                                        System.out.println("|Nama Penerima       : "+namapenerima);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nominal Transfer    : Rp. "+(int)nominaltransfer);
                                        System.out.println("|Biaya Admin         : Rp. "+(int)admin);
                                        System.out.println("|======================================");
                                        System.out.println("|Total Pembayaran    : Rp. "+(int)total);
                                        System.out.println("|======================================");
                                        System.out.println();
                                        System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                        ulang = input.readLine();
                                        System.out.println();
                                        if (ulang.equalsIgnoreCase("y")){
                                            continue MENU_UTAMA;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                            System.exit(0);
                                        }
                                    }
                                    else {
                                        System.out.println("TRANSAKSI DIBATALKAN!!!!");
                                    }
                                    break;
                                    
                                case 3 :                                    
                                    System.out.print("Masukan Nomor Rekening Tujuan  : ");
                                    norek = input.readLine();
                                    System.out.print("Masukan Nama Penerima          : ");
                                    namapenerima = input.readLine();
                                    System.out.print("Masukan Jumlah Transfer        : Rp. ");
                                    nominaltransfer = Double.parseDouble(input.readLine());
                                    
                                    if (nominaltransfer > 2000000){
                                        System.out.println("MAAF NOMINAL TRANSFER ANDA MELEWATI LIMIT!!!!");
                                        System.out.println("BATAS SATU KALI TRANSFER HANYA Rp.2000000");
                                        System.out.print("Ingin Melakukan Transaksi Ulang ? [y/n] : ");
                                        lagi = input.readLine();
                                        if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                        }
                                        else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                        }
                                    }
                                    
                                    total = nominaltransfer + admin;
                                    
                                    System.out.println();
                                    System.out.print("Konfirmasi Pembayaran ? [y/n] : ");
                                    konfirmasi = input.readLine();
                                    
                                    if (konfirmasi.equalsIgnoreCase("y")){
                                        System.out.println("|======================================");
                                        System.out.println("|    SELAMAT TRANSFER ANDA BERHASIL    ");
                                        System.out.println("|======================================");
                                        System.out.println("|Jenis Transaksi     : "+jenis);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nama Pengirim       : "+namaakun);
                                        System.out.println("|No. Rekening Tujuan : "+norek);
                                        System.out.println("|Bank Tujuan         : "+namabank);
                                        System.out.println("|Nama Penerima       : "+namapenerima);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nominal Transfer    : Rp. "+(int)nominaltransfer);
                                        System.out.println("|Biaya Admin         : Rp. "+(int)admin);
                                        System.out.println("|======================================");
                                        System.out.println("|Total Pembayaran    : Rp. "+(int)total);
                                        System.out.println("|======================================");
                                        System.out.println();
                                        System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                        ulang = input.readLine();
                                        System.out.println();
                                        if (ulang.equalsIgnoreCase("y")){
                                            continue MENU_UTAMA;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                            System.exit(0);
                                        }
                                    }
                                    else {
                                        System.out.println("TRANSAKSI DIBATALKAN!!!!");
                                    }
                                    break; 
                                    
                                case 4 :                                    
                                    System.out.print("Masukan Nomor Rekening Tujuan  : ");
                                    norek = input.readLine();
                                    System.out.print("Masukan Nama Penerima          : ");
                                    namapenerima = input.readLine();
                                    System.out.print("Masukan Jumlah Transfer        : Rp. ");
                                    nominaltransfer = Double.parseDouble(input.readLine());
                                    
                                    if (nominaltransfer > 2000000){
                                        System.out.println("MAAF NOMINAL TRANSFER ANDA MELEWATI LIMIT!!!!");
                                        System.out.println("BATAS SATU KALI TRANSFER HANYA Rp.2000000");
                                        System.out.print("Ingin Melakukan Transaksi Ulang ? [y/n] : ");
                                        lagi = input.readLine();
                                        if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                        }
                                        else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                        }
                                    }
                                    
                                    total = nominaltransfer + admin;
                                    
                                    System.out.println();
                                    System.out.print("Konfirmasi Pembayaran ? [y/n] : ");
                                    konfirmasi = input.readLine();
                                    
                                    if (konfirmasi.equalsIgnoreCase("y")){
                                        System.out.println("|======================================");
                                        System.out.println("|    SELAMAT TRANSFER ANDA BERHASIL    ");
                                        System.out.println("|======================================");
                                        System.out.println("|Jenis Transaksi     : "+jenis);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nama Pengirim       : "+namaakun);
                                        System.out.println("|No. Rekening Tujuan : "+norek);
                                        System.out.println("|Bank Tujuan         : "+namabank);
                                        System.out.println("|Nama Penerima       : "+namapenerima);
                                        System.out.println("|--------------------------------------");
                                        System.out.println("|Nominal Transfer    : Rp. "+(int)nominaltransfer);
                                        System.out.println("|Biaya Admin         : Rp. "+(int)admin);
                                        System.out.println("|======================================");
                                        System.out.println("|Total Pembayaran    : Rp. "+(int)total);
                                        System.out.println("|======================================");
                                        System.out.println();
                                        System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                        ulang = input.readLine();
                                        System.out.println();
                                        if (ulang.equalsIgnoreCase("y")){
                                            continue MENU_UTAMA;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                            System.exit(0);
                                        }
                                    }
                                    else {
                                        System.out.println("TRANSAKSI DIBATALKAN!!!!");
                                    }
                                    break;
                                default : 
                                    System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                    lagi = input.readLine();
                                    if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                    }
                                    else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                    }
                                    break;
                                    
                             }
                   
                        }
                        case 2 : 
                            while (lagi.equalsIgnoreCase("y")){
                                System.out.println("|=====PILIH E-WALLET=====|");
                                System.out.println("| 1. CHECK ADMIN         |");
                                System.out.println("| 2. DANA                |");
                                System.out.println("| 3. GOPAY               |");
                                System.out.println("|========================|");
                                System.out.print("Pilih E-Wallet [1 s/d 3] : ");
                                int pilihewallet = Integer.parseInt(input.readLine());
                                System.out.println();
                                String ewallet = "";
                                String nohp,penerima;
                                double admin = 0;
                                double topup = 0;
                                double bayar = 0;
                                if (pilihewallet == 1 ){
                                    ewallet = "CHECK ADMIN";
                                }
                                else if (pilihewallet == 2){
                                    ewallet = "TOP-UP SALDO DANA";
                                }
                                else if (pilihewallet ==3){
                                    ewallet = "TOP-UP SALDO GOPAY";
                                }
                                else {
                                    System.out.println("MAAF PILIHAN E-WALLET TIDAK TERSEDIA!!!!!");
                                }
                              
                                switch (pilihewallet){
                                    case 1 :
                                        System.out.println("|======================BIAYA ADMIN======================|");
                                        System.out.println("| -> Rp.10000   -   Rp.25000      ==>      Rp.3000      |");
                                        System.out.println("| -> Rp.26000   -   Rp.100000     ==>      Rp.5000      |");
                                        System.out.println("| -> RP.101000  -   Rp.1000000    ==>      Rp.10000     |");
                                        System.out.println("| -> RP.1000000 -   Rp.2000000    ==>      Rp.20000     |");
                                        System.out.println("|=======================================================|");
                                        System.out.println();
                                        System.out.print("Ingin Melanjutkan Transaksi ? [y/n] : ");
                                        lagi = input.readLine();
                                        if (lagi.equalsIgnoreCase("y")){
                                            continue;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                            System.exit(0);
                                        }                                
                                        break;
                                    
                                    case 2:                                        
                                        System.out.print("Masukan Nomor DANA          : ");
                                        nohp = input.readLine(); 
                                        System.out.print("Masukan User Name Penerima  : ");
                                        penerima = input.readLine();
                                        System.out.print("Masukan Nominal Top-up      : Rp. ");
                                        topup = Double.parseDouble(input.readLine());
                                        
                                        if ((topup >=10000 )&&(topup <= 25000)) {
                                            admin = 3000;
                                        }
                                        else if ((topup > 25000)&&(topup <= 100000)){
                                            admin = 5000;
                                        }
                                        else if ((topup >100000)&&(topup <=1000000)){
                                            admin = 10000;
                                        }
                                        else if ((topup >1000000)&&(topup <=2000000)){
                                            admin = 20000;
                                        }
                                        else {
                                            System.out.println("MAAF NOMINAL TOP-UP ANDA TIDAK BISA!!!!!");
                                            System.out.print("Ingin Melakukan Transaksi Ulang ? [y/n] : ");
                                            lagi = input.readLine();
                                            if (lagi.equalsIgnoreCase("y")){
                                                continue;
                                            }
                                            else {
                                                System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                                System.exit(0);
                                            }
                                        }
                                                     
                                        bayar = admin + topup;
                                        
                                        System.out.println();
                                        System.out.print("Konfirmasi Pembayaran ? [y/n] :");
                                        konfirmasi = input.readLine();
                                        if (konfirmasi.equalsIgnoreCase("y")){
                                            System.out.println("|======================================");
                                            System.out.println("|    SELAMAT TOP-UP ANDA BERHASIL    ");
                                            System.out.println("|======================================");
                                            System.out.println("|Jenis Transaksi  : "+ewallet);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Nama Penerima    : "+penerima);
                                            System.out.println("|Nomor Tujuan     : "+nohp);
                                            System.out.println("|Nama Pengirim    : "+namaakun);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Nominal Top-up   : Rp. "+(int)topup);
                                            System.out.println("|Biaya Admin      : Rp. "+(int)admin);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Total Pembayaran : Rp. "+(int)bayar);
                                            System.out.println("|======================================");
                                            System.out.println();
                                            System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                            ulang = input.readLine();
                                            System.out.println();
                                            if (ulang.equalsIgnoreCase("y")){
                                                continue MENU_UTAMA;
                                            }
                                            else {
                                                System.out.println("Terima Kasih!!");
                                                System.exit(0);
                                            }
                                        }
                                        else {
                                            System.out.println("TRANSAKSI DIBATALKAN!!!!");
                                        }
                                        break;
                                    
                                    case 3:                                        
                                        System.out.print("Masukan Nomor GOPAY         : ");
                                        nohp = input.readLine(); 
                                        System.out.print("Masukan User Name Penerima  : ");
                                        penerima = input.readLine();
                                        System.out.print("Masukan Nominal Top-up      : Rp. ");
                                        topup = Double.parseDouble(input.readLine());
                                        
                                        if ((topup >=10000 )&&(topup <= 25000)) {
                                            admin = 3000;
                                        }
                                        else if ((topup > 25000)&&(topup <= 100000)){
                                            admin = 5000;
                                        }
                                        else if ((topup >100000)&&(topup <=1000000)){
                                            admin = 10000;
                                        }
                                        else if ((topup >1000000)&&(topup <=2000000)){
                                            admin = 20000;
                                        }
                                        else {
                                            System.out.println("MAAF NOMINAL TOP-UP ANDA TIDAK BISA!!!!!");
                                            System.out.print("Ingin Melakukan Transaksi Ulang ? [y/n] : ");
                                            lagi = input.readLine();
                                            if (lagi.equalsIgnoreCase("y")){
                                                continue;
                                            }
                                            else {
                                                System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                                System.exit(0);
                                            }
                                        }
                                        
                                        bayar = admin + topup;
                                        
                                        System.out.println();
                                        System.out.print("Konfirmasi Pembayaran ? [y/n] :");
                                        konfirmasi = input.readLine();
                                        if (konfirmasi.equalsIgnoreCase("y")){
                                            System.out.println("|======================================");
                                            System.out.println("|    SELAMAT TOP-UP ANDA BERHASIL    ");
                                            System.out.println("|======================================");
                                            System.out.println("|Jenis Transaksi  : "+ewallet);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Nama Penerima    : "+penerima);
                                            System.out.println("|Nomor Tujuan     : "+nohp);
                                            System.out.println("|Nama Pengirim    : "+namaakun);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Nominal Top-up   : Rp. "+(int)topup);
                                            System.out.println("|Biaya Admin      : Rp. "+(int)admin);
                                            System.out.println("|--------------------------------------");
                                            System.out.println("|Total Pembayaran : Rp. "+(int)bayar);
                                            System.out.println("|======================================");
                                            System.out.println();
                                            System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                            ulang = input.readLine();
                                            System.out.println();
                                            if (ulang.equalsIgnoreCase("y")){
                                                continue MENU_UTAMA;
                                            }
                                            else {
                                                System.out.println("Terima Kasih!!");
                                                System.exit(0);
                                            }
                                        }
                                        else {
                                            System.out.println("TRANSAKSI DIBATALKAN!!!!");
                                        }                                
                                        break;
                                    
                                    default :                                  
                                    System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                    lagi = input.readLine();
                                    if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                    }
                                    else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                    }
                                    break;    
                                }
                            }
                        case 3 :
                            while (lagi.equalsIgnoreCase("y")){
                                System.out.println("|=======PILIH GAME=======|");
                                System.out.println("| 1. CHECK HARGA         |");
                                System.out.println("| 2. MOBILE LEGENDS      |");
                                System.out.println("| 3. FREE FIRE           |");
                                System.out.println("|========================|");
                                System.out.print("Pilih Top Up Game [1 s/d 3] : ");
                                int pilihtopup = Integer.parseInt(input.readLine());
                                System.out.println();
                                String transaksi = "";   
                                
                                if (pilihtopup == 1 ){
                                    transaksi = "CHECK HARGA DIAMOND";
                                }
                                else if (pilihtopup == 2){
                                    transaksi = "TOP-UP DIAMOND MOBILE LEGENDS";
                                }
                                else if (pilihtopup ==3){
                                    transaksi = "TOP-UP DIAMOND FREE FIRE";
                                }
                                else {
                                    System.out.println("MAAF PILIHAN TOP UP TIDAK TERSEDIA!!!!!");
                                }
                                
                                switch (pilihtopup){
                                    case 1 :
                                        System.out.println("|======================HARGA====================|");
                                        System.out.println("|                  MOBILE LEGENDS               |");
                                        System.out.println("| -> 50  DIAMOND    =   RP.16000                |");
                                        System.out.println("| -> 100 DIAMOND    =   Rp.30000                |");
                                        System.out.println("| -> 150 DIAMOND    =   RP.45000                |");
                                        System.out.println("|-----------------------------------------------|");
                                        System.out.println("|                  FREE FIRE                    |");
                                        System.out.println("| -> 70  DIAMOND    =   RP.12000                |");
                                        System.out.println("| -> 140 DIAMOND    =   Rp.22000                |");
                                        System.out.println("| -> 210 DIAMOND    =   RP.32000                |");
                                        System.out.println("|===============================================|");
                                        System.out.println();
                                        System.out.print("Ingin Melanjutkan Transaksi ? [y/n] : ");
                                        lagi = input.readLine();
                                        if (lagi.equalsIgnoreCase("y")){
                                            continue;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                            System.exit(0);
                                        }                                
                                        break;
                                    
                                    case 2:
                                        PILIHANML:
                                        while (ulang.equalsIgnoreCase("y")){
                                        System.out.print("Masukan Banyak Jumlah top-up : ");
                                        int jumlahtopupml = Integer.parseInt(input.readLine());

                                        int [] bnyktopupml = new int [jumlahtopupml];
                                        String [] idml = new String [jumlahtopupml];
                                        String [] nickml = new String [jumlahtopupml];
                                        int [] topupml = new int [jumlahtopupml];
                                        double [] hargaml = new double [jumlahtopupml];
                                        double totalhargaml = 0;
                                        int totaldiamondml=0;


                                        for (i=0;i<jumlahtopupml;i++){
                                            System.out.println("|=====================================================");
                                            System.out.println("|    INPUT DATA PESANAN TOP-UP KE-"+(i+1));
                                            System.out.println("|=====================================================");
                                            System.out.print("|Masukan ID Akun Game           : ");
                                            idml[i] = input.readLine(); 
                                            System.out.print("|Masukan User Nickname Game     : ");
                                            nickml[i] = input.readLine();
                                            System.out.print("|Masukan Nominal Diamond        : ");
                                            topupml[i] = Integer.parseInt(input.readLine());
                                            System.out.println();

                                            hargaml[i] =0;
                                            if ( topupml[i] == 50){
                                                hargaml[i] = 16000;
                                            }
                                            else if (topupml[i] == 100){
                                                hargaml[i] = 30000;
                                            }
                                            else if (topupml[i] == 150){
                                                hargaml[i] = 45000;
                                            }
                                            else {
                                                System.out.println("MAAF PILIHAN DIAMOND TIDAK TERSEDIA!!!");
                                                System.out.print("Ingin Melanjutkan transaksi ? [y/n] : ");
                                                ulang = input.readLine();
                                                if (ulang.equalsIgnoreCase("y")){
                                                    continue PILIHANML;
                                                }
                                                else {
                                                    System.out.println("TRANSAKSI DIBATALKAN!!!!!");
                                                    System.exit(0);
                                                }
                                            }

                                            totalhargaml += hargaml[i];
                                            totaldiamondml += topupml[i];

                                            System.out.println("|===============================================================");
                                            System.out.println("|    PESANAN TOP-UP KE "+(i+1)+" ANDA BERHASIL DI TAMBAHKAN     ");
                                            System.out.println("|===============================================================");
                                            System.out.println("|ID Game          : "+idml[i]);
                                            System.out.println("|Nickname Game    : "+nickml[i]);
                                            System.out.println("|Top-up           : "+topupml[i]+" Diamond");
                                            System.out.println("|Harga            : Rp."+(int)hargaml[i]);
                                            System.out.println("|===============================================================");
                                            System.out.println();

                                        }

                                        System.out.println("|=================================================");
                                        System.out.println("|               TOTAL PEMESANAN  ");
                                        System.out.println("|=================================================");
                                        for (i=0;i<jumlahtopupml;i++){
                                            System.out.println("| Pesanan top-up ke-"+(i+1)+" dengan ID Game : "+idml[i]+" | Top-up : "+topupml[i]+" Diamond  | Harga : Rp."+(int)hargaml[i]);    
                                        }
                                        System.out.println("|-------------------------------------------------");
                                        System.out.println("| TOTAL DIAMOND PESANAN ANDA    : "+totaldiamondml+" Diamond");
                                        System.out.println("|-------------------------------------------------");
                                        System.out.println("| TOTAL PEMBAYARAN ANDA SEBESAR : Rp."+(int)totalhargaml);
                                        System.out.println("|=================================================");

                                        System.out.println();
                                        System.out.print(" Konfirmasi Pembayaran ? [y/n] : ");
                                        konfirmasi = input.readLine();

                                        if (konfirmasi.equalsIgnoreCase("y")){
                                            System.out.println("|=============================");
                                            System.out.println("| SELAMAT TOP-UP ANDA BERHASIL  ");
                                            System.out.println("|=============================");
                                            System.out.println("|Jenis Transaksi : "+transaksi);
                                            System.out.println("|-----------------------------");
                                            for (i=0;i<jumlahtopupml;i++){
                                            System.out.println("| Pesanan top-up ke-"+(i+1)+" dengan ID : "+idml[i]+" | Jumlah top-up : "+topupml[i]+" Diamond  | Harga : Rp."+(int)hargaml[i]);
                                            }
                                            System.out.println("|-----------------------------");
                                            System.out.println("| TOTAL DIAMOND : "+totaldiamondml+" Diamond");
                                            System.out.println("|-----------------------------");
                                            System.out.println("| TOTAL HARGA   : Rp."+(int)totalhargaml);
                                            System.out.println("|=============================");
                                        }
                                        else {
                                            System.out.println("TRANSAKSI DIBATALKAN!!!!!!");
                                            System.exit(0);
                                        }
                                        System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                        ulang = input.readLine();
                                        if (ulang.equalsIgnoreCase("y")){
                                            continue MENU_UTAMA;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN"); 
                                            System.exit(0);
                                        }
                                    }                                
                                        break;
                                    
                                    case 3:
                                        PILIHANFF:
                                        while (ulang.equalsIgnoreCase("y")){
                                        System.out.print("Masukan Banyak Jumlah top-up : ");
                                        int jumlahtopupff = Integer.parseInt(input.readLine());

                                        int [] bnyktopupff = new int [jumlahtopupff];
                                        String [] idff = new String [jumlahtopupff];
                                        String [] nickff = new String [jumlahtopupff];
                                        int [] topupff = new int [jumlahtopupff];
                                        double [] hargaff = new double [jumlahtopupff];
                                        double totalhargaff = 0;
                                        int totaldiamondff=0;


                                        for (i=0;i<jumlahtopupff;i++){
                                            System.out.println("|=====================================================");
                                            System.out.println("|    INPUT DATA PESANAN TOP-UP KE-"+(i+1));
                                            System.out.println("|=====================================================");
                                            System.out.print("|Masukan ID Akun Game           : ");
                                            idff[i] = input.readLine(); 
                                            System.out.print("|Masukan User Nickname Game     : ");
                                            nickff[i] = input.readLine();
                                            System.out.print("|Masukan Nominal Diamond        : ");
                                            topupff[i] = Integer.parseInt(input.readLine());
                                            System.out.println();

                                            hargaff[i] =0;
                                            if ( topupff[i] == 70){
                                                hargaff[i] = 12000;
                                            }
                                            else if (topupff[i] == 140){
                                                hargaff[i] = 22000;
                                            }
                                            else if (topupff[i] == 210){
                                                hargaff[i] = 32000;
                                            }
                                            else {
                                                System.out.println("MAAF PILIHAN DIAMOND TIDAK TERSEDIA!!!");
                                                System.out.print("Ingin Melanjutkan transaksi ? [y/n] : ");
                                                ulang = input.readLine();
                                                if (ulang.equalsIgnoreCase("y")){
                                                    continue PILIHANFF;
                                                }
                                                else {
                                                    System.out.println("TRANSAKSI DIBATALKAN!!!!!");
                                                    System.exit(0);
                                                }
                                            }

                                            totalhargaff += hargaff[i];
                                            totaldiamondff += topupff[i];

                                            System.out.println("|===============================================================");
                                            System.out.println("|    PESANAN TOP-UP KE "+(i+1)+" ANDA BERHASIL DI TAMBAHKAN     ");
                                            System.out.println("|===============================================================");
                                            System.out.println("|ID Game          : "+idff[i]);
                                            System.out.println("|Nickname Game    : "+nickff[i]);
                                            System.out.println("|Top-up           : "+topupff[i]+" Diamond");
                                            System.out.println("|Harga            : Rp."+(int)hargaff[i]);
                                            System.out.println("|===============================================================");
                                            System.out.println();

                                        }

                                        System.out.println("|=================================================");
                                        System.out.println("|               TOTAL PEMESANAN  ");
                                        System.out.println("|=================================================");
                                        for (i=0;i<jumlahtopupff;i++){
                                            System.out.println("| Pesanan top-up ke-"+(i+1)+" dengan ID Game : "+idff[i]+" | Top-up : "+topupff[i]+" Diamond  | Harga : Rp."+(int)hargaff[i]);    
                                        }
                                        System.out.println("|-------------------------------------------------");
                                        System.out.println("| TOTAL DIAMOND PESANAN ANDA    : "+totaldiamondff+" Diamond");
                                        System.out.println("|-------------------------------------------------");
                                        System.out.println("| TOTAL PEMBAYARAN ANDA SEBESAR : Rp."+(int)totalhargaff);
                                        System.out.println("|=================================================");

                                        System.out.println();
                                        System.out.print(" Konfirmasi Pembayaran ? [y/n] : ");
                                        konfirmasi = input.readLine();

                                        if (konfirmasi.equalsIgnoreCase("y")){
                                            System.out.println("|=============================");
                                            System.out.println("| SELAMAT TOP-UP ANDA BERHASIL  ");
                                            System.out.println("|=============================");
                                            System.out.println("|Jenis Transaksi : "+transaksi);
                                            System.out.println("|-----------------------------");
                                            for (i=0;i<jumlahtopupff;i++){
                                            System.out.println("| Pesanan top-up ke-"+(i+1)+" dengan ID : "+idff[i]+" | Jumlah top-up : "+topupff[i]+" Diamond  | Harga : Rp."+(int)hargaff[i]);
                                            }
                                            System.out.println("|-----------------------------");
                                            System.out.println("| TOTAL DIAMOND : "+totaldiamondff+" Diamond");
                                            System.out.println("|-----------------------------");
                                            System.out.println("| TOTAL HARGA   : Rp."+(int)totalhargaff);
                                            System.out.println("|=============================");
                                            
                                        }
                                        else {
                                            System.out.println("TRANSAKSI DIBATALKAN!!!!!!");
                                            System.exit(0);
                                        }
                                        System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                        ulang = input.readLine();
                                        if (ulang.equalsIgnoreCase("y")){
                                            continue MENU_UTAMA;
                                        }
                                        else {
                                            System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN"); 
                                            System.exit(0);
                                        }
                                    }
                                        break;
                                    
                                    default : 
                                    System.out.print("Ingin Melakukan Transaksi lagi ? [y/n] : ");
                                    lagi = input.readLine();
                                    if (lagi.equalsIgnoreCase("y")){
                                        continue;
                                    }
                                    else {
                                        System.out.println("TERIMA KASIH, SEMOGA HARIMU MENYENANGKAN");
                                        System.exit(0);
                                    }
                                    break;    
                                }
                            }
                            
                        case 4 :
                            System.exit(0);
                            break;
                         
                        default :
                            System.out.println("MAAF PILIHAN YANG ANDA PILIH TIDAK TERSEDIA!!!!");
                            break;
                }  
            }
            while(pilihan !=4);
           
        } 
        catch (Exception ie){
            System.out.println("MAAF DATA YANG DI INPUT TIDAK SESUAI!!!!!");
        }
    }    
}
