package com.offcn.pay.impl;

import com.offcn.pay.PayService;

import java.util.Map;

public class PayServiceImpl implements PayService {
    @Override
    public void createNative(String out_trade_no, String price) {
        System.out.printf("预下单操作代码");
    }

    @Override
    public Map queryStatus(String out_trade_no) {
        System.out.printf("查询交易状态代码");
        return null;
    }
}
