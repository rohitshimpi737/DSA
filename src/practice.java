import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer> > list= new ArrayList<List<Integer> >();
        System.out.println("Enter size ");
        int n=scanner.nextInt();
        //int m=scanner.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter arrays elements");
        for (int i = 0; i <n ; i++) {
        arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0) {
                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));


                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }

                else if(arr[i]+arr[j]+arr[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        System.out.println(list);


    }
}
