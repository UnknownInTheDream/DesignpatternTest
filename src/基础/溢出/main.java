package 基础.溢出;

/**
 * @author: TangLiang
 * @date: 2021/7/13 21:18
 * @since: 1.0
 */
public class main {
    public static void main(String[] args) {
        //long（长整型）的数据范围：-9223372036854775808——9223372036854775807；
        //int（整型）的数据范围：-2147483648——2147483647；

        //数据溢出就是：当某一种类型的数值已经达到了此类型能够保存的最大值之后，再继续扩大，或者达到了最小值后再继续缩小，就会出现数据溢出问题
        int a = 2147483647;//定义一个int型变量a的值为int型能够保存的最高值
        System.out.println(a + 1);

        //解决方案：
        //我们已经知道，在整型中，能够保存的数值范围最大的是long型；在浮点型中，能够保存的数值范围最大的是double型。
        // 所以在遇到数据溢出问题时，我们可以先把能够保存的数值范围少的类型转换为多的类型，再进行运算。

//        int a = 2147483647;//定义一个int型变量a的值为int型能够保存的最大值
//        long b = (long)a;//因为我们要在最大值的基础上继续增加数字，所以要先进行数据转换
//        System.out.println(b+2);

        //需要注意的是，数值保存范围小的类型与数值保存范围大的数据类型进行数学计算时，得到的结果是数值保存范围大的数据类型。
    }

}
