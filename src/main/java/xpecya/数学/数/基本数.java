package xpecya.数学.数;

/**
 * 所有数的基类
 * 包含所有类型的数据都要支持的运算
 *
 * 所有互为逆运算的计算, 可以保证两次调用后的结果
 * equals最初的自己
 *
 * 即 this.加(that).减(that).equals(this)   -> true
 * this.乘(that).除(that).equals(this)      -> true
 *
 * 以此类推
 */
public abstract class 基本数 {

    /**
     * 加法运算 与减法互为逆运算
     * @param 另一个数 另一个数
     * @return 相加后结果
     */
    public abstract 基本数 加(基本数 另一个数);

    /**
     * 减法运算 被减数是this 减数是入参
     * @param 另一个数 另一个数
     * @return 相减后结果
     */
    public abstract 基本数 减(基本数 另一个数);

    /**
     * 乘法运算
     * @param 另一个数 另一个数
     * @return 乘法运算结果
     */
    public abstract 基本数 乘(基本数 另一个数);

    /**
     * 除法运算 被除数是this 除数是另一个数
     * @param 另一个数 另一个数
     * @return 除法运算结果
     */
    public abstract 基本数 除(基本数 另一个数);

    /**
     * 乘方运算 相当于 this ^ 另一个数
     * @param 另一个数 另一个数
     * @return 乘方运算结果
     */
    public abstract 基本数 乘方(基本数 另一个数);

    /**
     * 开方运算 乘方运算的逆运算
     * 根号内的是自己 根号外的是另一个数
     * @param 另一个数 另一个数
     * @return 开方运算结果
     */
    public abstract 基本数 开方(基本数 另一个数);
}
