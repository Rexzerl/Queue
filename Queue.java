package Queue;

 class Queue {
    simpul front,rear;
    Queue() {front=rear=null; }
    void enqueue(simpul baru){
        if(rear==null){
            front = rear = baru;
        }
        else{
            rear.prev = baru;
            baru.next = rear;
            rear = baru;
        }
        System.out.println("enqueue sukses...");
    }
    simpul dequeue(){
        simpul t=null;
        if(front == null){
            System.out.println("Queue kosong");
        }
        else if(front.prev==null){
                front=rear=null;
                System.out.println("dequeue sukses");
                }                
                else{
                t=front;
                simpul temp=front.prev;
                front.prev=null;
                temp.next = null;
                front = temp;
                System.out.println("dequeue sukses");
                }

        return t;
    }
    void view(){
        System.out.println("Isi Queue: ");
        for(simpul t=rear; t!=null; t=t.next){
            System.out.print(t.barang+" ["+t.harga+"] ");
        }
        System.out.println("");
    }
}