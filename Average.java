import java.util.*;
class AvgCal{
    int num;
    double avg,sum;
    double avgcal(int num,int ary[]){
        int i;
        for(i=0;i<num;i++){
            this.sum=ary[i]+this.sum;
        }
        this.avg=this.sum/num;
        return this.avg;

    }
    void display(double avg){
        this.avg=avg;
        System.out.println("The average is : "+this.avg);
    }

}
class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter Element-["+(i+1)+"] : ");
            arr[i]=sc.nextInt();
        }
        AvgCal ac = new AvgCal();
        ac.avgcal(10, arr);
        ac.display(ac.avg);
    }
}