public class queue {
    int [] data;
int front;
int rear;
int size;
int max;

public queue(int n){
    max = n;
    data = new int[max];
    size = 0;
    front = rear = -1;
}
public boolean isEmmpty(){
    if (size == 0){
        return true;
    } else {
        return false;
    }
}
public boolean isFull(){
    if (size == max){
        return true;
    } else {
        return false;
    }
}
public void peek(){
    if(!isEmmpty()){
        System.out.println("Elemen terdepan: "+ data[front]);
    } else {
        System.out.println("Queue masih kosong!");
    }
}
public void print(){
    if (isEmmpty()) {
        System.out.println("Queue masih kosong!");
    } else {
        int i = front;
        while ( i != rear) {
            System.out.print(data[i] + " ");
            i = (i + 1) % max;
        }
        System.out.print(data[i] + " ");
        System.out.println("Jumlah elemen = " + size);
    }
}
public void clear(){
    if (!isEmmpty()){
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan!");
    } else {
        System.out.println("Queue sudah kosong");
    }
}
public void Enqueue(int dt) {
    if ( isFull()){
        System.out.println("Queue sudah penuh!");
        System.exit(0);
    } else {
        if (isEmmpty()){
            front = rear = 0;
        } else {
            if (rear == max - 1){
                rear = 0;
            } else {
                rear++;
            }
    }
    data[rear] = dt;
    size++;
}
}
public int Dequeue(){
    int dt = 0;
    if (isEmmpty()) {
        System.out.println("Queue masih kosong!");
        System.exit(0);
    } else {
        dt = data[front];
        size--;
        if (isEmmpty()){
            front = rear = -1;
        } else {
            if (front == max - 1){
                front = 0;
            } else {
                front++;
            }
        }
    }
    return dt;
} 
}
