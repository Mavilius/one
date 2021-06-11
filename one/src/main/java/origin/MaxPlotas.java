package origin;

public class MaxPlotas{
	     
     public static int max(int[] t) {
    	    int maximum = t[0];   
    	    for (int i=1; i<t.length; i++) {
    	        if (t[i] > maximum) {
    	            maximum = t[i];   
    	        }
    	    }
    	    return maximum;
}
}