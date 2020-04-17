package xpecya.数学.数;

import java.math.BigDecimal;

/**
 * 表示一个整数
 * 整数是数字运算中最基本的单位
 * 基本上所有其他数的运算都会最终转化成整数的运算
 *
 * 整数的运算是这样的:
 * 对于小于Integer.MAX_VALUE的数 作为int来计算
 * 对于大于Integer.MAX_VALUE但是小于Long.MAX_VALUE的数 作为long计算
 * 对于大于Long.MAX_VALUE的数 作为BigDecimal对象来计算
 * 当BigDecimal计算效率堪忧时,进行ForkJoin处理(未来做)
 */
public class 整数 extends 有理数 {

    private static final BigDecimal Long类型上界 = new BigDecimal(Long.MAX_VALUE);
    private static final BigDecimal long类型下界 = new BigDecimal(Long.MIN_VALUE);

    private 整数 运算子;

    public 整数(int 整数) {
        this.运算子 = new int类型整数(整数);
    }

    public 整数(long 整数) {
        检查入参大小(整数);
    }

    public 整数(BigDecimal 大整数) {
        if (大整数.compareTo(Long类型上界) <= 0 && 大整数.compareTo(long类型下界) >= 0) {
            long 大整数long值 = 大整数.longValueExact();
            检查入参大小(大整数long值);
        } else {
            this.运算子 = new BigDecimal类型整数(大整数);
        }
    }

    @Override
    public 基本数 加(基本数 另一个数) {
        return 运算子.加(另一个数);
    }

    @Override
    public 基本数 减(基本数 另一个数) {
        return 运算子.减(另一个数);
    }

    @Override
    public 基本数 乘(基本数 另一个数) {
        return 运算子.乘(另一个数);
    }

    @Override
    public 基本数 除(基本数 另一个数) {
        return 运算子.除(另一个数);
    }

    @Override
    public 基本数 乘方(基本数 另一个数) {
        return 运算子.乘方(另一个数);
    }

    @Override
    public 基本数 开方(基本数 另一个数) {
        return 运算子.开方(另一个数);
    }

    public boolean 能整除(整数 另一个整数) {
        return 运算子.能整除(另一个整数);
    }

    private void 检查入参大小(long 入参) {
        if (入参 <= Integer.MAX_VALUE && 入参 >= Integer.MIN_VALUE) {
            this.运算子 = new int类型整数((int) 入参);
        } else {
            this.运算子 = new long类型整数(入参);
        }
    }

    private static class int类型整数 extends 整数 {

        private int类型整数(int 整数) {
            super(整数);
        }
    }

    private static class long类型整数 extends 整数 {

        public long类型整数(long 整数) {
            super(整数);
        }
    }

    private static class BigDecimal类型整数 extends 整数 {

        public BigDecimal类型整数(BigDecimal 大整数) {
            super(大整数);
        }
    }


}
