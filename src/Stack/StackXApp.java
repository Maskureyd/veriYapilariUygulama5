package Stack;

public class StackXApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push('s');
        theStack.push('a');
        theStack.push('d');
        theStack.push('a');

        while(!theStack.isEmpty()){
            char peekValue = theStack.peek();
            char value = theStack.pop();
            //long value = theStack.pop();
            //System.out.print(value + " " + "PEEK= " + peekValue + "");
            System.out.print(value + "");


        }
        System.out.println("");
     }
}
