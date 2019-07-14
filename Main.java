import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        //Arbitrary numbers used for testing
        int d = 10; //transaction fee of d dollars for each transaction from dollars into Badgercoins
        int b = 3; //transaction fee of b Badgercoins for each transaction from Badgercoins to dollars
        int k = 100; // Initial amount of money you have
        int[] array = {10, 80, 90};
        double money = k;
        double badger = 0;
        
        badger = (double)(k-d)/array[0];
        
        for(int i = 1; i < array.length; i++) {
            if ( array[i] < array[i - 1] ) {
               if (((money-d)/array[i])>badger) {
                badger = (money-d)/array[i];
               }
            }
            else if(array[i] > array[i-1]) {
                if((badger - b)*array[i] > money) {
                    money = (double)(badger - b) * array[i];
                }
            }
        }
        System.out.println(money);
    }
}
