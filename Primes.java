public class Primes {
    public static void main(String[] args) {
   
    int n = Integer.parseInt(args[0]); 
    
   
    boolean[] isPrime = new boolean[n + 1];
    

    for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }


    for (int j = 2; j * j <= n; j++) {
        
        if (isPrime[j] == true) { 
            
           
            for (int i = j * j; i <= n; i += j) {
                isPrime[i] = false; 
            }
        }
    }
    
  
System.out.println("Prime numbers up to " + n + ":");

int primeCount = 0; 


for (int i = 2; i <= n; i++) {
    
   
    if (isPrime[i]) {
        System.out.println(i); 
        primeCount++;
    }
}


        
         double percentage = (double)primeCount / n * 100; 
         System.out.print("There are " + primeCount + " primes between 2 and " + n +"(" + (int)percentage + "% are primes)"); 

         
    }
    }
   
