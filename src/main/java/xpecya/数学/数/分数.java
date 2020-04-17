package xpecya.数学.数;

/**
 * 表示一个分数
 * 一个分数可以由两个整数表示
 * 一个是分母 一个是分子
 */
public class 分数 extends 有理数 {

    private 整数 分子;
    private 整数 分母;

    public 分数(整数 分子, 整数 分母) {
        this.分子 = 分子;
        this.分母 = 分母;
    }

    @Override
    public 基本数 加(基本数 另一个数) {
        return null;
    }

    @Override
    public 基本数 减(基本数 另一个数) {
        return null;
    }

    @Override
    public 基本数 乘(基本数 另一个数) {
        return null;
    }

    @Override
    public 基本数 除(基本数 另一个数) {
        return null;
    }

    @Override
    public 基本数 乘方(基本数 另一个数) {
        return null;
    }

    @Override
    public 基本数 开方(基本数 另一个数) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
