import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp;
        System.out.println("Hava Kac Derece? :");
        temp= inp.nextInt();

        if(temp<5){
            System.out.println("Kayak yap...");
        }
        if(temp>=5&& temp<15){
            System.out.println("Sinemaya Git...");

        }
        if(temp>=5&& temp<25){
            System.out.println("Piknik yap...");
        }
        if(temp>=25){
            System.out.println("Denize Git...");
        }
    }
}
