import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4, 5};
        sumtriangle(arr);
    }
    static void sumtriangle(int[] newarr)
    {
        if(newarr.length ==0)
            return;
        else
        {
            int[] newA = new int[newarr.length-1];
            for(int i=0;i<newarr.length-1;i++)
            {
                newA[i] = newarr[i]+newarr[i+1];
                
            }
            sumtriangle(newA);
            System.out.println(Arrays.toString(newarr));  
        }

    }
}
