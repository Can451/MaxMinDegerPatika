import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.print("Sayı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int [] list = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(list);
        System.out.println("Dizimizin sıralanmış hali");
        System.out.println(Arrays.toString(list));

        for (int i = 0; i<list.length;i++){

            if (a<list[i]){

                System.out.println("Max en yakın değer: "+ list[i]);
                System.out.println("Min en yakın değer"+list[i-1]);
                break;


            }


        }









    }
}
