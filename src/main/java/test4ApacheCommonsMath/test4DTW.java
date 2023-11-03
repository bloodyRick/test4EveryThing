package test4ApacheCommonsMath;

/**
 * @author by woyuan  2023/1/12
 */
public class test4DTW {
    public static final int DTW_NUM = 10;
//https://blog.csdn.net/qq_43509940/article/details/103484302
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double[] d1 = {3,5,6,7,7,1,4};
        double[] d2 = {3,6,6,7,8,1,1};
        getDTW(d1, d2);
    }
    public static double Min(double a,double b,double c) {
        return (a<b?a:b)<c?(a<b?a:b):c;
    }
    public static double getDTW(double[] d1,double[] d2) {
        double[][] M = new double[d1.length][d2.length];
        double[][] Mc = new double[d1.length][d2.length];
        //距离矩阵
        for(int i=0;i<d1.length;i++) {
            for(int j=0;j<d2.length;j++) {
                M[i][j] = Math.abs(d1[i]-d2[j]);
            }
        }
        //距离矩阵输出测试
        for(int i=0;i<d1.length;i++) {
            for(int j=0;j<d2.length;j++) {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------");
        //累积距离矩阵
        Mc[0][0] = M[0][0];
        for(int i=1;i<d1.length;i++) {
            Mc[i][0] = Mc[i-1][0] + M[i][0];
        }
        for(int j=1;j<d2.length;j++) {
            Mc[0][j] = Mc[0][j-1] + M[0][j];
        }
        for(int i=1;i<d1.length;i++) {
            for(int j=1;j<d2.length;j++) {
                Mc[i][j] = Min(Mc[i-1][j],Mc[i][j-1],Mc[i-1][j-1])+M[i][j];
            }
        }
        //累积距离矩阵输出测试
        for(int i=0;i<d1.length;i++) {
            for(int j=0;j<d2.length;j++) {
                System.out.print(Mc[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------");
        System.out.println(Mc[d1.length-1][d2.length-1]);
        return Mc[d1.length-1][d2.length-1];
    }

}
