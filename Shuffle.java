class PrinT{
    void printer()
    {
        int i,j,k;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                for(k=1;k<=3;k++)
                {
                    if(i!=j && j!=k && k!=i)
                    {
                        System.out.println(i+","+j+","+k);

                    }
                }
            }
        }
    }
}
public class Shuffle{
    public static void main(String args[]){
        PrinT p = new PrinT();
        p.printer();
    }
}