package test4ApacheCommonsMath;


import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;
import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;

/**
 * @author by woyuan  2023/1/12
 */
public class test4Chazhi {
    public static void main(String[] args) {
        double x[] = { 0.0, 1.0, 2.0 };
        double y[] = { 1.0, -1.0, 2.0};
        UnivariateInterpolator interpolator = new SplineInterpolator();
        UnivariateFunction function = interpolator.interpolate(x, y);
        double interpolationX = 0.5;
//        double interpolatedY = function.value(x);
//        System.out.println("f(" + interpolationX + ") = " + interpolatedY);
        }
}
