public class quickselect {

    public static void main(String[] args){
        int[] a={1,5,3,4,8,11};
        int ans=quick_select(a, 4, 0, a.length-1);
        System.out.println(ans);
    }


    private static int quick_select(int[] a, int k, int left, int right) {

        int pivot=findpivot(a,left,right);
        if(pivot==k-1){
            return a[pivot];
        }
        if(k-1<pivot){
            return quick_select(a, k, left, pivot-1);
        }
        else {
            return quick_select(a, k, pivot+1, right);
        }

    }

    private static int findpivot(int[] a, int left, int right) {

        int pivot = a[(left+right)/2];
        while(left<right){
            while(a[left]<pivot){
                left++;
            }
            while(a[right]>pivot){
                right--;
            }

            if(left<right){
                swap(a,left,right);
                left++;
                right--;
            }

        }
        return left;
    }

    private static void swap(int[] a, int i, int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }

}