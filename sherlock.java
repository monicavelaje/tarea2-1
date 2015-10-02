//Input Example

_INPUT = "2\n3 9\n17 24";

//Expected Output
/*
2
0
*/

//Second Input Example (Remember to comment the first example in order
//and uncomment the next line in order test this case)

//_INPUT = "4\n1 8\n2 4\n10 13\n11 20";

//Expected Output
/*
2
1
0
1
*/

//----- Start your code here -------
public class Sherlock {
    
    public static void main(String[] args) {
        
        String s = "2\n3 9\n17 24";
        String[] split = s.split("\\n");
        for (int i = 1; i <= Integer.parseInt(split[0]); i++) {
            String[] interval = split[i].split("\\ ");
            int a = Integer.parseInt(interval[0]);
            int b = Integer.parseInt(interval[1]);
            int roots = getNumberOfRoots(a, b);
            System.out.println();
            System.out.println("Interval " + a + " to "+ b + " has " + roots + " roots");
        }
        
    }
    
    private static int getNumberOfRoots(int a, int b) {
        int count = 0;
        if (b < a) { //por si el intervalo está escrito al revés
            final int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            if ( PerfectRoot(i) ) count++;
        }
        return count;
    }
    
    private static boolean PerfectRoot(int num) {
        final int sqrt = (int) Math.sqrt(num);
        return  sqrt*sqrt == num;
    }
    
}
