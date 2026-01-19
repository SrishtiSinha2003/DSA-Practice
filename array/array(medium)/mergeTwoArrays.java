// public class mergeTwoArrays {
//     public static int[] merge(int[] a, int[] b) {
//         int n = a.length;
//         int m = b.length;

//         int[] result = new int[n+m];

//         int i = 0, j = 0, k = 0;
//          while(i < n && j < m){
//             if(a[i] <= b[j]){
//                 result[k++] = a[i++];
//             }else{
//                 result[k++] = b[j++];
//             }
//         }

//         // remaining elements of a
//         while(i < n){
//             result[k++] = a[i++];
//         }

//         // remaining elements of b
//         while(j < m){
//             result[k++] = b[j++];
//         }

//         return result;
//     }
//     public static void main(String args[]) {
//         int[] a = {1,3,5};
//         int[] b = {2,4,6};

//          int[] merged = merge(a, b);

//         for(int x : merged){
//             System.out.print(x + " ");
//         }
//     }
// }


public class mergeTwoArrays {
    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] result = new int[n+m];

        int i=0, j=0, k=0;

        while(i < n && j < m) {
            if(a[i] <= b[i]) {
                result[k++] = a[i++];
            }
            else {
                result[k++] = b[j++];
            }
        }
        while (i<n) {
            result[k++] = a[i++];
        }
        while (j<m) {
            result[k++] = b[j++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};

        int[] merged = merge(a, b);
        
        for(int x : merged){
        System.out.println(x + " ");
        }
    }

}