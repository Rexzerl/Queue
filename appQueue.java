package Queue;
import java.util.Scanner;

public class appQueue {
    public static void main(String[] args) {
        simpul  s = new simpul("Sepatu",200000);
        Queue q = new Queue ();
        Scanner sc = new Scanner(System.in);
        int pilih=0;
        int pemasukkan=0;
        do{
            System.out.println("Antrian Pembelian");
            System.out.println("1.Enqueue\n2.Dequeue");
            System.out.println("3.View\n4.Exit");
            System.out.println("Pilih = ");
            pilih = sc.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("Daftar Barang ; ");
                System.out.println("1. Sepatu\n2. Tas");
                System.out.println("3. Sandal");
                System.out.print("Pilih : ");
                int pilih2=sc.nextInt();
                switch(pilih2){
                    case 1:
                      s = new simpul("Sepatu",200000);
                        break;
                    case 2:
                        s = new simpul("tas",150000);
                        break;
                    case 3:
                        s = new simpul("Sandal",100000);
                        break;
                }
                q.enqueue(s);
                break;
            case 2:
                simpul t=q.dequeue();
                if(t!=null){
                System.out.println("Check Out "+ t.barang);
                 pemasukkan+=t.harga;
            
               } else System.out.println("Queue Kosong");
                System.out.println("Total Pemasukkan : "+pemasukkan);
                break;
            case 3:
                q.view();
                int total=0;
                for(simpul temp=q.front;temp!=null; temp=temp.prev){
                    total=total+temp.harga;
                }
                System.out.println("Total Transaksi : "+total);
                break;
            case 4:
                System.out.println("Thanks");
                break;
        }
        
    }while (pilih!=4);
        }
      
    
}