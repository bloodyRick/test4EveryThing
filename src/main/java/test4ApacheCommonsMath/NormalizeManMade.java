package test4ApacheCommonsMath;

import com.google.common.collect.Lists;
import org.apache.commons.math3.analysis.function.Max;
import org.apache.commons.math3.analysis.function.Min;
import org.apache.commons.math3.stat.StatUtils;

import java.util.List;

/**
 * @author by woyuan  2023/1/12
 */
public class NormalizeManMade {
    public static void main(String[] args) {
        double[] input = {1,2,3,4,5,6,4,3,1,2,4,1,23};

        //均值为0，标准差为1的归一化
        double[] result = StatUtils.normalize(input);
        // -1.3 -0.8 -0.26 0.26 0.81 1.3

        //线性归一化，将数据落在（0，1）之间

//        StatUtils.normalize()
        System.out.println();
    }

}
