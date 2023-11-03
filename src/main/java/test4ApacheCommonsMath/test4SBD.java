package test4ApacheCommonsMath;

/**
 * @author by woyuan  2023/1/12
 */
public class test4SBD {
//https://zhuanlan.zhihu.com/p/136541446

//https://www.codeleading.com/article/45214760129/
//    #SBD距离算法
//    def calcSBDncc(x,y,s):
//            assert len(x)==len(y)
//    assert isinstance(s,int)
//    length_ = len(x)
//    pow_x = 0
//    pow_y = 0
//            for i in range(length_):
//    pow_x += math.pow(x[i],2)
//    pow_y += math.pow(y[i],2)
//    dist_x =math.pow(pow_x,0.5)
//    dist_y =math.pow(pow_y,0.5)
//    dist_xy = dist_x*dist_y
//            ccs = 0
//    for j in range(length_-s):
//    ccs +=  x[j+s]*y[j]
//    ncc = ccs/dist_xy
//    return ncc
//    def calcSBD(x,y,s=None):
//            assert len(x)==len(y)
//    if  s==None:
//    length_ = len(x)
//    ncc_list = []
//            for s in range(length_-1):
//            ncc_list.append(calcSBDncc(x,y,s))
//    ncc = max(ncc_list)
//    sbd = 1 - ncc
//    else:
//    ncc = calcSBDncc(x,y,s)
//    sbd = 1 - ncc
//    return sbd

    public static void main(String[] args) {

        double[] x = {1, 2, 3, 4, 5, 6};
        double[] y = {1, 2, 3, 4, 5, 6};

        int length = x.length;
        for (double v : x) {

        }


    }
}
