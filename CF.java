import java.util.*;

import java.util.stream.IntStream;

public class CF{
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);



        int t=sc.nextInt();



        while(t>0){





            int n=sc.nextInt();



            int arr[]=new int[n];



            // HashSet<Integer> h=new HashSet<>();



            int got=0;

            int min=0;

            for(int i=0;i<n;i++){



                arr[i]=sc.nextInt();

                if(arr[i]<0)

                {

                    got=1;

                    min=arr[i];

                }

                // h.add(arr[i]);

            }



            if(got==1){

                System.out.println(min);

            }else{

                Arrays.sort(arr);

                System.out.println(arr[n-1]);

            }

            t--;

        }



    }

}