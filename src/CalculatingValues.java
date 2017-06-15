/**
 * Created by Vladlen on 15.06.2017.
 */
public class CalculatingValues {

    private String calculationTwo( int max, int step, double x){
        double answer = 0;
        String asd = "";

        for ( int k = 0; k < max; k = k +step){
         answer +=  Math.pow(-1, k) * Math.pow(x, 2*k)/ factorial(k);
        }


        if (Double.toString(answer).length()>=6){
            asd = Double.toString(answer).substring(0,6);
        }
        if (Double.toString(answer).length()<6) {
            asd = Double.toString(answer);
            while (asd.length()<6) {
                asd += "0";
            }
        }

        //System.out.println(asd.length());

        return asd;
    }
    public String[] calculationOne(int max, int step){
        String[] sums = new String[52];
        int koef = 0;
        for (double  x = 0; x <= 50; x++){
            double xd = x/100;
            sums[koef] = calculationTwo(max, step, xd);
            koef++;
          // System.out.println(Double.toString(xd));
        }

        return sums;
    }


    private static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
