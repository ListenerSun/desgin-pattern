package com.sqt.desgin.bridge;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:59
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new HuoQiAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank1 = new ICBCBank(new SiQiAccount());
        Account icbcAccount1 = icbcBank1.openAccount();
        icbcAccount1.showAccountType();


        Bank abcBank = new ABCBank(new HuoQiAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

    }
}
