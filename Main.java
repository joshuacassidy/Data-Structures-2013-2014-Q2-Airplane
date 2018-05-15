public class Main {

    public static void main(String[] args) {
        Heap<Passenger> heap = new Heap<>();
        Passenger s1 = new Passenger("a", "a", 1);
        Passenger s2 = new Passenger("b", "a", 2);
        Passenger s3 = new Passenger("c", "a", 3);
        Passenger s4 = new Passenger("d", "a", 4);
        Passenger s5 = new Passenger("e", "a", 5);
        heap.push(s1);
        heap.push(s2);
        heap.push(s3);
        heap.push(s4);
        heap.push(s5);
        System.out.println(heap);

        heap.pop();
        heap.sort();
        System.out.println(heap);
    }
}