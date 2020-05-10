package cn.tx.demo3;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public interface AccountDao {

    /**
     * 付款
     * @param out
     * @param money
     */
    public void outMoney(String out, double money);

    /**
     * 收款
     * @param in
     * @param money
     */
    public void inMoney(String in, double money);

}
