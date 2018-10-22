package com.one.app;

import com.one.api.User;
import com.one.util.StringUtil;

/**
 * @author One
 * @description
 * @date 2018/10/22
 */
public class App {
    public static void main(String[] args) {

        User user  = new User();
        boolean notBank = StringUtil.isNotBank(user.getName());
        System.out.println(notBank);
        user.setName("one");
        System.out.println(user.hasName());
    }
}
