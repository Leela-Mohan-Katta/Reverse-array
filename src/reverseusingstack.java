import java.util.Stack;

public class reverseusingstack {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        /*
        Stack is a collection framework, Stack will store the data in LIFO order (Last In First Out)
        so we add the data into the stack and we take back them simply makes them reverse order.
         */
        Stack<Integer> stack=new Stack<>();
        for(int element:arr){
            stack.push(element);
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=stack.pop();
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
    }
}
