public class Selection {

    public void select( /*int k,*/ int[] L, int si, int ei ){
        int[] D = new int[L.length];
        for (int i = 0; i < L.length; i++){
            if (i == si) {
                D[i] = L[i];
            }   else {
                i = si-1;
            }
        }
        int save = L[si];
        int i = si;
        while (si < ei){
            if (L[i] < save) {
                D[si] = L[i];
                si++;
            } else {
                D[ei] = L[i];
                ei--;
            }
             i++;
        }
        D[si] = L[i];
        }
    }

    public static void main(String[] args){
        Selection s = new Selection();
        s.select( [4, 6, 2, 7, 1, 8, 3, 9, 0, 5] , 3, 6);
    }
    
}
