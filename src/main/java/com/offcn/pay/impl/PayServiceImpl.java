package com.offcn.pay.impl;

import com.offcn.pay.PayService;

import java.util.Map;

public class PayServiceImpl implements PayService {
    @Override
    public void createNative(String out_trade_no, String price) {
        //小张修改代码
        for (int i = 0; i <100 ; i++) {
            System.out.printf("预下单操作代码");

			//小丽修改代码
            System.out.printf("小丽要做：：预下单操作代码");
        }

    }

    @Override
    public Map queryStatus(String out_trade_no) {
        //小张修改代码
        if(out_trade_no!=null) {
            System.out.printf("查询交易状态代码");
        }

		//小丽修改代码
            System.out.printf("小丽要做：：查询订单状态操作代码");
        return null;
    }
}
