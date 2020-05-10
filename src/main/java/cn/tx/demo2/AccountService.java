package cn.tx.demo2;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public interface AccountService {

    /**
     * 转账的方法
     * @param out       付款人
     * @param in        收款人
     * @param money     金额
     */
    public void pay(String out,String in,double money);

}
