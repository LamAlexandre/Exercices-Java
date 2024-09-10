//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int a = 33;
        int b = 54;
        int c = pgcd(a,b);
        system.out.println("c");
    }
    public static int pgcd(int a, int b){
    while(b!=a){
        if(a>b){
            a=a-b;
        }
        else{
            b=b-a;
        }
    }
    return a;
}