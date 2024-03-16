import java.util.*;
class CharDisp{
    int chkprm(int x){
        int z=0;
        if(x==0||x==1){
            z=0;
        }
        else if(x==2){
            z=1;
        }
        else{
            for(int y=2;y<x;y++){
                if((x%y)==0){
                    z=0;
                    break;
                }
                else{
                    z=1;
                }
            }
        }
        return z;
    }
    void primedisp(String str){
        for(int i=0;i<str.length();i++){
            if(chkprm(i)==1){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }
    }
}
public class CharacterDisplayer{
    public static void main(String args[]){
        String st;
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        st=sc.nextLine();
        CharDisp cd = new CharDisp();
        System.out.println("Output is (Starting from 0) : ");
        cd.primedisp(st);
    }
}