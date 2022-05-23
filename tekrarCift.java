import java.util.Arrays;

public class tekrarCift
{
    public static void main(String[] args)
    {
        int[] liste={1,6,4,76,24,24,24,76,9,4,4,1,7};
        int[] dupl = new int[liste.length];
        int indexInit=0;

        for(int i=0;i<liste.length;i++)
        {
            for(int j=0;j<liste.length;j++)
            {
                if((i!=j) && (liste[i]==liste[j]))
                {
                    if(!Detect(dupl,liste[i]))
                    dupl[indexInit++]=liste[i];
                    break;
                }
            }
        }

        for(int val: dupl)
        {
            if((val!=0) && (val%2==0))
                System.out.println(val);
        }

    }

    public static boolean Detect(int[] dizi, int deg)
    {
        for(int a:dizi)
        {
            if(a==deg)
                return true;
        }
        return false;
    }
}
