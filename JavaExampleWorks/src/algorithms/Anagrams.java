package algorithms;
import java.util.Scanner;

public class Anagrams {

        static boolean isAnagram(String a, String b) {
            a=a.toLowerCase();
            b=b.toLowerCase();
            if(a.length()==b.length()){
                int[] s1=new int[256];
                int[] s2=new int[256];

                for(int i=0;i<a.length();i++){
                    s1[(int)a.charAt(i)]+=1;
                    s2[(int)b.charAt(i)]+=1;
                }
                for(int i=0;i<256;i++){
                    if(s1[i]!=s2[i]){
                        return false;
                    }
                }
                return true;
            }

            else{
                return false;
            }
        }



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("First String Enter: ");
            String a = scan.next();
            System.out.println("Second String Enter: ");
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


