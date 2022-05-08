package stack;

public class Main {

    public static void main(String[] args) {

        // Khoi tao stack su dung danh sach lien ket voi size la 6
        InStack StackLinkedList = new StackLinkList(6);
        StackLinkedList.push(2);
        StackLinkedList.push(6);
        StackLinkedList.push(0);
        StackLinkedList.push(7);
        StackLinkedList.push(3);
        StackLinkedList.push(10);
        System.out.print(StackLinkedList.isFull()?"Full ! ":"Not Full !");
        System.out.print("\nPeek : "+ StackLinkedList.peek());
        System.out.print("\nPop  : "+StackLinkedList.pop());
        System.out.print("\nPeek :"+StackLinkedList.peek());

        int []arr={1,2,3,4,5};
        int []arrReverse = new int[arr.length];
        System.out.print("\nDanh sách ban đầu : ");
        for(int x:arr){
            System.out.print(x+" ");
        }

        Stack stack= new Stack(arr.length);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<stack.getMaxSize();i++){
            arrReverse[i]=stack.pop();
        }

        System.out.print("\nDanh sách sau khi đảo : ");
        for(int x:arrReverse){
            System.out.print(x+" ");
        }

    }
}