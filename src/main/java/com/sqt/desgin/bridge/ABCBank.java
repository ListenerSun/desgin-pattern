package com.sqt.desgin.bridge;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:52
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国 农业银行账号!");
        //要把打开账户行为委托出去,这样账户的实现类变化不需要修改此类的实现
        account.openAccount();
        return account;
    }
}
