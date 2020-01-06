package com.rongflag.structural.facade;

public class QualifyService {

    public boolean isAvailable(PointsGift pointGift){
        System.out.println("兑换礼物：" + pointGift.getName() +" 积分通过   各种验证通过");
        return  true;
    }
}
