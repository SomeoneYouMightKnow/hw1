public class Selection {

    public void select( /*int k,*/ int[] L, int si, int ei ){
        int[] D = new int[L.length];
        for (int i = 0; i < L.length; i++){
            if (i <= si || i > ei) {
                D[i] = L[i];
            }   else {
                i = ei+1;
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
	return;
        }
    

    public static void main(String[] args){
        Selection s = new Selection();
	int[] a = new int[]{4, 6, 2, 7, 1, 8, 3, 9, 0, 5};
        s.select( a, 3, 6);
    }
    
}
