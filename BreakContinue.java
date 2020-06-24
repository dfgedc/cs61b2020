public class BreakContinue {
    public static int[] windowPosSum(int[] a,int n) {
        int[] arr = new int[a.length];
        for ( int i = 0; i < arr.length; i++) {
            if(a[i]<0) 
            {
                arr[i] = a[i];
            }
            for(int j =i;j<i+n;i++)
            {
                arr[i] = arr[i]+a[j];
                if(j>a.length){
                    break;
                }
            }
        }
        return arr;
    }
}