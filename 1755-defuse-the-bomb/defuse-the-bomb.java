class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        for(int i=0;i<code.length;i++)
        {
            if(k==0)
            {
                arr[i]=0;
            }
            else if(k>=1)
            {
                int sum=code[(i+1)%code.length];
                for(int j=0;j<k-1;j++)
                {
                    System.out.println(sum);
                    sum+=code[(i+j+2)%code.length];
                }
                System.out.println();
                arr[i] = sum;

            }
            else
            {
                int s=0;
                int l = k*-1;
                for(int j=1;j<=l;j++)
                {
                    s+=code[(i-j+code.length)%code.length];
                }
                arr[i] = s;

            }
        }
        return arr;
    }
}