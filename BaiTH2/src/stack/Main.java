package stack;

public class Main {

    public static void main(String[] args) {

        int []arr={1,2,3,4,5};
        int []arrReverse = new int[arr.length];
        System.out.print("\nDanh sach cho truoc : ");
        for(long x:arr){
            System.out.print(x+" ");
        }

        Stack stack= new Stack(arr.length);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<stack.getMaxSize();i++){
            arrReverse[i]=stack.pop();
        }

        System.out.print("\nHàm sau khi đảo : ");
        for(long x:arrReverse){
            System.out.print(x+" ");
        }

    }
}