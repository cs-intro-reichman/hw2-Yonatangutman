
public class TimeCalc {
    public static void main(String[] args) {
    int hours= Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    int extraMin = Integer.parseInt(args[1]);
    int totalMinutes = (hours*60 + minutes + extraMin);
    int totalHours = (totalMinutes/60);
    int calcHours = (totalHours)%24;
    int calcMinutes = (totalMinutes-(totalHours*60)); 
    String minutesNewString = "";
    if (calcMinutes<10) {
        minutesNewString = "0" + calcMinutes;
    }
    else { minutesNewString = "" + calcMinutes; 

   }

    String hoursNewString = "";
    if (calcHours<10) {
        hoursNewString = "0" + calcHours;
    }
    else { hoursNewString = "" + calcHours; 

    }
    System.out.println(hoursNewString + ":" + minutesNewString);


    }

    }


