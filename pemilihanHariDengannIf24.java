import java.util.Scanner;

public class pemilihanHariDengannIf24 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName,dayType;
        System.out.print("Input number day : ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "1" :
            case "2" :
            case "3" :
            case "4" :
            case "5" :
            dayType = "weekday";
            break;

            case "6" :
            case "7" :
            dayType = "weekend";
            break;

            default:
            dayType="invalid number ";
                break;
        }
System.out.println(dayName+ " is a " + dayType);
    }
}
