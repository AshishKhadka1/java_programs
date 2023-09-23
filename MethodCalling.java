public class MethodCalling {
    public static void printJava(){
        System.out.println("Hello, Java");
    }
    public static void sumPrint(int a, int b){
       int sum=a +b;
        System.out.println(sum);
    }
    public static void main(String[] args){

        printJava();
        sumPrint(11,13);
    }
}
