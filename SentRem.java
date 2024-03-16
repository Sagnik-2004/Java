import java.util.*;
class Remover{
    void rem(String st){
        String str1[]=new String [100];
	    String str2[]=new String [100];
	    int j=0;
	    int y=st.length();
	    int m=0;
	    while(st.charAt(m)!=' ' && m<y-1){
	        str1[j]=st.substring(0,m+2);
	        m++;
	        if(st.charAt(m-1)=='\0'){
	            break;
	        }
	    }
	    j++;
	    for(int i=1;i<y;i++){
	        if(st.charAt(i)==' '){
	            int k=i+1;
	            while(st.charAt(k)!=' ' && k<y-1){
	                    str1[j]=st.substring(i+1,k+2);
	                k++;
	            }
	            k=0;
	            j++;
	        }
	    } 
	    String t=str1[j-1]+" ";
	    str1[j-1]=t;
	    str2[0]=str1[0];
	    int k=1,f=0;
		for(int i=1;i<j;i++)
        {
            f=0;
            for(int e=0;e<k;e++)
            {
                if(str1[i].equals(str2[e]))
                {
                    f++;
                    break;
                }         
            }
            if(f==0)
            {
                
                str2[k]=str1[i];
                k++;
            }
            else
            {
                continue;
            }
        }
		System.out.println();
		for(int i=0;i<k;i++){
		    System.out.print(str2[i]);
		}
    }

}
public class SentRem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence : ");
        String str = sc.nextLine();
        Remover rm = new Remover();
        rm.rem(str);
    }
}