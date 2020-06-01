import java.util.Arrays;

public class ArrayParser {
    public static int[]  first(int[] a)  throws BadFormat {
        int ind = Arrays.binarySearch(a, 0, a.length, 4);
        if (ind < 0) throw new BadFormat();
        int [] tmp = Arrays.copyOfRange(a, ind, a.length);
        return tmp;
    }

    public boolean second(int[] a) {
        boolean s1=false,s4=false,s0=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==1) s1=true;
            if(a[i]==4) s4=true;
            if(a[i]!=1 && a[i]!=4) s0=true;
        }
        return (s1 && s4 && (!s0));
    }

    public static void main(String[] args) {
        int[] f1 = {1,2,3,4,5,6,7,8};
        first(f1);
    }
}
