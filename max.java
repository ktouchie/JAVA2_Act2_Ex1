import java.util.*;
class max {
    
    public static void main(String[] args) {
        
        int tab[] = {9,1,6,7,3,5,2,4,0,8};        
        
        int i, j;
        
        for (i = tab.length-1; i>0; i--) {
            
            int max = i;
            
            for (j = i-1; j>=0; j--) {
                if (tab[j]>tab[max]) {
                max = j;
                }
            }

            if (max != i){
                int x = tab[i];
                tab[i] = tab[max];
                tab[max] = x;
                System.out.println(Arrays.toString(tab));
            }
            
        }
        
        System.out.println(Arrays.toString(tab));
    }
    
    
    
}