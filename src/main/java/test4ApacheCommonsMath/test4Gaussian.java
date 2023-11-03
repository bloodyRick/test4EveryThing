package test4ApacheCommonsMath;

import org.apache.commons.math3.fitting.GaussianCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;

import java.util.Random;

/**
 * @author by woyuan  2023/1/12
 */
public class test4Gaussian {
    public static void main(String[] args) {

//        Random r = new Random();
//        for (int i = 0; i < 1000; i++) {
//            double v = r.nextGaussian() * Math.sqrt(10);
//            System.out.println(v);
//        }
        WeightedObservedPoints obs = new WeightedObservedPoints();
        obs.add(0, 25);
        obs.add(1, 68);
        obs.add(2, 144);
        obs.add(3, 220);
        obs.add(4, 355);
        obs.add(5, 199);
        obs.add(6, 52);
        obs.add(7, 14);
        obs.add(8, 5);
        obs.add(9, 2);
        double[] parameters = GaussianCurveFitter.create().fit(obs.toList());
//        306.55896668204457    拟合之后，最大值
//        3.7523034567351123    数学期望
//        1.3460605495244178    标准差
        //https://www.bbsmax.com/A/QV5Z4k6bzy/
        //3σ原则为：数值分布在（μ-σ,μ+σ)中的概率为0.6826 数值分布在（μ-2σ,μ+2σ)中的概率为0.9545 数值分布在（μ-3σ,μ+3σ)中的概率为0.9973

        for (double i : parameters) {
            System.out.println(i);
        }
    }


}
