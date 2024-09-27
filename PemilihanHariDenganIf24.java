import java.util.Scanner;
public class PemilihanHariDenganIf24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayNumber;
        String pekan;

        System.out.println("Input Number :");
        dayNumber = input.nextInt();

        if (dayNumber ==1 ) {
            pekan = "weekday";
        }
        else if (dayNumber ==2){
            pekan = "weekday";
        }
        else if (dayNumber ==3){
            pekan = "weekday";
        }
        else if (dayNumber ==4){
            pekan= "weekday";
        }
        else if (dayNumber ==5){
            pekan = "weekday";
        }
        else if (dayNumber ==6){
            pekan = "weekend";
        }
        else if (dayNumber ==7){
            pekan = "weekend";
        }
        else { 
            pekan = "ERRORR";
        }

        System.out.println(dayNumber + " is a " + pekan);

        }

}