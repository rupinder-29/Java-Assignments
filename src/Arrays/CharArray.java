import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
       // initialization of a char array
        //char[] arr = {'a', 'b', 'z', 't', 'p'};
       // user-input
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the values");
        char[] ch= new char[5];
        int n=ch.length;
        int j= ch.length-1;
        for (int i=0;i<ch.length;i++){
            ch[i]=scanner.next().charAt(0);
        }
        for (int i = 0; i <=n / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[j-i];
            ch[j-i]= temp;
        }
            for(char e:ch)
                {
                    System.out.print(e);
                }
    }
}
