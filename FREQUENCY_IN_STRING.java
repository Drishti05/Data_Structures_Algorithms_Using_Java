/*Take an array frequency of size 26 and hash the 26 characters with indices of the array 
by using the hash function. Then, iterate over the string and increase the value in the frequency
at the corresponding index for each character. The complexity of this approach is O(N) where N is the 
size of the string.*/
package frequency_in_string;
import java.util.Scanner;
public class FREQUENCY_IN_STRING {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); //Taking input of a string
        frequency(S);
        
       
    }
    
    static int hashfunc(char c)//Function to compute the hash value
    { 
        return(c -'a');
    }
    static void frequency(String s)// Function to compute the frequency of each character
    { 
        int[] Frequency = new int[26];
        for(int i=0;i<s.length();i++)// To assign frequency value corresponding to each character  
        {
            int index = hashfunc(s.charAt(i));
            Frequency[index]++;
        }
        for(int j=0;j<26;j++)//  To print the frequency of each character
        {
            System.out.println((char)(j+'a')+" "+Frequency[j]);
        }
        
        
        
    }
            
    
}
