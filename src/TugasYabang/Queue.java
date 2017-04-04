package TugasYabang;

/**
 * Created by Raja T on 4/4/2017.
 */


public class Queue {
    int ar[] = new int [10];
    int Tambah = -1;
    int Kurang = 0;


    public static void main(String [] yusuf){
        Queue ka = new Queue();



        ka.enqueue(3);
        ka.view();
        ka.enqueue(6);
        ka.enqueue(7);
        ka.view();
        ka.dequeue();
        ka.view();
        ka.dequeue();
        ka.view();
    }

    public void enqueue(int angka){
        if(!isFull()){
            Tambah++;
            ar[Tambah] = angka;

            System.out.println("Nilai " + angka + " berhasil di enqueue");
        }else{
            System.out.println("No Penuh");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            int indexKurang = Kurang;
            Kurang++;
            System.out.println("Antrian indek " + indexKurang  + " berhasil di dequeue");
        }else{
            System.out.println("Antrian kosong");
        }
    }

    public void view(){
        if(!isEmpty()){
            System.out.print("Isi Antrian sekarang : ");
            for (int i = Kurang; i <= Tambah; i++) {
                System.out.print( ar[i] + " ");
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }

    }

    boolean isFull(){
        if(Tambah == ar.length){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(Tambah == -1){
            return true;
        }
        return false;
    }

}

//memang hampir sama dengan code orang,tetapi code ini sepenuhnya dipelajari oleh programernya.
//nama dibuat berdasarkan fiktif Belaka maaf jika ada kemiripan
//yeaayy
