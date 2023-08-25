package algorithms;

public class SumNumberOfSameNumbers3 {

        public static void main(String[] args) {
        int list[]={1,12,1,3,1,12};
        int[] list2=new int[list.length];
        int repeatedNumber=0;
        for(int r:list){
            int a=0;
            for(int j=0; j<list.length;j++){
                if(r==list2[j]){
                    a++;
                }
            }
            if(a==0){
                int counter=0;
                for(int i:list){
                    if(r==i){
                        counter++;
                    }
                }
                list2[repeatedNumber]=r;
                repeatedNumber++;
                System.out.println(r+" sayısından "+counter+" tane var");
            }
        }


            }
        }
