import java.util.*;
class Checker{
    int val=0;
    void check(int arr[]){
        Arrays.sort(arr);
        int i,j;
        for(i=0;i<=arr.length-1;i++){
            for(j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j])
                {
                    val = 1;
                    break;
                }
            }
        }
        if(val!=1){
            for(i=0;i<=arr.length-2;i++){
                if(arr[i]+1==arr[i+1]){
                    val=0;
                }
                else
                {
                    val=1;
                    break;
                }
            }
        }
        if(val==0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }

}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number of elements : ");
        num = sc.nextInt();
        int ary[] = new int [num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter Element["+(i+1)+"] : ");
            ary[i]=sc.nextInt();
        }
        System.out.println("Entered Array is : ");
        for(int i=0;i<=ary.length-1;i++)
        {
            System.out.print(ary[i]+",");
        }
        System.out.println(" ");
        Checker chk = new Checker();
        chk.check(ary);
    }
}