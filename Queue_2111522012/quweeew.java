import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class quweeew {
    public static void main(String[] args) {
        Integer angka;
        String menu;
        String nama;
        boolean bool = true;

        Queue<String> antrian = new LinkedList<>();
        Queue<Integer> nomor= new LinkedList<>();
        Queue<String> name= new LinkedList<>(); //deklarasi queue
        
        Scanner pilih = new Scanner(System.in);
        Scanner mkn = new Scanner(System.in);
        Scanner no = new Scanner(System.in);
        Scanner org = new Scanner(System.in);


        System.out.println("\t\t\t\t\t     WAROENG KEEPCI");
        System.out.println("\t\t\t\t=======================================");

        do{
            System.out.println("\t\t\t\t 1. Masukan Pesanan Pelanggan:");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.println("\t\t\t\t 2. Pengambilan Pesanan Pelanggan");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.println("\t\t\t\t 3. Pemanggilan Pelanggan Selanjutnya");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.println("\t\t\t\t 4. Pencekan Kondisi Antrian");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.println("\t\t\t\t 5. Tampilkan Antrian");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.println("\t\t\t\t 6. Selesai");
            System.out.println("\t\t\t\t---------------------------------------");
            System.out.print("\t\t\t\t MASUKAN PILIHAN [1-6]: ");
            int input=pilih.nextInt();
            switch(input){
                case 1:
                    System.out.print("\n\t\t\t\t Nama Pelanggan: ");
                    nama = org.nextLine();
                    antrian.add(nama);
                    System.out.print("\t\t\t\t Banyak pesanan: ");
                    angka = no.nextInt();
                    nomor.add(angka);
                    System.out.print("\t\t\t\t Nama menu: ");
                    menu = mkn.nextLine();
                    name.add(menu);
                    break;

                    
                case 2:
                    if(antrian.isEmpty()){
                    System.out.println("\n\t\t\t\t Belum ada Pesanan");
                    }
                    else{
                    System.out.println("\t\t\t\t Pengambilan pesanan atas nama: "+antrian.poll());
                    nomor.poll();
                    name.poll();
                    }
                    break;

                case 3:
                    System.out.println("\n\t\t\t\t Pelanggan Berikutnya: "+antrian.peek()); //bisa menggunakan method element()
                    System.out.println("");
                    break;

               case 4:
                    System.out.println("\n\t\t\t\t Apakah tidak ada pelanggan lagi? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("\n\t\t\t\t Queue: "+antrian);
                    System.out.println("");
                    break;

                case 6:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("\n\t\t\t\t Pilihan tidak tersedia!");
                System.out.println("");
            }
        }
        while(bool);
    }
}
