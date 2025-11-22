import java.util.Arrays;
class h_index {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for (int i=0;i<citations.length;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }
        return 0;

        
    }
}