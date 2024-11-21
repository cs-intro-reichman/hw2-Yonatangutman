public class Cheers {
        public static void main(String[] args) {
            String name = args[0].toUpperCase();  
            int N = Integer.parseInt(args[1]);   
            int lengthName = name.length();      
            String check = "AEFHILMNORSX";        

            
            for (int i = 0; i < lengthName; i++) {
                String add;
                char a = name.charAt(i);  
                if (check.indexOf(a) >= 0) {
                System.out.println("Give me an " + a + ": " + a + "!") ;

                    add = "an";  
                } else {
                     System.out.println("Give me a  " + a + ": " + a +"!");  
                    add = "a";   
                }
    
            }
    
          
            System.out.println("What does that spell?");
    
           
            for (int i = 0; i < N; i++) {
                System.out.println(name + "!!!");
            }
        }
    }
    
