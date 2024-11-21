public class Collatz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]); 
        String mode = args[1];  

        if (mode.equals("v")) {
            for (int i = 1; i <= n; i++) {
                int number = i;
                int steps = 0;
                String sequence = Integer.toString(number); 

             
                while (number != 1) {
                    steps++;
                    if (number % 2 == 0) {
                        number = number / 2;
                    } else {
                        number = (number * 3) + 1;
                    }
                    sequence += " " + number;  
                }

                System.out.println(sequence + " (" + (steps + 1) + ")");
            }
        } else {
            
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        }
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		
    }
}
